package com.github.tornaia.cf.win.cfapi.internal;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.FunctionDescriptor;
import jdk.incubator.foreign.LibraryLookup;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;

import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_LONGLONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

final class RuntimeHelper {

    private final static CLinker LINKER = CLinker.getInstance();
    private final static ClassLoader LOADER = RuntimeHelper.class.getClassLoader();
    private final static MethodHandles.Lookup MH_LOOKUP = MethodHandles.lookup();

    private RuntimeHelper() {
    }

    static LibraryLookup[] libraries(String... libNames) {
        if (libNames.length == 0) {
            return new LibraryLookup[]{LibraryLookup.ofDefault()};
        } else {
            return Arrays.stream(libNames)
                    .map(libName -> {
                        if (libName.indexOf(File.separatorChar) != -1) {
                            return LibraryLookup.ofPath(Path.of(libName));
                        } else {
                            return LibraryLookup.ofLibrary(libName);
                        }
                    })
                    .toArray(LibraryLookup[]::new);
        }
    }

    static MemorySegment lookupGlobalVariable(LibraryLookup[] LIBRARIES, String name, MemoryLayout layout) {
        return lookup(LIBRARIES, name).map(s ->
                nonCloseableNonTransferableSegment(s.address().asSegmentRestricted(layout.byteSize())
                        .share())).orElse(null);
    }

    static MethodHandle downcallHandle(LibraryLookup[] LIBRARIES, String name, String desc, FunctionDescriptor fdesc, boolean variadic) {
        return lookup(LIBRARIES, name).map(
                addr -> {
                    MethodType mt = MethodType.fromMethodDescriptorString(desc, LOADER);
                    return variadic ?
                            VarargsInvoker.make(addr, mt, fdesc) :
                            LINKER.downcallHandle(addr, mt, fdesc);
                }).orElse(null);
    }

    static <Z> MemorySegment upcallStub(Class<Z> fi, Z z, FunctionDescriptor fdesc, String mtypeDesc) {
        try {
            MethodHandle handle = MH_LOOKUP.findVirtual(fi, "apply",
                    MethodType.fromMethodDescriptorString(mtypeDesc, LOADER));
            handle = handle.bindTo(z);
            return LINKER.upcallStub(handle, fdesc);
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }

    static MemorySegment nonCloseableNonTransferableSegment(MemorySegment seg) {
        return seg.withAccessModes(seg.accessModes() & ~MemorySegment.CLOSE & ~MemorySegment.HANDOFF);
    }

    static MemorySegment asArrayRestricted(MemoryAddress addr, MemoryLayout layout, int numElements) {
        return nonCloseableSegment(addr.asSegmentRestricted(numElements * layout.byteSize()));
    }

    // Internals only below this point
    private static MemorySegment nonCloseableSegment(MemorySegment seg) {
        return seg.withAccessModes(seg.accessModes() & ~MemorySegment.CLOSE);
    }

    private static Optional<LibraryLookup.Symbol> lookup(LibraryLookup[] LIBRARIES, String sym) {
        return Stream.of(LIBRARIES)
                .flatMap(l -> l.lookup(sym).stream())
                .findFirst();
    }

    private static class VarargsInvoker {
        private static MethodHandle INVOKE_MH;
        private final Addressable symbol;
        private final MethodType varargs;
        private final FunctionDescriptor function;

        private VarargsInvoker(Addressable symbol, MethodType type, FunctionDescriptor function) {
            this.symbol = symbol;
            this.varargs = type;
            this.function = function;
        }

        static {
            try {
                INVOKE_MH = MethodHandles.lookup().findVirtual(VarargsInvoker.class, "invoke", MethodType.methodType(Object.class, Object[].class));
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }

        static MethodHandle make(Addressable symbol, MethodType type, FunctionDescriptor function) {
            VarargsInvoker invoker = new VarargsInvoker(symbol, type, function);
            return INVOKE_MH.bindTo(invoker).asCollector(Object[].class, type.parameterCount())
                    .asType(type);
        }

        private Object invoke(Object[] args) throws Throwable {
            // one trailing Object[]
            int nNamedArgs = function.argumentLayouts().size();
            assert (args.length == nNamedArgs + 1);
            // The last argument is the array of vararg collector
            Object[] unnamedArgs = (Object[]) args[args.length - 1];

            int argsCount = nNamedArgs + unnamedArgs.length;
            Class<?>[] argTypes = new Class<?>[argsCount];
            MemoryLayout[] argLayouts = new MemoryLayout[nNamedArgs + unnamedArgs.length];

            int pos = 0;
            for (pos = 0; pos < nNamedArgs; pos++) {
                argTypes[pos] = varargs.parameterType(pos);
                argLayouts[pos] = function.argumentLayouts().get(pos);
            }

            assert pos == nNamedArgs;
            for (Object o : unnamedArgs) {
                argTypes[pos] = normalize(o.getClass());
                argLayouts[pos] = variadicLayout(argTypes[pos]);
                pos++;
            }
            assert pos == argsCount;

            MethodType mt = MethodType.methodType(varargs.returnType(), argTypes);
            FunctionDescriptor f = (function.returnLayout().isEmpty()) ?
                    FunctionDescriptor.ofVoid(argLayouts) :
                    FunctionDescriptor.of(function.returnLayout().get(), argLayouts);
            MethodHandle mh = LINKER.downcallHandle(symbol, mt, f);
            // flatten argument list so that it can be passed to an asSpreader MH
            Object[] allArgs = new Object[nNamedArgs + unnamedArgs.length];
            System.arraycopy(args, 0, allArgs, 0, nNamedArgs);
            System.arraycopy(unnamedArgs, 0, allArgs, nNamedArgs, unnamedArgs.length);

            return mh.asSpreader(Object[].class, argsCount).invoke(allArgs);
        }

        private static Class<?> unboxIfNeeded(Class<?> clazz) {
            if (clazz == Boolean.class) {
                return boolean.class;
            } else if (clazz == Void.class) {
                return void.class;
            } else if (clazz == Byte.class) {
                return byte.class;
            } else if (clazz == Character.class) {
                return char.class;
            } else if (clazz == Short.class) {
                return short.class;
            } else if (clazz == Integer.class) {
                return int.class;
            } else if (clazz == Long.class) {
                return long.class;
            } else if (clazz == Float.class) {
                return float.class;
            } else if (clazz == Double.class) {
                return double.class;
            } else {
                return clazz;
            }
        }

        private Class<?> promote(Class<?> c) {
            if (c == byte.class || c == char.class || c == short.class || c == int.class) {
                return long.class;
            } else if (c == float.class) {
                return double.class;
            } else {
                return c;
            }
        }

        private Class<?> normalize(Class<?> c) {
            c = unboxIfNeeded(c);
            if (c.isPrimitive()) {
                return promote(c);
            }
            if (MemoryAddress.class.isAssignableFrom(c)) {
                return MemoryAddress.class;
            }
            if (MemorySegment.class.isAssignableFrom(c)) {
                return MemorySegment.class;
            }
            throw new IllegalArgumentException("Invalid type for ABI: " + c.getTypeName());
        }

        private MemoryLayout variadicLayout(Class<?> c) {
            if (c == long.class) {
                return C_LONGLONG;
            } else if (c == double.class) {
                return C_DOUBLE;
            } else if (MemoryAddress.class.isAssignableFrom(c)) {
                return C_POINTER;
            } else {
                throw new IllegalArgumentException("Unhandled variadic argument class: " + c);
            }
        }
    }
}
