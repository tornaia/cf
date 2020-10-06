package com.github.tornaia.cf.win.processenv;

import jdk.incubator.foreign.FunctionDescriptor;
import jdk.incubator.foreign.LibraryLookup;

import java.lang.invoke.MethodHandle;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;

class processenv_h$constants$0 {

    /* package-private */ processenv_h$constants$0() {
    }

    static final LibraryLookup[] LIBRARIES = RuntimeHelper.libraries();

    static final FunctionDescriptor GetWindowsDirectoryW$FUNC_ = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_INT
    );

    static final MethodHandle GetWindowsDirectoryW$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "GetWindowsDirectoryW",
            "(Ljdk/incubator/foreign/MemoryAddress;I)I",
            GetWindowsDirectoryW$FUNC_, false
    );

    static final java.lang.invoke.MethodHandle GetWindowsDirectoryW$MH() {
        return GetWindowsDirectoryW$MH_;
    }
}

