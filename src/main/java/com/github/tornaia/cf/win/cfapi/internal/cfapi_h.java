package com.github.tornaia.cf.win.cfapi.internal;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.NativeScope;

import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_POINTER;

public class cfapi_h extends cfapi_h$28 {

    @C("struct _FLOAT128")public static class _FLOAT128 {

        /* package-private */ _FLOAT128() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$12._FLOAT128$struct$LAYOUT();
        }
        public static VarHandle LowPart$VH() {
            return cfapi_h$constants$12._FLOAT128$LowPart$VH();
        }
        public static  @C("long long") long LowPart$get(@C("struct _FLOAT128") MemorySegment seg) {
            return (long)cfapi_h$constants$12._FLOAT128$LowPart$VH().get(seg);
        }
        public static  @C("long long") long LowPart$get(@C("struct _FLOAT128") MemorySegment seg, long index) {
            return (long)cfapi_h$constants$12._FLOAT128$LowPart$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void LowPart$set(@C("struct _FLOAT128") MemorySegment seg, @C("long long") long x) {
            cfapi_h$constants$12._FLOAT128$LowPart$VH().set(seg, x);
        }
        public static void LowPart$set(@C("struct _FLOAT128") MemorySegment seg, long index, @C("long long") long x) {
            cfapi_h$constants$12._FLOAT128$LowPart$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle HighPart$VH() {
            return cfapi_h$constants$12._FLOAT128$HighPart$VH();
        }
        public static  @C("long long") long HighPart$get(@C("struct _FLOAT128") MemorySegment seg) {
            return (long)cfapi_h$constants$12._FLOAT128$HighPart$VH().get(seg);
        }
        public static  @C("long long") long HighPart$get(@C("struct _FLOAT128") MemorySegment seg, long index) {
            return (long)cfapi_h$constants$12._FLOAT128$HighPart$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void HighPart$set(@C("struct _FLOAT128") MemorySegment seg, @C("long long") long x) {
            cfapi_h$constants$12._FLOAT128$HighPart$VH().set(seg, x);
        }
        public static void HighPart$set(@C("struct _FLOAT128") MemorySegment seg, long index, @C("long long") long x) {
            cfapi_h$constants$12._FLOAT128$HighPart$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct _FLOAT128") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct _FLOAT128") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct _FLOAT128[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct _FLOAT128[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct _FLOAT128*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct _FLOAT128*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct _FLOAT128") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct _FLOAT128")public static class FLOAT128 extends _FLOAT128 {

        /* package-private */ FLOAT128() {}
    }

    @C("union _LARGE_INTEGER")public static class _LARGE_INTEGER {

        /* package-private */ _LARGE_INTEGER() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$12._LARGE_INTEGER$union$LAYOUT();
        }
        public static VarHandle LowPart$VH() {
            return cfapi_h$constants$12._LARGE_INTEGER$LowPart$VH();
        }
        public static  @C("DWORD") int LowPart$get(@C("union _LARGE_INTEGER") MemorySegment seg) {
            return (int)cfapi_h$constants$12._LARGE_INTEGER$LowPart$VH().get(seg);
        }
        public static  @C("DWORD") int LowPart$get(@C("union _LARGE_INTEGER") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$12._LARGE_INTEGER$LowPart$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void LowPart$set(@C("union _LARGE_INTEGER") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$12._LARGE_INTEGER$LowPart$VH().set(seg, x);
        }
        public static void LowPart$set(@C("union _LARGE_INTEGER") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$12._LARGE_INTEGER$LowPart$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle HighPart$VH() {
            return cfapi_h$constants$12._LARGE_INTEGER$HighPart$VH();
        }
        public static  @C("LONG") int HighPart$get(@C("union _LARGE_INTEGER") MemorySegment seg) {
            return (int)cfapi_h$constants$12._LARGE_INTEGER$HighPart$VH().get(seg);
        }
        public static  @C("LONG") int HighPart$get(@C("union _LARGE_INTEGER") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$12._LARGE_INTEGER$HighPart$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void HighPart$set(@C("union _LARGE_INTEGER") MemorySegment seg, @C("LONG") int x) {
            cfapi_h$constants$12._LARGE_INTEGER$HighPart$VH().set(seg, x);
        }
        public static void HighPart$set(@C("union _LARGE_INTEGER") MemorySegment seg, long index, @C("LONG") int x) {
            cfapi_h$constants$12._LARGE_INTEGER$HighPart$VH().set(seg.asSlice(index*sizeof()), x);
        }
        @C("struct ")public static class u {

            /* package-private */ u() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$12._LARGE_INTEGER$u$struct$LAYOUT();
            }
            public static VarHandle LowPart$VH() {
                return cfapi_h$constants$12._LARGE_INTEGER$u$LowPart$VH();
            }
            public static  @C("DWORD") int LowPart$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$12._LARGE_INTEGER$u$LowPart$VH().get(seg);
            }
            public static  @C("DWORD") int LowPart$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$12._LARGE_INTEGER$u$LowPart$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void LowPart$set(@C("struct ") MemorySegment seg, @C("DWORD") int x) {
                cfapi_h$constants$12._LARGE_INTEGER$u$LowPart$VH().set(seg, x);
            }
            public static void LowPart$set(@C("struct ") MemorySegment seg, long index, @C("DWORD") int x) {
                cfapi_h$constants$12._LARGE_INTEGER$u$LowPart$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle HighPart$VH() {
                return cfapi_h$constants$12._LARGE_INTEGER$u$HighPart$VH();
            }
            public static  @C("LONG") int HighPart$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$12._LARGE_INTEGER$u$HighPart$VH().get(seg);
            }
            public static  @C("LONG") int HighPart$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$12._LARGE_INTEGER$u$HighPart$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void HighPart$set(@C("struct ") MemorySegment seg, @C("LONG") int x) {
                cfapi_h$constants$12._LARGE_INTEGER$u$HighPart$VH().set(seg, x);
            }
            public static void HighPart$set(@C("struct ") MemorySegment seg, long index, @C("LONG") int x) {
                cfapi_h$constants$12._LARGE_INTEGER$u$HighPart$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment u$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(0, 8));
        }
        public static VarHandle QuadPart$VH() {
            return cfapi_h$constants$12._LARGE_INTEGER$QuadPart$VH();
        }
        public static  @C("LONGLONG") long QuadPart$get(@C("union _LARGE_INTEGER") MemorySegment seg) {
            return (long)cfapi_h$constants$12._LARGE_INTEGER$QuadPart$VH().get(seg);
        }
        public static  @C("LONGLONG") long QuadPart$get(@C("union _LARGE_INTEGER") MemorySegment seg, long index) {
            return (long)cfapi_h$constants$12._LARGE_INTEGER$QuadPart$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void QuadPart$set(@C("union _LARGE_INTEGER") MemorySegment seg, @C("LONGLONG") long x) {
            cfapi_h$constants$12._LARGE_INTEGER$QuadPart$VH().set(seg, x);
        }
        public static void QuadPart$set(@C("union _LARGE_INTEGER") MemorySegment seg, long index, @C("LONGLONG") long x) {
            cfapi_h$constants$12._LARGE_INTEGER$QuadPart$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("union _LARGE_INTEGER") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("union _LARGE_INTEGER") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("union _LARGE_INTEGER[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("union _LARGE_INTEGER[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("union _LARGE_INTEGER*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("union _LARGE_INTEGER*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("union _LARGE_INTEGER") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("union _LARGE_INTEGER")public static class LARGE_INTEGER extends _LARGE_INTEGER {

        /* package-private */ LARGE_INTEGER() {}
    }

    @C("union _ULARGE_INTEGER")public static class _ULARGE_INTEGER {

        /* package-private */ _ULARGE_INTEGER() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$12._ULARGE_INTEGER$union$LAYOUT();
        }
        public static VarHandle LowPart$VH() {
            return cfapi_h$constants$12._ULARGE_INTEGER$LowPart$VH();
        }
        public static  @C("DWORD") int LowPart$get(@C("union _ULARGE_INTEGER") MemorySegment seg) {
            return (int)cfapi_h$constants$12._ULARGE_INTEGER$LowPart$VH().get(seg);
        }
        public static  @C("DWORD") int LowPart$get(@C("union _ULARGE_INTEGER") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$12._ULARGE_INTEGER$LowPart$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void LowPart$set(@C("union _ULARGE_INTEGER") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$12._ULARGE_INTEGER$LowPart$VH().set(seg, x);
        }
        public static void LowPart$set(@C("union _ULARGE_INTEGER") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$12._ULARGE_INTEGER$LowPart$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle HighPart$VH() {
            return cfapi_h$constants$12._ULARGE_INTEGER$HighPart$VH();
        }
        public static  @C("DWORD") int HighPart$get(@C("union _ULARGE_INTEGER") MemorySegment seg) {
            return (int)cfapi_h$constants$12._ULARGE_INTEGER$HighPart$VH().get(seg);
        }
        public static  @C("DWORD") int HighPart$get(@C("union _ULARGE_INTEGER") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$12._ULARGE_INTEGER$HighPart$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void HighPart$set(@C("union _ULARGE_INTEGER") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$12._ULARGE_INTEGER$HighPart$VH().set(seg, x);
        }
        public static void HighPart$set(@C("union _ULARGE_INTEGER") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$12._ULARGE_INTEGER$HighPart$VH().set(seg.asSlice(index*sizeof()), x);
        }
        @C("struct ")public static class u {

            /* package-private */ u() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$12._ULARGE_INTEGER$u$struct$LAYOUT();
            }
            public static VarHandle LowPart$VH() {
                return cfapi_h$constants$12._ULARGE_INTEGER$u$LowPart$VH();
            }
            public static  @C("DWORD") int LowPart$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$12._ULARGE_INTEGER$u$LowPart$VH().get(seg);
            }
            public static  @C("DWORD") int LowPart$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$12._ULARGE_INTEGER$u$LowPart$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void LowPart$set(@C("struct ") MemorySegment seg, @C("DWORD") int x) {
                cfapi_h$constants$12._ULARGE_INTEGER$u$LowPart$VH().set(seg, x);
            }
            public static void LowPart$set(@C("struct ") MemorySegment seg, long index, @C("DWORD") int x) {
                cfapi_h$constants$12._ULARGE_INTEGER$u$LowPart$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle HighPart$VH() {
                return cfapi_h$constants$12._ULARGE_INTEGER$u$HighPart$VH();
            }
            public static  @C("DWORD") int HighPart$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$12._ULARGE_INTEGER$u$HighPart$VH().get(seg);
            }
            public static  @C("DWORD") int HighPart$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$12._ULARGE_INTEGER$u$HighPart$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void HighPart$set(@C("struct ") MemorySegment seg, @C("DWORD") int x) {
                cfapi_h$constants$12._ULARGE_INTEGER$u$HighPart$VH().set(seg, x);
            }
            public static void HighPart$set(@C("struct ") MemorySegment seg, long index, @C("DWORD") int x) {
                cfapi_h$constants$12._ULARGE_INTEGER$u$HighPart$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment u$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(0, 8));
        }
        public static VarHandle QuadPart$VH() {
            return cfapi_h$constants$12._ULARGE_INTEGER$QuadPart$VH();
        }
        public static  @C("ULONGLONG") long QuadPart$get(@C("union _ULARGE_INTEGER") MemorySegment seg) {
            return (long)cfapi_h$constants$12._ULARGE_INTEGER$QuadPart$VH().get(seg);
        }
        public static  @C("ULONGLONG") long QuadPart$get(@C("union _ULARGE_INTEGER") MemorySegment seg, long index) {
            return (long)cfapi_h$constants$12._ULARGE_INTEGER$QuadPart$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void QuadPart$set(@C("union _ULARGE_INTEGER") MemorySegment seg, @C("ULONGLONG") long x) {
            cfapi_h$constants$12._ULARGE_INTEGER$QuadPart$VH().set(seg, x);
        }
        public static void QuadPart$set(@C("union _ULARGE_INTEGER") MemorySegment seg, long index, @C("ULONGLONG") long x) {
            cfapi_h$constants$12._ULARGE_INTEGER$QuadPart$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("union _ULARGE_INTEGER") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("union _ULARGE_INTEGER") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("union _ULARGE_INTEGER[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("union _ULARGE_INTEGER[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("union _ULARGE_INTEGER*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("union _ULARGE_INTEGER*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("union _ULARGE_INTEGER") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("union _ULARGE_INTEGER")public static class ULARGE_INTEGER extends _ULARGE_INTEGER {

        /* package-private */ ULARGE_INTEGER() {}
    }

    @C("struct CF_CONNECTION_KEY__")public static class CF_CONNECTION_KEY__ {

        /* package-private */ CF_CONNECTION_KEY__() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_CONNECTION_KEY__$struct$LAYOUT();
        }
        public static VarHandle Internal$VH() {
            return cfapi_h$constants$99.CF_CONNECTION_KEY__$Internal$VH();
        }
        public static  @C("LONGLONG") long Internal$get(@C("struct CF_CONNECTION_KEY__") MemorySegment seg) {
            return (long)cfapi_h$constants$99.CF_CONNECTION_KEY__$Internal$VH().get(seg);
        }
        public static  @C("LONGLONG") long Internal$get(@C("struct CF_CONNECTION_KEY__") MemorySegment seg, long index) {
            return (long)cfapi_h$constants$99.CF_CONNECTION_KEY__$Internal$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void Internal$set(@C("struct CF_CONNECTION_KEY__") MemorySegment seg, @C("LONGLONG") long x) {
            cfapi_h$constants$99.CF_CONNECTION_KEY__$Internal$VH().set(seg, x);
        }
        public static void Internal$set(@C("struct CF_CONNECTION_KEY__") MemorySegment seg, long index, @C("LONGLONG") long x) {
            cfapi_h$constants$99.CF_CONNECTION_KEY__$Internal$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_CONNECTION_KEY__") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_CONNECTION_KEY__") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_CONNECTION_KEY__[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_CONNECTION_KEY__[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_CONNECTION_KEY__*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_CONNECTION_KEY__*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_CONNECTION_KEY__") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_CONNECTION_KEY__")public static class CF_CONNECTION_KEY extends CF_CONNECTION_KEY__ {

        /* package-private */ CF_CONNECTION_KEY() {}
    }

    @C("union _LARGE_INTEGER")public static class CF_TRANSFER_KEY extends _LARGE_INTEGER {

        /* package-private */ CF_TRANSFER_KEY() {}
    }

    @C("union _LARGE_INTEGER")public static class CF_REQUEST_KEY extends _LARGE_INTEGER {

        /* package-private */ CF_REQUEST_KEY() {}
    }

    @C("struct CF_FS_METADATA")public static class CF_FS_METADATA {

        /* package-private */ CF_FS_METADATA() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_FS_METADATA$struct$LAYOUT();
        }
        public static MemorySegment BasicInfo$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(0, 40));
        }
        public static MemorySegment FileSize$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(40, 8));
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_FS_METADATA") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_FS_METADATA") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_FS_METADATA[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_FS_METADATA[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_FS_METADATA*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_FS_METADATA*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_FS_METADATA") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_PLACEHOLDER_CREATE_INFO")public static class CF_PLACEHOLDER_CREATE_INFO {

        /* package-private */ CF_PLACEHOLDER_CREATE_INFO() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$struct$LAYOUT();
        }
        public static VarHandle RelativeFileName$VH() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$RelativeFileName$VH();
        }
        public static  @C("LPCWSTR") MemoryAddress RelativeFileName$get(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$RelativeFileName$VH().get(seg);
        }
        public static  @C("LPCWSTR") MemoryAddress RelativeFileName$get(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$RelativeFileName$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void RelativeFileName$set(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, @C("LPCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$RelativeFileName$VH().set(seg, x);
        }
        public static void RelativeFileName$set(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, long index, @C("LPCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$RelativeFileName$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment FsMetadata$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 48));
        }
        public static VarHandle FileIdentity$VH() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$FileIdentity$VH();
        }
        public static  @C("LPCVOID") MemoryAddress FileIdentity$get(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$FileIdentity$VH().get(seg);
        }
        public static  @C("LPCVOID") MemoryAddress FileIdentity$get(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$FileIdentity$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void FileIdentity$set(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, @C("LPCVOID") MemoryAddress x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$FileIdentity$VH().set(seg, x);
        }
        public static void FileIdentity$set(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, long index, @C("LPCVOID") MemoryAddress x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$FileIdentity$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle FileIdentityLength$VH() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$FileIdentityLength$VH();
        }
        public static  @C("DWORD") int FileIdentityLength$get(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$FileIdentityLength$VH().get(seg);
        }
        public static  @C("DWORD") int FileIdentityLength$get(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$FileIdentityLength$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void FileIdentityLength$set(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$FileIdentityLength$VH().set(seg, x);
        }
        public static void FileIdentityLength$set(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$FileIdentityLength$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Flags$VH() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$Flags$VH();
        }
        public static  @C("CF_PLACEHOLDER_CREATE_FLAGS") int Flags$get(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$Flags$VH().get(seg);
        }
        public static  @C("CF_PLACEHOLDER_CREATE_FLAGS") int Flags$get(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$Flags$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void Flags$set(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, @C("CF_PLACEHOLDER_CREATE_FLAGS") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$Flags$VH().set(seg, x);
        }
        public static void Flags$set(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, long index, @C("CF_PLACEHOLDER_CREATE_FLAGS") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$Flags$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Result$VH() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$Result$VH();
        }
        public static  @C("HRESULT") int Result$get(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$Result$VH().get(seg);
        }
        public static  @C("HRESULT") int Result$get(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$Result$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void Result$set(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, @C("HRESULT") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$Result$VH().set(seg, x);
        }
        public static void Result$set(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, long index, @C("HRESULT") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$Result$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle CreateUsn$VH() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$CreateUsn$VH();
        }
        public static  @C("USN") long CreateUsn$get(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg) {
            return (long)cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$CreateUsn$VH().get(seg);
        }
        public static  @C("USN") long CreateUsn$get(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, long index) {
            return (long)cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$CreateUsn$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void CreateUsn$set(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, @C("USN") long x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$CreateUsn$VH().set(seg, x);
        }
        public static void CreateUsn$set(@C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment seg, long index, @C("USN") long x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_INFO$CreateUsn$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_PLACEHOLDER_CREATE_INFO[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_PLACEHOLDER_CREATE_INFO[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_PLACEHOLDER_CREATE_INFO*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_PLACEHOLDER_CREATE_INFO*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_PLACEHOLDER_CREATE_INFO") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_PROCESS_INFO")public static class CF_PROCESS_INFO {

        /* package-private */ CF_PROCESS_INFO() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_PROCESS_INFO$struct$LAYOUT();
        }
        public static VarHandle StructSize$VH() {
            return cfapi_h$constants$99.CF_PROCESS_INFO$StructSize$VH();
        }
        public static  @C("DWORD") int StructSize$get(@C("struct CF_PROCESS_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PROCESS_INFO$StructSize$VH().get(seg);
        }
        public static  @C("DWORD") int StructSize$get(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PROCESS_INFO$StructSize$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void StructSize$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$StructSize$VH().set(seg, x);
        }
        public static void StructSize$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$StructSize$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle ProcessId$VH() {
            return cfapi_h$constants$99.CF_PROCESS_INFO$ProcessId$VH();
        }
        public static  @C("DWORD") int ProcessId$get(@C("struct CF_PROCESS_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PROCESS_INFO$ProcessId$VH().get(seg);
        }
        public static  @C("DWORD") int ProcessId$get(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PROCESS_INFO$ProcessId$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void ProcessId$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$ProcessId$VH().set(seg, x);
        }
        public static void ProcessId$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$ProcessId$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle ImagePath$VH() {
            return cfapi_h$constants$99.CF_PROCESS_INFO$ImagePath$VH();
        }
        public static  @C("PCWSTR") MemoryAddress ImagePath$get(@C("struct CF_PROCESS_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_PROCESS_INFO$ImagePath$VH().get(seg);
        }
        public static  @C("PCWSTR") MemoryAddress ImagePath$get(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_PROCESS_INFO$ImagePath$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void ImagePath$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$ImagePath$VH().set(seg, x);
        }
        public static void ImagePath$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$ImagePath$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle PackageName$VH() {
            return cfapi_h$constants$99.CF_PROCESS_INFO$PackageName$VH();
        }
        public static  @C("PCWSTR") MemoryAddress PackageName$get(@C("struct CF_PROCESS_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_PROCESS_INFO$PackageName$VH().get(seg);
        }
        public static  @C("PCWSTR") MemoryAddress PackageName$get(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_PROCESS_INFO$PackageName$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void PackageName$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$PackageName$VH().set(seg, x);
        }
        public static void PackageName$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$PackageName$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle ApplicationId$VH() {
            return cfapi_h$constants$99.CF_PROCESS_INFO$ApplicationId$VH();
        }
        public static  @C("PCWSTR") MemoryAddress ApplicationId$get(@C("struct CF_PROCESS_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_PROCESS_INFO$ApplicationId$VH().get(seg);
        }
        public static  @C("PCWSTR") MemoryAddress ApplicationId$get(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_PROCESS_INFO$ApplicationId$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void ApplicationId$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$ApplicationId$VH().set(seg, x);
        }
        public static void ApplicationId$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$ApplicationId$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle CommandLine$VH() {
            return cfapi_h$constants$99.CF_PROCESS_INFO$CommandLine$VH();
        }
        public static  @C("PCWSTR") MemoryAddress CommandLine$get(@C("struct CF_PROCESS_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_PROCESS_INFO$CommandLine$VH().get(seg);
        }
        public static  @C("PCWSTR") MemoryAddress CommandLine$get(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_PROCESS_INFO$CommandLine$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void CommandLine$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$CommandLine$VH().set(seg, x);
        }
        public static void CommandLine$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$CommandLine$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle SessionId$VH() {
            return cfapi_h$constants$99.CF_PROCESS_INFO$SessionId$VH();
        }
        public static  @C("DWORD") int SessionId$get(@C("struct CF_PROCESS_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PROCESS_INFO$SessionId$VH().get(seg);
        }
        public static  @C("DWORD") int SessionId$get(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PROCESS_INFO$SessionId$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void SessionId$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$SessionId$VH().set(seg, x);
        }
        public static void SessionId$set(@C("struct CF_PROCESS_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PROCESS_INFO$SessionId$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_PROCESS_INFO") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_PROCESS_INFO") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_PROCESS_INFO[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_PROCESS_INFO[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_PROCESS_INFO*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_PROCESS_INFO*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_PROCESS_INFO") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_PLATFORM_INFO")public static class CF_PLATFORM_INFO {

        /* package-private */ CF_PLATFORM_INFO() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_PLATFORM_INFO$struct$LAYOUT();
        }
        public static VarHandle BuildNumber$VH() {
            return cfapi_h$constants$99.CF_PLATFORM_INFO$BuildNumber$VH();
        }
        public static  @C("DWORD") int BuildNumber$get(@C("struct CF_PLATFORM_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PLATFORM_INFO$BuildNumber$VH().get(seg);
        }
        public static  @C("DWORD") int BuildNumber$get(@C("struct CF_PLATFORM_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PLATFORM_INFO$BuildNumber$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void BuildNumber$set(@C("struct CF_PLATFORM_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLATFORM_INFO$BuildNumber$VH().set(seg, x);
        }
        public static void BuildNumber$set(@C("struct CF_PLATFORM_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLATFORM_INFO$BuildNumber$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle RevisionNumber$VH() {
            return cfapi_h$constants$99.CF_PLATFORM_INFO$RevisionNumber$VH();
        }
        public static  @C("DWORD") int RevisionNumber$get(@C("struct CF_PLATFORM_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PLATFORM_INFO$RevisionNumber$VH().get(seg);
        }
        public static  @C("DWORD") int RevisionNumber$get(@C("struct CF_PLATFORM_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PLATFORM_INFO$RevisionNumber$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void RevisionNumber$set(@C("struct CF_PLATFORM_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLATFORM_INFO$RevisionNumber$VH().set(seg, x);
        }
        public static void RevisionNumber$set(@C("struct CF_PLATFORM_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLATFORM_INFO$RevisionNumber$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle IntegrationNumber$VH() {
            return cfapi_h$constants$99.CF_PLATFORM_INFO$IntegrationNumber$VH();
        }
        public static  @C("DWORD") int IntegrationNumber$get(@C("struct CF_PLATFORM_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PLATFORM_INFO$IntegrationNumber$VH().get(seg);
        }
        public static  @C("DWORD") int IntegrationNumber$get(@C("struct CF_PLATFORM_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PLATFORM_INFO$IntegrationNumber$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void IntegrationNumber$set(@C("struct CF_PLATFORM_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLATFORM_INFO$IntegrationNumber$VH().set(seg, x);
        }
        public static void IntegrationNumber$set(@C("struct CF_PLATFORM_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLATFORM_INFO$IntegrationNumber$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_PLATFORM_INFO") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_PLATFORM_INFO") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_PLATFORM_INFO[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_PLATFORM_INFO[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_PLATFORM_INFO*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_PLATFORM_INFO*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_PLATFORM_INFO") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_HYDRATION_POLICY")public static class CF_HYDRATION_POLICY {

        /* package-private */ CF_HYDRATION_POLICY() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_HYDRATION_POLICY$struct$LAYOUT();
        }
        public static VarHandle Primary$VH() {
            return cfapi_h$constants$99.CF_HYDRATION_POLICY$Primary$VH();
        }
        public static  @C("CF_HYDRATION_POLICY_PRIMARY_USHORT") short Primary$get(@C("struct CF_HYDRATION_POLICY") MemorySegment seg) {
            return (short)cfapi_h$constants$99.CF_HYDRATION_POLICY$Primary$VH().get(seg);
        }
        public static  @C("CF_HYDRATION_POLICY_PRIMARY_USHORT") short Primary$get(@C("struct CF_HYDRATION_POLICY") MemorySegment seg, long index) {
            return (short)cfapi_h$constants$99.CF_HYDRATION_POLICY$Primary$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void Primary$set(@C("struct CF_HYDRATION_POLICY") MemorySegment seg, @C("CF_HYDRATION_POLICY_PRIMARY_USHORT") short x) {
            cfapi_h$constants$99.CF_HYDRATION_POLICY$Primary$VH().set(seg, x);
        }
        public static void Primary$set(@C("struct CF_HYDRATION_POLICY") MemorySegment seg, long index, @C("CF_HYDRATION_POLICY_PRIMARY_USHORT") short x) {
            cfapi_h$constants$99.CF_HYDRATION_POLICY$Primary$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Modifier$VH() {
            return cfapi_h$constants$99.CF_HYDRATION_POLICY$Modifier$VH();
        }
        public static  @C("CF_HYDRATION_POLICY_MODIFIER_USHORT") short Modifier$get(@C("struct CF_HYDRATION_POLICY") MemorySegment seg) {
            return (short)cfapi_h$constants$99.CF_HYDRATION_POLICY$Modifier$VH().get(seg);
        }
        public static  @C("CF_HYDRATION_POLICY_MODIFIER_USHORT") short Modifier$get(@C("struct CF_HYDRATION_POLICY") MemorySegment seg, long index) {
            return (short)cfapi_h$constants$99.CF_HYDRATION_POLICY$Modifier$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void Modifier$set(@C("struct CF_HYDRATION_POLICY") MemorySegment seg, @C("CF_HYDRATION_POLICY_MODIFIER_USHORT") short x) {
            cfapi_h$constants$99.CF_HYDRATION_POLICY$Modifier$VH().set(seg, x);
        }
        public static void Modifier$set(@C("struct CF_HYDRATION_POLICY") MemorySegment seg, long index, @C("CF_HYDRATION_POLICY_MODIFIER_USHORT") short x) {
            cfapi_h$constants$99.CF_HYDRATION_POLICY$Modifier$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_HYDRATION_POLICY") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_HYDRATION_POLICY") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_HYDRATION_POLICY[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_HYDRATION_POLICY[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_HYDRATION_POLICY*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_HYDRATION_POLICY*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_HYDRATION_POLICY") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_POPULATION_POLICY")public static class CF_POPULATION_POLICY {

        /* package-private */ CF_POPULATION_POLICY() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_POPULATION_POLICY$struct$LAYOUT();
        }
        public static VarHandle Primary$VH() {
            return cfapi_h$constants$99.CF_POPULATION_POLICY$Primary$VH();
        }
        public static  @C("CF_POPULATION_POLICY_PRIMARY_USHORT") short Primary$get(@C("struct CF_POPULATION_POLICY") MemorySegment seg) {
            return (short)cfapi_h$constants$99.CF_POPULATION_POLICY$Primary$VH().get(seg);
        }
        public static  @C("CF_POPULATION_POLICY_PRIMARY_USHORT") short Primary$get(@C("struct CF_POPULATION_POLICY") MemorySegment seg, long index) {
            return (short)cfapi_h$constants$99.CF_POPULATION_POLICY$Primary$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void Primary$set(@C("struct CF_POPULATION_POLICY") MemorySegment seg, @C("CF_POPULATION_POLICY_PRIMARY_USHORT") short x) {
            cfapi_h$constants$99.CF_POPULATION_POLICY$Primary$VH().set(seg, x);
        }
        public static void Primary$set(@C("struct CF_POPULATION_POLICY") MemorySegment seg, long index, @C("CF_POPULATION_POLICY_PRIMARY_USHORT") short x) {
            cfapi_h$constants$99.CF_POPULATION_POLICY$Primary$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Modifier$VH() {
            return cfapi_h$constants$99.CF_POPULATION_POLICY$Modifier$VH();
        }
        public static  @C("CF_POPULATION_POLICY_MODIFIER_USHORT") short Modifier$get(@C("struct CF_POPULATION_POLICY") MemorySegment seg) {
            return (short)cfapi_h$constants$99.CF_POPULATION_POLICY$Modifier$VH().get(seg);
        }
        public static  @C("CF_POPULATION_POLICY_MODIFIER_USHORT") short Modifier$get(@C("struct CF_POPULATION_POLICY") MemorySegment seg, long index) {
            return (short)cfapi_h$constants$99.CF_POPULATION_POLICY$Modifier$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void Modifier$set(@C("struct CF_POPULATION_POLICY") MemorySegment seg, @C("CF_POPULATION_POLICY_MODIFIER_USHORT") short x) {
            cfapi_h$constants$99.CF_POPULATION_POLICY$Modifier$VH().set(seg, x);
        }
        public static void Modifier$set(@C("struct CF_POPULATION_POLICY") MemorySegment seg, long index, @C("CF_POPULATION_POLICY_MODIFIER_USHORT") short x) {
            cfapi_h$constants$99.CF_POPULATION_POLICY$Modifier$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_POPULATION_POLICY") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_POPULATION_POLICY") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_POPULATION_POLICY[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_POPULATION_POLICY[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_POPULATION_POLICY*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_POPULATION_POLICY*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_POPULATION_POLICY") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_SYNC_POLICIES")public static class CF_SYNC_POLICIES {

        /* package-private */ CF_SYNC_POLICIES() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_SYNC_POLICIES$struct$LAYOUT();
        }
        public static VarHandle StructSize$VH() {
            return cfapi_h$constants$99.CF_SYNC_POLICIES$StructSize$VH();
        }
        public static  @C("ULONG") int StructSize$get(@C("struct CF_SYNC_POLICIES") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_POLICIES$StructSize$VH().get(seg);
        }
        public static  @C("ULONG") int StructSize$get(@C("struct CF_SYNC_POLICIES") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_POLICIES$StructSize$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void StructSize$set(@C("struct CF_SYNC_POLICIES") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_POLICIES$StructSize$VH().set(seg, x);
        }
        public static void StructSize$set(@C("struct CF_SYNC_POLICIES") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_POLICIES$StructSize$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment Hydration$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(4, 4));
        }
        public static MemorySegment Population$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 4));
        }
        public static VarHandle InSync$VH() {
            return cfapi_h$constants$99.CF_SYNC_POLICIES$InSync$VH();
        }
        public static  @C("CF_INSYNC_POLICY") int InSync$get(@C("struct CF_SYNC_POLICIES") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_POLICIES$InSync$VH().get(seg);
        }
        public static  @C("CF_INSYNC_POLICY") int InSync$get(@C("struct CF_SYNC_POLICIES") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_POLICIES$InSync$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void InSync$set(@C("struct CF_SYNC_POLICIES") MemorySegment seg, @C("CF_INSYNC_POLICY") int x) {
            cfapi_h$constants$99.CF_SYNC_POLICIES$InSync$VH().set(seg, x);
        }
        public static void InSync$set(@C("struct CF_SYNC_POLICIES") MemorySegment seg, long index, @C("CF_INSYNC_POLICY") int x) {
            cfapi_h$constants$99.CF_SYNC_POLICIES$InSync$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle HardLink$VH() {
            return cfapi_h$constants$99.CF_SYNC_POLICIES$HardLink$VH();
        }
        public static  @C("CF_HARDLINK_POLICY") int HardLink$get(@C("struct CF_SYNC_POLICIES") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_POLICIES$HardLink$VH().get(seg);
        }
        public static  @C("CF_HARDLINK_POLICY") int HardLink$get(@C("struct CF_SYNC_POLICIES") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_POLICIES$HardLink$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void HardLink$set(@C("struct CF_SYNC_POLICIES") MemorySegment seg, @C("CF_HARDLINK_POLICY") int x) {
            cfapi_h$constants$99.CF_SYNC_POLICIES$HardLink$VH().set(seg, x);
        }
        public static void HardLink$set(@C("struct CF_SYNC_POLICIES") MemorySegment seg, long index, @C("CF_HARDLINK_POLICY") int x) {
            cfapi_h$constants$99.CF_SYNC_POLICIES$HardLink$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle PlaceholderManagement$VH() {
            return cfapi_h$constants$99.CF_SYNC_POLICIES$PlaceholderManagement$VH();
        }
        public static  @C("CF_PLACEHOLDER_MANAGEMENT_POLICY") int PlaceholderManagement$get(@C("struct CF_SYNC_POLICIES") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_POLICIES$PlaceholderManagement$VH().get(seg);
        }
        public static  @C("CF_PLACEHOLDER_MANAGEMENT_POLICY") int PlaceholderManagement$get(@C("struct CF_SYNC_POLICIES") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_POLICIES$PlaceholderManagement$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void PlaceholderManagement$set(@C("struct CF_SYNC_POLICIES") MemorySegment seg, @C("CF_PLACEHOLDER_MANAGEMENT_POLICY") int x) {
            cfapi_h$constants$99.CF_SYNC_POLICIES$PlaceholderManagement$VH().set(seg, x);
        }
        public static void PlaceholderManagement$set(@C("struct CF_SYNC_POLICIES") MemorySegment seg, long index, @C("CF_PLACEHOLDER_MANAGEMENT_POLICY") int x) {
            cfapi_h$constants$99.CF_SYNC_POLICIES$PlaceholderManagement$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_SYNC_POLICIES") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_SYNC_POLICIES") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_SYNC_POLICIES[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_SYNC_POLICIES[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_SYNC_POLICIES*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_SYNC_POLICIES*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_SYNC_POLICIES") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_SYNC_REGISTRATION")public static class CF_SYNC_REGISTRATION {

        /* package-private */ CF_SYNC_REGISTRATION() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_SYNC_REGISTRATION$struct$LAYOUT();
        }
        public static VarHandle StructSize$VH() {
            return cfapi_h$constants$99.CF_SYNC_REGISTRATION$StructSize$VH();
        }
        public static  @C("ULONG") int StructSize$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_REGISTRATION$StructSize$VH().get(seg);
        }
        public static  @C("ULONG") int StructSize$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_REGISTRATION$StructSize$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void StructSize$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$StructSize$VH().set(seg, x);
        }
        public static void StructSize$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$StructSize$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle ProviderName$VH() {
            return cfapi_h$constants$99.CF_SYNC_REGISTRATION$ProviderName$VH();
        }
        public static  @C("LPCWSTR") MemoryAddress ProviderName$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_SYNC_REGISTRATION$ProviderName$VH().get(seg);
        }
        public static  @C("LPCWSTR") MemoryAddress ProviderName$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_SYNC_REGISTRATION$ProviderName$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void ProviderName$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, @C("LPCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$ProviderName$VH().set(seg, x);
        }
        public static void ProviderName$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index, @C("LPCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$ProviderName$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle ProviderVersion$VH() {
            return cfapi_h$constants$99.CF_SYNC_REGISTRATION$ProviderVersion$VH();
        }
        public static  @C("LPCWSTR") MemoryAddress ProviderVersion$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_SYNC_REGISTRATION$ProviderVersion$VH().get(seg);
        }
        public static  @C("LPCWSTR") MemoryAddress ProviderVersion$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_SYNC_REGISTRATION$ProviderVersion$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void ProviderVersion$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, @C("LPCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$ProviderVersion$VH().set(seg, x);
        }
        public static void ProviderVersion$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index, @C("LPCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$ProviderVersion$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle SyncRootIdentity$VH() {
            return cfapi_h$constants$99.CF_SYNC_REGISTRATION$SyncRootIdentity$VH();
        }
        public static  @C("LPCVOID") MemoryAddress SyncRootIdentity$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_SYNC_REGISTRATION$SyncRootIdentity$VH().get(seg);
        }
        public static  @C("LPCVOID") MemoryAddress SyncRootIdentity$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_SYNC_REGISTRATION$SyncRootIdentity$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void SyncRootIdentity$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, @C("LPCVOID") MemoryAddress x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$SyncRootIdentity$VH().set(seg, x);
        }
        public static void SyncRootIdentity$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index, @C("LPCVOID") MemoryAddress x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$SyncRootIdentity$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle SyncRootIdentityLength$VH() {
            return cfapi_h$constants$99.CF_SYNC_REGISTRATION$SyncRootIdentityLength$VH();
        }
        public static  @C("DWORD") int SyncRootIdentityLength$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_REGISTRATION$SyncRootIdentityLength$VH().get(seg);
        }
        public static  @C("DWORD") int SyncRootIdentityLength$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_REGISTRATION$SyncRootIdentityLength$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void SyncRootIdentityLength$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$SyncRootIdentityLength$VH().set(seg, x);
        }
        public static void SyncRootIdentityLength$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$SyncRootIdentityLength$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle FileIdentity$VH() {
            return cfapi_h$constants$99.CF_SYNC_REGISTRATION$FileIdentity$VH();
        }
        public static  @C("LPCVOID") MemoryAddress FileIdentity$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_SYNC_REGISTRATION$FileIdentity$VH().get(seg);
        }
        public static  @C("LPCVOID") MemoryAddress FileIdentity$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_SYNC_REGISTRATION$FileIdentity$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void FileIdentity$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, @C("LPCVOID") MemoryAddress x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$FileIdentity$VH().set(seg, x);
        }
        public static void FileIdentity$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index, @C("LPCVOID") MemoryAddress x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$FileIdentity$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle FileIdentityLength$VH() {
            return cfapi_h$constants$99.CF_SYNC_REGISTRATION$FileIdentityLength$VH();
        }
        public static  @C("DWORD") int FileIdentityLength$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_REGISTRATION$FileIdentityLength$VH().get(seg);
        }
        public static  @C("DWORD") int FileIdentityLength$get(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_REGISTRATION$FileIdentityLength$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void FileIdentityLength$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$FileIdentityLength$VH().set(seg, x);
        }
        public static void FileIdentityLength$set(@C("struct CF_SYNC_REGISTRATION") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_SYNC_REGISTRATION$FileIdentityLength$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment ProviderId$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(52, 16));
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_SYNC_REGISTRATION") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_SYNC_REGISTRATION") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_SYNC_REGISTRATION[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_SYNC_REGISTRATION[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_SYNC_REGISTRATION*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_SYNC_REGISTRATION*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_SYNC_REGISTRATION") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_CALLBACK_INFO")public static class CF_CALLBACK_INFO {

        /* package-private */ CF_CALLBACK_INFO() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$struct$LAYOUT();
        }
        public static VarHandle StructSize$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$StructSize$VH();
        }
        public static  @C("DWORD") int StructSize$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_CALLBACK_INFO$StructSize$VH().get(seg);
        }
        public static  @C("DWORD") int StructSize$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_CALLBACK_INFO$StructSize$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void StructSize$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$StructSize$VH().set(seg, x);
        }
        public static void StructSize$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$StructSize$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment ConnectionKey$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 8));
        }
        public static VarHandle CallbackContext$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$CallbackContext$VH();
        }
        public static  @C("LPVOID") MemoryAddress CallbackContext$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$CallbackContext$VH().get(seg);
        }
        public static  @C("LPVOID") MemoryAddress CallbackContext$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$CallbackContext$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void CallbackContext$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("LPVOID") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$CallbackContext$VH().set(seg, x);
        }
        public static void CallbackContext$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("LPVOID") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$CallbackContext$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle VolumeGuidName$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeGuidName$VH();
        }
        public static  @C("PCWSTR") MemoryAddress VolumeGuidName$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeGuidName$VH().get(seg);
        }
        public static  @C("PCWSTR") MemoryAddress VolumeGuidName$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeGuidName$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void VolumeGuidName$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeGuidName$VH().set(seg, x);
        }
        public static void VolumeGuidName$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeGuidName$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle VolumeDosName$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeDosName$VH();
        }
        public static  @C("PCWSTR") MemoryAddress VolumeDosName$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeDosName$VH().get(seg);
        }
        public static  @C("PCWSTR") MemoryAddress VolumeDosName$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeDosName$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void VolumeDosName$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeDosName$VH().set(seg, x);
        }
        public static void VolumeDosName$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeDosName$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle VolumeSerialNumber$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeSerialNumber$VH();
        }
        public static  @C("DWORD") int VolumeSerialNumber$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeSerialNumber$VH().get(seg);
        }
        public static  @C("DWORD") int VolumeSerialNumber$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeSerialNumber$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void VolumeSerialNumber$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeSerialNumber$VH().set(seg, x);
        }
        public static void VolumeSerialNumber$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$VolumeSerialNumber$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment SyncRootFileId$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(48, 8));
        }
        public static VarHandle SyncRootIdentity$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$SyncRootIdentity$VH();
        }
        public static  @C("LPCVOID") MemoryAddress SyncRootIdentity$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$SyncRootIdentity$VH().get(seg);
        }
        public static  @C("LPCVOID") MemoryAddress SyncRootIdentity$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$SyncRootIdentity$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void SyncRootIdentity$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("LPCVOID") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$SyncRootIdentity$VH().set(seg, x);
        }
        public static void SyncRootIdentity$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("LPCVOID") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$SyncRootIdentity$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle SyncRootIdentityLength$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$SyncRootIdentityLength$VH();
        }
        public static  @C("DWORD") int SyncRootIdentityLength$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_CALLBACK_INFO$SyncRootIdentityLength$VH().get(seg);
        }
        public static  @C("DWORD") int SyncRootIdentityLength$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_CALLBACK_INFO$SyncRootIdentityLength$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void SyncRootIdentityLength$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$SyncRootIdentityLength$VH().set(seg, x);
        }
        public static void SyncRootIdentityLength$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$SyncRootIdentityLength$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment FileId$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(72, 8));
        }
        public static MemorySegment FileSize$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(80, 8));
        }
        public static VarHandle FileIdentity$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$FileIdentity$VH();
        }
        public static  @C("LPCVOID") MemoryAddress FileIdentity$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$FileIdentity$VH().get(seg);
        }
        public static  @C("LPCVOID") MemoryAddress FileIdentity$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$FileIdentity$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void FileIdentity$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("LPCVOID") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$FileIdentity$VH().set(seg, x);
        }
        public static void FileIdentity$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("LPCVOID") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$FileIdentity$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle FileIdentityLength$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$FileIdentityLength$VH();
        }
        public static  @C("DWORD") int FileIdentityLength$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_CALLBACK_INFO$FileIdentityLength$VH().get(seg);
        }
        public static  @C("DWORD") int FileIdentityLength$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_CALLBACK_INFO$FileIdentityLength$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void FileIdentityLength$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$FileIdentityLength$VH().set(seg, x);
        }
        public static void FileIdentityLength$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$FileIdentityLength$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle NormalizedPath$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$NormalizedPath$VH();
        }
        public static  @C("PCWSTR") MemoryAddress NormalizedPath$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$NormalizedPath$VH().get(seg);
        }
        public static  @C("PCWSTR") MemoryAddress NormalizedPath$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$NormalizedPath$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void NormalizedPath$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$NormalizedPath$VH().set(seg, x);
        }
        public static void NormalizedPath$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$NormalizedPath$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment TransferKey$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(112, 8));
        }
        public static VarHandle PriorityHint$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$PriorityHint$VH();
        }
        public static  @C("UCHAR") byte PriorityHint$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (byte)cfapi_h$constants$99.CF_CALLBACK_INFO$PriorityHint$VH().get(seg);
        }
        public static  @C("UCHAR") byte PriorityHint$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (byte)cfapi_h$constants$99.CF_CALLBACK_INFO$PriorityHint$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void PriorityHint$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("UCHAR") byte x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$PriorityHint$VH().set(seg, x);
        }
        public static void PriorityHint$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("UCHAR") byte x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$PriorityHint$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle CorrelationVector$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$CorrelationVector$VH();
        }
        public static  @C("PCORRELATION_VECTOR") MemoryAddress CorrelationVector$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$CorrelationVector$VH().get(seg);
        }
        public static  @C("PCORRELATION_VECTOR") MemoryAddress CorrelationVector$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$CorrelationVector$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void CorrelationVector$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("PCORRELATION_VECTOR") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$CorrelationVector$VH().set(seg, x);
        }
        public static void CorrelationVector$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("PCORRELATION_VECTOR") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$CorrelationVector$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle ProcessInfo$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_INFO$ProcessInfo$VH();
        }
        public static  @C("CF_PROCESS_INFO*") MemoryAddress ProcessInfo$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$ProcessInfo$VH().get(seg);
        }
        public static  @C("CF_PROCESS_INFO*") MemoryAddress ProcessInfo$get(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_INFO$ProcessInfo$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void ProcessInfo$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, @C("CF_PROCESS_INFO*") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$ProcessInfo$VH().set(seg, x);
        }
        public static void ProcessInfo$set(@C("struct CF_CALLBACK_INFO") MemorySegment seg, long index, @C("CF_PROCESS_INFO*") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_INFO$ProcessInfo$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment RequestKey$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(144, 8));
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_CALLBACK_INFO") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_CALLBACK_INFO") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_CALLBACK_INFO[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_CALLBACK_INFO[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_CALLBACK_INFO*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_CALLBACK_INFO*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_CALLBACK_INFO") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_CALLBACK_PARAMETERS")public static class CF_CALLBACK_PARAMETERS {

        /* package-private */ CF_CALLBACK_PARAMETERS() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$struct$LAYOUT();
        }
        public static VarHandle ParamSize$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$ParamSize$VH();
        }
        public static  @C("ULONG") int ParamSize$get(@C("struct CF_CALLBACK_PARAMETERS") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$ParamSize$VH().get(seg);
        }
        public static  @C("ULONG") int ParamSize$get(@C("struct CF_CALLBACK_PARAMETERS") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$ParamSize$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void ParamSize$set(@C("struct CF_CALLBACK_PARAMETERS") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$ParamSize$VH().set(seg, x);
        }
        public static void ParamSize$set(@C("struct CF_CALLBACK_PARAMETERS") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$ParamSize$VH().set(seg.asSlice(index*sizeof()), x);
        }
        @C("struct ")public static class Cancel {

            /* package-private */ Cancel() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Cancel$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Cancel$Flags$VH();
            }
            public static  @C("CF_CALLBACK_CANCEL_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Cancel$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_CANCEL_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Cancel$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_CANCEL_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Cancel$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_CANCEL_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Cancel$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            @C("struct ")public static class FetchData {

                /* package-private */ FetchData() {}
                public static MemoryLayout $LAYOUT() {
                    return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Cancel$FetchData$struct$LAYOUT();
                }
                public static MemorySegment FileOffset$slice(MemorySegment seg) {
                    return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(0, 8));
                }
                public static MemorySegment Length$slice(MemorySegment seg) {
                    return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 8));
                }
                public static long sizeof() { return $LAYOUT().byteSize(); }
                public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
                public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
                public static @C("struct []") MemorySegment allocateArray(int len) {
                    return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
                }                public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                    return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
                }
                public static @C("struct *") MemorySegment allocatePointer() {
                    return MemorySegment.allocateNative(C_POINTER);
                }
                public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                    return scope.allocate(C_POINTER);
                }
                public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
            }

            public static MemorySegment FetchData$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 16));
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment Cancel$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 24));
        }
        @C("struct ")public static class FetchData {

            /* package-private */ FetchData() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchData$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchData$Flags$VH();
            }
            public static  @C("CF_CALLBACK_FETCH_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchData$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_FETCH_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchData$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_FETCH_DATA_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchData$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_FETCH_DATA_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchData$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment RequiredFileOffset$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 8));
            }
            public static MemorySegment RequiredLength$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(16, 8));
            }
            public static MemorySegment OptionalFileOffset$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(24, 8));
            }
            public static MemorySegment OptionalLength$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(32, 8));
            }
            public static MemorySegment LastDehydrationTime$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(40, 8));
            }
            public static VarHandle LastDehydrationReason$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchData$LastDehydrationReason$VH();
            }
            public static  @C("CF_CALLBACK_DEHYDRATION_REASON") int LastDehydrationReason$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchData$LastDehydrationReason$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DEHYDRATION_REASON") int LastDehydrationReason$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchData$LastDehydrationReason$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void LastDehydrationReason$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DEHYDRATION_REASON") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchData$LastDehydrationReason$VH().set(seg, x);
            }
            public static void LastDehydrationReason$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DEHYDRATION_REASON") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchData$LastDehydrationReason$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment FetchData$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(32, 56));
        }
        @C("struct ")public static class ValidateData {

            /* package-private */ ValidateData() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$ValidateData$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$ValidateData$Flags$VH();
            }
            public static  @C("CF_CALLBACK_VALIDATE_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$ValidateData$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_VALIDATE_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$ValidateData$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_VALIDATE_DATA_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$ValidateData$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_VALIDATE_DATA_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$ValidateData$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment RequiredFileOffset$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 8));
            }
            public static MemorySegment RequiredLength$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(16, 8));
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment ValidateData$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(88, 24));
        }
        @C("struct ")public static class FetchPlaceholders {

            /* package-private */ FetchPlaceholders() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchPlaceholders$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchPlaceholders$Flags$VH();
            }
            public static  @C("CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchPlaceholders$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchPlaceholders$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchPlaceholders$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchPlaceholders$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle Pattern$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchPlaceholders$Pattern$VH();
            }
            public static  @C("PCWSTR") MemoryAddress Pattern$get(@C("struct ") MemorySegment seg) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchPlaceholders$Pattern$VH().get(seg);
            }
            public static  @C("PCWSTR") MemoryAddress Pattern$get(@C("struct ") MemorySegment seg, long index) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchPlaceholders$Pattern$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Pattern$set(@C("struct ") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchPlaceholders$Pattern$VH().set(seg, x);
            }
            public static void Pattern$set(@C("struct ") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$FetchPlaceholders$Pattern$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment FetchPlaceholders$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(112, 16));
        }
        @C("struct ")public static class OpenCompletion {

            /* package-private */ OpenCompletion() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$OpenCompletion$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$OpenCompletion$Flags$VH();
            }
            public static  @C("CF_CALLBACK_OPEN_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$OpenCompletion$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_OPEN_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$OpenCompletion$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_OPEN_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$OpenCompletion$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_OPEN_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$OpenCompletion$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment OpenCompletion$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(128, 4));
        }
        @C("struct ")public static class CloseCompletion {

            /* package-private */ CloseCompletion() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$CloseCompletion$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$CloseCompletion$Flags$VH();
            }
            public static  @C("CF_CALLBACK_CLOSE_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$CloseCompletion$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_CLOSE_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$CloseCompletion$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_CLOSE_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$CloseCompletion$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_CLOSE_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$CloseCompletion$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment CloseCompletion$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(132, 4));
        }
        @C("struct ")public static class Dehydrate {

            /* package-private */ Dehydrate() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Dehydrate$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Dehydrate$Flags$VH();
            }
            public static  @C("CF_CALLBACK_DEHYDRATE_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Dehydrate$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DEHYDRATE_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Dehydrate$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DEHYDRATE_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Dehydrate$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DEHYDRATE_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Dehydrate$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle Reason$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Dehydrate$Reason$VH();
            }
            public static  @C("CF_CALLBACK_DEHYDRATION_REASON") int Reason$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Dehydrate$Reason$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DEHYDRATION_REASON") int Reason$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Dehydrate$Reason$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Reason$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DEHYDRATION_REASON") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Dehydrate$Reason$VH().set(seg, x);
            }
            public static void Reason$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DEHYDRATION_REASON") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Dehydrate$Reason$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment Dehydrate$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(136, 8));
        }
        @C("struct ")public static class DehydrateCompletion {

            /* package-private */ DehydrateCompletion() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DehydrateCompletion$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DehydrateCompletion$Flags$VH();
            }
            public static  @C("CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DehydrateCompletion$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DehydrateCompletion$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DehydrateCompletion$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DehydrateCompletion$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle Reason$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DehydrateCompletion$Reason$VH();
            }
            public static  @C("CF_CALLBACK_DEHYDRATION_REASON") int Reason$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DehydrateCompletion$Reason$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DEHYDRATION_REASON") int Reason$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DehydrateCompletion$Reason$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Reason$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DEHYDRATION_REASON") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DehydrateCompletion$Reason$VH().set(seg, x);
            }
            public static void Reason$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DEHYDRATION_REASON") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DehydrateCompletion$Reason$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment DehydrateCompletion$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(144, 8));
        }
        @C("struct ")public static class Delete {

            /* package-private */ Delete() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Delete$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Delete$Flags$VH();
            }
            public static  @C("CF_CALLBACK_DELETE_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Delete$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DELETE_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Delete$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DELETE_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Delete$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DELETE_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Delete$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment Delete$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(152, 4));
        }
        @C("struct ")public static class DeleteCompletion {

            /* package-private */ DeleteCompletion() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DeleteCompletion$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DeleteCompletion$Flags$VH();
            }
            public static  @C("CF_CALLBACK_DELETE_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DeleteCompletion$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DELETE_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DeleteCompletion$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DELETE_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DeleteCompletion$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DELETE_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$DeleteCompletion$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment DeleteCompletion$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(156, 4));
        }
        @C("struct ")public static class Rename {

            /* package-private */ Rename() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Rename$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Rename$Flags$VH();
            }
            public static  @C("CF_CALLBACK_RENAME_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Rename$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_RENAME_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Rename$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_RENAME_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Rename$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_RENAME_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Rename$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle TargetPath$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Rename$TargetPath$VH();
            }
            public static  @C("PCWSTR") MemoryAddress TargetPath$get(@C("struct ") MemorySegment seg) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Rename$TargetPath$VH().get(seg);
            }
            public static  @C("PCWSTR") MemoryAddress TargetPath$get(@C("struct ") MemorySegment seg, long index) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Rename$TargetPath$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void TargetPath$set(@C("struct ") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Rename$TargetPath$VH().set(seg, x);
            }
            public static void TargetPath$set(@C("struct ") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$Rename$TargetPath$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment Rename$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(160, 16));
        }
        @C("struct ")public static class RenameCompletion {

            /* package-private */ RenameCompletion() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$RenameCompletion$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$RenameCompletion$Flags$VH();
            }
            public static  @C("CF_CALLBACK_RENAME_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$RenameCompletion$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_RENAME_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$RenameCompletion$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_RENAME_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$RenameCompletion$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_RENAME_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$RenameCompletion$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle SourcePath$VH() {
                return cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$RenameCompletion$SourcePath$VH();
            }
            public static  @C("PCWSTR") MemoryAddress SourcePath$get(@C("struct ") MemorySegment seg) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$RenameCompletion$SourcePath$VH().get(seg);
            }
            public static  @C("PCWSTR") MemoryAddress SourcePath$get(@C("struct ") MemorySegment seg, long index) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$RenameCompletion$SourcePath$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void SourcePath$set(@C("struct ") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$RenameCompletion$SourcePath$VH().set(seg, x);
            }
            public static void SourcePath$set(@C("struct ") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
                cfapi_h$constants$99.CF_CALLBACK_PARAMETERS$RenameCompletion$SourcePath$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment RenameCompletion$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(176, 16));
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_CALLBACK_PARAMETERS") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_CALLBACK_PARAMETERS") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_CALLBACK_PARAMETERS[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_CALLBACK_PARAMETERS[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_CALLBACK_PARAMETERS*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_CALLBACK_PARAMETERS*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_CALLBACK_PARAMETERS") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_CALLBACK_REGISTRATION")public static class CF_CALLBACK_REGISTRATION {

        /* package-private */ CF_CALLBACK_REGISTRATION() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_CALLBACK_REGISTRATION$struct$LAYOUT();
        }
        public static VarHandle Type$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_REGISTRATION$Type$VH();
        }
        public static  @C("CF_CALLBACK_TYPE") int Type$get(@C("struct CF_CALLBACK_REGISTRATION") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_CALLBACK_REGISTRATION$Type$VH().get(seg);
        }
        public static  @C("CF_CALLBACK_TYPE") int Type$get(@C("struct CF_CALLBACK_REGISTRATION") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_CALLBACK_REGISTRATION$Type$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void Type$set(@C("struct CF_CALLBACK_REGISTRATION") MemorySegment seg, @C("CF_CALLBACK_TYPE") int x) {
            cfapi_h$constants$99.CF_CALLBACK_REGISTRATION$Type$VH().set(seg, x);
        }
        public static void Type$set(@C("struct CF_CALLBACK_REGISTRATION") MemorySegment seg, long index, @C("CF_CALLBACK_TYPE") int x) {
            cfapi_h$constants$99.CF_CALLBACK_REGISTRATION$Type$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Callback$VH() {
            return cfapi_h$constants$99.CF_CALLBACK_REGISTRATION$Callback$VH();
        }
        public static  @C("CF_CALLBACK") MemoryAddress Callback$get(@C("struct CF_CALLBACK_REGISTRATION") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_REGISTRATION$Callback$VH().get(seg);
        }
        public static  @C("CF_CALLBACK") MemoryAddress Callback$get(@C("struct CF_CALLBACK_REGISTRATION") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_CALLBACK_REGISTRATION$Callback$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void Callback$set(@C("struct CF_CALLBACK_REGISTRATION") MemorySegment seg, @C("CF_CALLBACK") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_REGISTRATION$Callback$VH().set(seg, x);
        }
        public static void Callback$set(@C("struct CF_CALLBACK_REGISTRATION") MemorySegment seg, long index, @C("CF_CALLBACK") MemoryAddress x) {
            cfapi_h$constants$99.CF_CALLBACK_REGISTRATION$Callback$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_CALLBACK_REGISTRATION") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_CALLBACK_REGISTRATION") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_CALLBACK_REGISTRATION[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_CALLBACK_REGISTRATION[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_CALLBACK_REGISTRATION*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_CALLBACK_REGISTRATION*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_CALLBACK_REGISTRATION") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_SYNC_STATUS")public static class CF_SYNC_STATUS {

        /* package-private */ CF_SYNC_STATUS() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_SYNC_STATUS$struct$LAYOUT();
        }
        public static VarHandle StructSize$VH() {
            return cfapi_h$constants$99.CF_SYNC_STATUS$StructSize$VH();
        }
        public static  @C("ULONG") int StructSize$get(@C("struct CF_SYNC_STATUS") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_STATUS$StructSize$VH().get(seg);
        }
        public static  @C("ULONG") int StructSize$get(@C("struct CF_SYNC_STATUS") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_STATUS$StructSize$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void StructSize$set(@C("struct CF_SYNC_STATUS") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_STATUS$StructSize$VH().set(seg, x);
        }
        public static void StructSize$set(@C("struct CF_SYNC_STATUS") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_STATUS$StructSize$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Code$VH() {
            return cfapi_h$constants$99.CF_SYNC_STATUS$Code$VH();
        }
        public static  @C("ULONG") int Code$get(@C("struct CF_SYNC_STATUS") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_STATUS$Code$VH().get(seg);
        }
        public static  @C("ULONG") int Code$get(@C("struct CF_SYNC_STATUS") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_STATUS$Code$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void Code$set(@C("struct CF_SYNC_STATUS") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_STATUS$Code$VH().set(seg, x);
        }
        public static void Code$set(@C("struct CF_SYNC_STATUS") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_STATUS$Code$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle DescriptionOffset$VH() {
            return cfapi_h$constants$99.CF_SYNC_STATUS$DescriptionOffset$VH();
        }
        public static  @C("ULONG") int DescriptionOffset$get(@C("struct CF_SYNC_STATUS") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_STATUS$DescriptionOffset$VH().get(seg);
        }
        public static  @C("ULONG") int DescriptionOffset$get(@C("struct CF_SYNC_STATUS") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_STATUS$DescriptionOffset$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void DescriptionOffset$set(@C("struct CF_SYNC_STATUS") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_STATUS$DescriptionOffset$VH().set(seg, x);
        }
        public static void DescriptionOffset$set(@C("struct CF_SYNC_STATUS") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_STATUS$DescriptionOffset$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle DescriptionLength$VH() {
            return cfapi_h$constants$99.CF_SYNC_STATUS$DescriptionLength$VH();
        }
        public static  @C("ULONG") int DescriptionLength$get(@C("struct CF_SYNC_STATUS") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_STATUS$DescriptionLength$VH().get(seg);
        }
        public static  @C("ULONG") int DescriptionLength$get(@C("struct CF_SYNC_STATUS") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_STATUS$DescriptionLength$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void DescriptionLength$set(@C("struct CF_SYNC_STATUS") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_STATUS$DescriptionLength$VH().set(seg, x);
        }
        public static void DescriptionLength$set(@C("struct CF_SYNC_STATUS") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_STATUS$DescriptionLength$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle DeviceIdOffset$VH() {
            return cfapi_h$constants$99.CF_SYNC_STATUS$DeviceIdOffset$VH();
        }
        public static  @C("ULONG") int DeviceIdOffset$get(@C("struct CF_SYNC_STATUS") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_STATUS$DeviceIdOffset$VH().get(seg);
        }
        public static  @C("ULONG") int DeviceIdOffset$get(@C("struct CF_SYNC_STATUS") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_STATUS$DeviceIdOffset$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void DeviceIdOffset$set(@C("struct CF_SYNC_STATUS") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_STATUS$DeviceIdOffset$VH().set(seg, x);
        }
        public static void DeviceIdOffset$set(@C("struct CF_SYNC_STATUS") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_STATUS$DeviceIdOffset$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle DeviceIdLength$VH() {
            return cfapi_h$constants$99.CF_SYNC_STATUS$DeviceIdLength$VH();
        }
        public static  @C("ULONG") int DeviceIdLength$get(@C("struct CF_SYNC_STATUS") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_SYNC_STATUS$DeviceIdLength$VH().get(seg);
        }
        public static  @C("ULONG") int DeviceIdLength$get(@C("struct CF_SYNC_STATUS") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_SYNC_STATUS$DeviceIdLength$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void DeviceIdLength$set(@C("struct CF_SYNC_STATUS") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_STATUS$DeviceIdLength$VH().set(seg, x);
        }
        public static void DeviceIdLength$set(@C("struct CF_SYNC_STATUS") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_SYNC_STATUS$DeviceIdLength$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_SYNC_STATUS") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_SYNC_STATUS") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_SYNC_STATUS[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_SYNC_STATUS[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_SYNC_STATUS*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_SYNC_STATUS*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_SYNC_STATUS") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_OPERATION_INFO")public static class CF_OPERATION_INFO {

        /* package-private */ CF_OPERATION_INFO() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_OPERATION_INFO$struct$LAYOUT();
        }
        public static VarHandle StructSize$VH() {
            return cfapi_h$constants$99.CF_OPERATION_INFO$StructSize$VH();
        }
        public static  @C("ULONG") int StructSize$get(@C("struct CF_OPERATION_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_OPERATION_INFO$StructSize$VH().get(seg);
        }
        public static  @C("ULONG") int StructSize$get(@C("struct CF_OPERATION_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_OPERATION_INFO$StructSize$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void StructSize$set(@C("struct CF_OPERATION_INFO") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_OPERATION_INFO$StructSize$VH().set(seg, x);
        }
        public static void StructSize$set(@C("struct CF_OPERATION_INFO") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_OPERATION_INFO$StructSize$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Type$VH() {
            return cfapi_h$constants$99.CF_OPERATION_INFO$Type$VH();
        }
        public static  @C("CF_OPERATION_TYPE") int Type$get(@C("struct CF_OPERATION_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_OPERATION_INFO$Type$VH().get(seg);
        }
        public static  @C("CF_OPERATION_TYPE") int Type$get(@C("struct CF_OPERATION_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_OPERATION_INFO$Type$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void Type$set(@C("struct CF_OPERATION_INFO") MemorySegment seg, @C("CF_OPERATION_TYPE") int x) {
            cfapi_h$constants$99.CF_OPERATION_INFO$Type$VH().set(seg, x);
        }
        public static void Type$set(@C("struct CF_OPERATION_INFO") MemorySegment seg, long index, @C("CF_OPERATION_TYPE") int x) {
            cfapi_h$constants$99.CF_OPERATION_INFO$Type$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment ConnectionKey$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 8));
        }
        public static MemorySegment TransferKey$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(16, 8));
        }
        public static VarHandle CorrelationVector$VH() {
            return cfapi_h$constants$99.CF_OPERATION_INFO$CorrelationVector$VH();
        }
        public static  @C("const CORRELATION_VECTOR*") MemoryAddress CorrelationVector$get(@C("struct CF_OPERATION_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_INFO$CorrelationVector$VH().get(seg);
        }
        public static  @C("const CORRELATION_VECTOR*") MemoryAddress CorrelationVector$get(@C("struct CF_OPERATION_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_INFO$CorrelationVector$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void CorrelationVector$set(@C("struct CF_OPERATION_INFO") MemorySegment seg, @C("const CORRELATION_VECTOR*") MemoryAddress x) {
            cfapi_h$constants$99.CF_OPERATION_INFO$CorrelationVector$VH().set(seg, x);
        }
        public static void CorrelationVector$set(@C("struct CF_OPERATION_INFO") MemorySegment seg, long index, @C("const CORRELATION_VECTOR*") MemoryAddress x) {
            cfapi_h$constants$99.CF_OPERATION_INFO$CorrelationVector$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle SyncStatus$VH() {
            return cfapi_h$constants$99.CF_OPERATION_INFO$SyncStatus$VH();
        }
        public static  @C("const CF_SYNC_STATUS*") MemoryAddress SyncStatus$get(@C("struct CF_OPERATION_INFO") MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_INFO$SyncStatus$VH().get(seg);
        }
        public static  @C("const CF_SYNC_STATUS*") MemoryAddress SyncStatus$get(@C("struct CF_OPERATION_INFO") MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_INFO$SyncStatus$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void SyncStatus$set(@C("struct CF_OPERATION_INFO") MemorySegment seg, @C("const CF_SYNC_STATUS*") MemoryAddress x) {
            cfapi_h$constants$99.CF_OPERATION_INFO$SyncStatus$VH().set(seg, x);
        }
        public static void SyncStatus$set(@C("struct CF_OPERATION_INFO") MemorySegment seg, long index, @C("const CF_SYNC_STATUS*") MemoryAddress x) {
            cfapi_h$constants$99.CF_OPERATION_INFO$SyncStatus$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment RequestKey$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(40, 8));
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_OPERATION_INFO") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_OPERATION_INFO") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_OPERATION_INFO[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_OPERATION_INFO[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_OPERATION_INFO*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_OPERATION_INFO*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_OPERATION_INFO") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_OPERATION_PARAMETERS")public static class CF_OPERATION_PARAMETERS {

        /* package-private */ CF_OPERATION_PARAMETERS() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$struct$LAYOUT();
        }
        public static VarHandle ParamSize$VH() {
            return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$ParamSize$VH();
        }
        public static  @C("ULONG") int ParamSize$get(@C("struct CF_OPERATION_PARAMETERS") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$ParamSize$VH().get(seg);
        }
        public static  @C("ULONG") int ParamSize$get(@C("struct CF_OPERATION_PARAMETERS") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$ParamSize$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void ParamSize$set(@C("struct CF_OPERATION_PARAMETERS") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_OPERATION_PARAMETERS$ParamSize$VH().set(seg, x);
        }
        public static void ParamSize$set(@C("struct CF_OPERATION_PARAMETERS") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_OPERATION_PARAMETERS$ParamSize$VH().set(seg.asSlice(index*sizeof()), x);
        }
        @C("struct ")public static class TransferData {

            /* package-private */ TransferData() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$Flags$VH();
            }
            public static  @C("CF_OPERATION_TRANSFER_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$Flags$VH().get(seg);
            }
            public static  @C("CF_OPERATION_TRANSFER_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_OPERATION_TRANSFER_DATA_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_OPERATION_TRANSFER_DATA_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle CompletionStatus$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$CompletionStatus$VH();
            }
            public static  @C("NTSTATUS") int CompletionStatus$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$CompletionStatus$VH().get(seg);
            }
            public static  @C("NTSTATUS") int CompletionStatus$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$CompletionStatus$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void CompletionStatus$set(@C("struct ") MemorySegment seg, @C("NTSTATUS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$CompletionStatus$VH().set(seg, x);
            }
            public static void CompletionStatus$set(@C("struct ") MemorySegment seg, long index, @C("NTSTATUS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$CompletionStatus$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle Buffer$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$Buffer$VH();
            }
            public static  @C("LPCVOID") MemoryAddress Buffer$get(@C("struct ") MemorySegment seg) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$Buffer$VH().get(seg);
            }
            public static  @C("LPCVOID") MemoryAddress Buffer$get(@C("struct ") MemorySegment seg, long index) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$Buffer$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Buffer$set(@C("struct ") MemorySegment seg, @C("LPCVOID") MemoryAddress x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$Buffer$VH().set(seg, x);
            }
            public static void Buffer$set(@C("struct ") MemorySegment seg, long index, @C("LPCVOID") MemoryAddress x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferData$Buffer$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment Offset$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(16, 8));
            }
            public static MemorySegment Length$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(24, 8));
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment TransferData$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 32));
        }
        @C("struct ")public static class RetrieveData {

            /* package-private */ RetrieveData() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RetrieveData$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RetrieveData$Flags$VH();
            }
            public static  @C("CF_OPERATION_RETRIEVE_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RetrieveData$Flags$VH().get(seg);
            }
            public static  @C("CF_OPERATION_RETRIEVE_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RetrieveData$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_OPERATION_RETRIEVE_DATA_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RetrieveData$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_OPERATION_RETRIEVE_DATA_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RetrieveData$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle Buffer$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RetrieveData$Buffer$VH();
            }
            public static  @C("LPVOID") MemoryAddress Buffer$get(@C("struct ") MemorySegment seg) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RetrieveData$Buffer$VH().get(seg);
            }
            public static  @C("LPVOID") MemoryAddress Buffer$get(@C("struct ") MemorySegment seg, long index) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RetrieveData$Buffer$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Buffer$set(@C("struct ") MemorySegment seg, @C("LPVOID") MemoryAddress x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RetrieveData$Buffer$VH().set(seg, x);
            }
            public static void Buffer$set(@C("struct ") MemorySegment seg, long index, @C("LPVOID") MemoryAddress x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RetrieveData$Buffer$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment Offset$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(16, 8));
            }
            public static MemorySegment Length$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(24, 8));
            }
            public static MemorySegment ReturnedLength$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(32, 8));
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment RetrieveData$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(40, 40));
        }
        @C("struct ")public static class AckData {

            /* package-private */ AckData() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckData$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckData$Flags$VH();
            }
            public static  @C("CF_OPERATION_ACK_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckData$Flags$VH().get(seg);
            }
            public static  @C("CF_OPERATION_ACK_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckData$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_OPERATION_ACK_DATA_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckData$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_OPERATION_ACK_DATA_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckData$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle CompletionStatus$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckData$CompletionStatus$VH();
            }
            public static  @C("NTSTATUS") int CompletionStatus$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckData$CompletionStatus$VH().get(seg);
            }
            public static  @C("NTSTATUS") int CompletionStatus$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckData$CompletionStatus$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void CompletionStatus$set(@C("struct ") MemorySegment seg, @C("NTSTATUS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckData$CompletionStatus$VH().set(seg, x);
            }
            public static void CompletionStatus$set(@C("struct ") MemorySegment seg, long index, @C("NTSTATUS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckData$CompletionStatus$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment Offset$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 8));
            }
            public static MemorySegment Length$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(16, 8));
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment AckData$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(80, 24));
        }
        @C("struct ")public static class RestartHydration {

            /* package-private */ RestartHydration() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$Flags$VH();
            }
            public static  @C("CF_OPERATION_RESTART_HYDRATION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$Flags$VH().get(seg);
            }
            public static  @C("CF_OPERATION_RESTART_HYDRATION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_OPERATION_RESTART_HYDRATION_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_OPERATION_RESTART_HYDRATION_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle FsMetadata$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FsMetadata$VH();
            }
            public static  @C("const CF_FS_METADATA*") MemoryAddress FsMetadata$get(@C("struct ") MemorySegment seg) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FsMetadata$VH().get(seg);
            }
            public static  @C("const CF_FS_METADATA*") MemoryAddress FsMetadata$get(@C("struct ") MemorySegment seg, long index) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FsMetadata$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void FsMetadata$set(@C("struct ") MemorySegment seg, @C("const CF_FS_METADATA*") MemoryAddress x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FsMetadata$VH().set(seg, x);
            }
            public static void FsMetadata$set(@C("struct ") MemorySegment seg, long index, @C("const CF_FS_METADATA*") MemoryAddress x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FsMetadata$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle FileIdentity$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FileIdentity$VH();
            }
            public static  @C("LPCVOID") MemoryAddress FileIdentity$get(@C("struct ") MemorySegment seg) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FileIdentity$VH().get(seg);
            }
            public static  @C("LPCVOID") MemoryAddress FileIdentity$get(@C("struct ") MemorySegment seg, long index) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FileIdentity$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void FileIdentity$set(@C("struct ") MemorySegment seg, @C("LPCVOID") MemoryAddress x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FileIdentity$VH().set(seg, x);
            }
            public static void FileIdentity$set(@C("struct ") MemorySegment seg, long index, @C("LPCVOID") MemoryAddress x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FileIdentity$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle FileIdentityLength$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FileIdentityLength$VH();
            }
            public static  @C("DWORD") int FileIdentityLength$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FileIdentityLength$VH().get(seg);
            }
            public static  @C("DWORD") int FileIdentityLength$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FileIdentityLength$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void FileIdentityLength$set(@C("struct ") MemorySegment seg, @C("DWORD") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FileIdentityLength$VH().set(seg, x);
            }
            public static void FileIdentityLength$set(@C("struct ") MemorySegment seg, long index, @C("DWORD") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$RestartHydration$FileIdentityLength$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment RestartHydration$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(104, 32));
        }
        @C("struct ")public static class TransferPlaceholders {

            /* package-private */ TransferPlaceholders() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$Flags$VH();
            }
            public static  @C("CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$Flags$VH().get(seg);
            }
            public static  @C("CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle CompletionStatus$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$CompletionStatus$VH();
            }
            public static  @C("NTSTATUS") int CompletionStatus$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$CompletionStatus$VH().get(seg);
            }
            public static  @C("NTSTATUS") int CompletionStatus$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$CompletionStatus$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void CompletionStatus$set(@C("struct ") MemorySegment seg, @C("NTSTATUS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$CompletionStatus$VH().set(seg, x);
            }
            public static void CompletionStatus$set(@C("struct ") MemorySegment seg, long index, @C("NTSTATUS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$CompletionStatus$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment PlaceholderTotalCount$slice(MemorySegment seg) {
                return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 8));
            }
            public static VarHandle PlaceholderArray$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderArray$VH();
            }
            public static  @C("CF_PLACEHOLDER_CREATE_INFO*") MemoryAddress PlaceholderArray$get(@C("struct ") MemorySegment seg) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderArray$VH().get(seg);
            }
            public static  @C("CF_PLACEHOLDER_CREATE_INFO*") MemoryAddress PlaceholderArray$get(@C("struct ") MemorySegment seg, long index) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderArray$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void PlaceholderArray$set(@C("struct ") MemorySegment seg, @C("CF_PLACEHOLDER_CREATE_INFO*") MemoryAddress x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderArray$VH().set(seg, x);
            }
            public static void PlaceholderArray$set(@C("struct ") MemorySegment seg, long index, @C("CF_PLACEHOLDER_CREATE_INFO*") MemoryAddress x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderArray$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle PlaceholderCount$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderCount$VH();
            }
            public static  @C("DWORD") int PlaceholderCount$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderCount$VH().get(seg);
            }
            public static  @C("DWORD") int PlaceholderCount$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderCount$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void PlaceholderCount$set(@C("struct ") MemorySegment seg, @C("DWORD") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderCount$VH().set(seg, x);
            }
            public static void PlaceholderCount$set(@C("struct ") MemorySegment seg, long index, @C("DWORD") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderCount$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle EntriesProcessed$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$EntriesProcessed$VH();
            }
            public static  @C("DWORD") int EntriesProcessed$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$EntriesProcessed$VH().get(seg);
            }
            public static  @C("DWORD") int EntriesProcessed$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$EntriesProcessed$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void EntriesProcessed$set(@C("struct ") MemorySegment seg, @C("DWORD") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$EntriesProcessed$VH().set(seg, x);
            }
            public static void EntriesProcessed$set(@C("struct ") MemorySegment seg, long index, @C("DWORD") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$TransferPlaceholders$EntriesProcessed$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment TransferPlaceholders$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(136, 32));
        }
        @C("struct ")public static class AckDehydrate {

            /* package-private */ AckDehydrate() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$Flags$VH();
            }
            public static  @C("CF_OPERATION_ACK_DEHYDRATE_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$Flags$VH().get(seg);
            }
            public static  @C("CF_OPERATION_ACK_DEHYDRATE_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_OPERATION_ACK_DEHYDRATE_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_OPERATION_ACK_DEHYDRATE_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle CompletionStatus$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$CompletionStatus$VH();
            }
            public static  @C("NTSTATUS") int CompletionStatus$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$CompletionStatus$VH().get(seg);
            }
            public static  @C("NTSTATUS") int CompletionStatus$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$CompletionStatus$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void CompletionStatus$set(@C("struct ") MemorySegment seg, @C("NTSTATUS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$CompletionStatus$VH().set(seg, x);
            }
            public static void CompletionStatus$set(@C("struct ") MemorySegment seg, long index, @C("NTSTATUS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$CompletionStatus$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle FileIdentity$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentity$VH();
            }
            public static  @C("LPCVOID") MemoryAddress FileIdentity$get(@C("struct ") MemorySegment seg) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentity$VH().get(seg);
            }
            public static  @C("LPCVOID") MemoryAddress FileIdentity$get(@C("struct ") MemorySegment seg, long index) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentity$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void FileIdentity$set(@C("struct ") MemorySegment seg, @C("LPCVOID") MemoryAddress x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentity$VH().set(seg, x);
            }
            public static void FileIdentity$set(@C("struct ") MemorySegment seg, long index, @C("LPCVOID") MemoryAddress x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentity$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle FileIdentityLength$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentityLength$VH();
            }
            public static  @C("DWORD") int FileIdentityLength$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentityLength$VH().get(seg);
            }
            public static  @C("DWORD") int FileIdentityLength$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentityLength$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void FileIdentityLength$set(@C("struct ") MemorySegment seg, @C("DWORD") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentityLength$VH().set(seg, x);
            }
            public static void FileIdentityLength$set(@C("struct ") MemorySegment seg, long index, @C("DWORD") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentityLength$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment AckDehydrate$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(168, 24));
        }
        @C("struct ")public static class AckRename {

            /* package-private */ AckRename() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckRename$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckRename$Flags$VH();
            }
            public static  @C("CF_OPERATION_ACK_RENAME_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckRename$Flags$VH().get(seg);
            }
            public static  @C("CF_OPERATION_ACK_RENAME_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckRename$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_OPERATION_ACK_RENAME_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckRename$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_OPERATION_ACK_RENAME_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckRename$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle CompletionStatus$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckRename$CompletionStatus$VH();
            }
            public static  @C("NTSTATUS") int CompletionStatus$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckRename$CompletionStatus$VH().get(seg);
            }
            public static  @C("NTSTATUS") int CompletionStatus$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckRename$CompletionStatus$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void CompletionStatus$set(@C("struct ") MemorySegment seg, @C("NTSTATUS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckRename$CompletionStatus$VH().set(seg, x);
            }
            public static void CompletionStatus$set(@C("struct ") MemorySegment seg, long index, @C("NTSTATUS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckRename$CompletionStatus$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment AckRename$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(192, 8));
        }
        @C("struct ")public static class AckDelete {

            /* package-private */ AckDelete() {}
            public static MemoryLayout $LAYOUT() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDelete$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDelete$Flags$VH();
            }
            public static  @C("CF_OPERATION_ACK_DELETE_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDelete$Flags$VH().get(seg);
            }
            public static  @C("CF_OPERATION_ACK_DELETE_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDelete$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_OPERATION_ACK_DELETE_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDelete$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_OPERATION_ACK_DELETE_FLAGS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDelete$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle CompletionStatus$VH() {
                return cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDelete$CompletionStatus$VH();
            }
            public static  @C("NTSTATUS") int CompletionStatus$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDelete$CompletionStatus$VH().get(seg);
            }
            public static  @C("NTSTATUS") int CompletionStatus$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDelete$CompletionStatus$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void CompletionStatus$set(@C("struct ") MemorySegment seg, @C("NTSTATUS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDelete$CompletionStatus$VH().set(seg, x);
            }
            public static void CompletionStatus$set(@C("struct ") MemorySegment seg, long index, @C("NTSTATUS") int x) {
                cfapi_h$constants$99.CF_OPERATION_PARAMETERS$AckDelete$CompletionStatus$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static @C("struct ") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
            public static @C("struct ") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
            public static @C("struct []") MemorySegment allocateArray(int len) {
                return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
            }            public static @C("struct []") MemorySegment allocateArray(int len, NativeScope scope) {
                return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
            }
            public static @C("struct *") MemorySegment allocatePointer() {
                return MemorySegment.allocateNative(C_POINTER);
            }
            public static @C("struct *") MemorySegment allocatePointer(NativeScope scope) {
                return scope.allocate(C_POINTER);
            }
            public static @C("struct ") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
        }

        public static MemorySegment AckDelete$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(200, 8));
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_OPERATION_PARAMETERS") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_OPERATION_PARAMETERS") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_OPERATION_PARAMETERS[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_OPERATION_PARAMETERS[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_OPERATION_PARAMETERS*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_OPERATION_PARAMETERS*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_OPERATION_PARAMETERS") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_FILE_RANGE")public static class CF_FILE_RANGE {

        /* package-private */ CF_FILE_RANGE() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_FILE_RANGE$struct$LAYOUT();
        }
        public static MemorySegment StartingOffset$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(0, 8));
        }
        public static MemorySegment Length$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 8));
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_FILE_RANGE") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_FILE_RANGE") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_FILE_RANGE[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_FILE_RANGE[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_FILE_RANGE*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_FILE_RANGE*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_FILE_RANGE") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_PLACEHOLDER_BASIC_INFO")public static class CF_PLACEHOLDER_BASIC_INFO {

        /* package-private */ CF_PLACEHOLDER_BASIC_INFO() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$struct$LAYOUT();
        }
        public static VarHandle PinState$VH() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$PinState$VH();
        }
        public static  @C("CF_PIN_STATE") int PinState$get(@C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$PinState$VH().get(seg);
        }
        public static  @C("CF_PIN_STATE") int PinState$get(@C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$PinState$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void PinState$set(@C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment seg, @C("CF_PIN_STATE") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$PinState$VH().set(seg, x);
        }
        public static void PinState$set(@C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment seg, long index, @C("CF_PIN_STATE") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$PinState$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle InSyncState$VH() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$InSyncState$VH();
        }
        public static  @C("CF_IN_SYNC_STATE") int InSyncState$get(@C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$InSyncState$VH().get(seg);
        }
        public static  @C("CF_IN_SYNC_STATE") int InSyncState$get(@C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$InSyncState$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void InSyncState$set(@C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment seg, @C("CF_IN_SYNC_STATE") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$InSyncState$VH().set(seg, x);
        }
        public static void InSyncState$set(@C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment seg, long index, @C("CF_IN_SYNC_STATE") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$InSyncState$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment FileId$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 8));
        }
        public static MemorySegment SyncRootFileId$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(16, 8));
        }
        public static VarHandle FileIdentityLength$VH() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$FileIdentityLength$VH();
        }
        public static  @C("ULONG") int FileIdentityLength$get(@C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$FileIdentityLength$VH().get(seg);
        }
        public static  @C("ULONG") int FileIdentityLength$get(@C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$FileIdentityLength$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void FileIdentityLength$set(@C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$FileIdentityLength$VH().set(seg, x);
        }
        public static void FileIdentityLength$set(@C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_BASIC_INFO$FileIdentityLength$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment FileIdentity$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(28, 1));
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_PLACEHOLDER_BASIC_INFO[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_PLACEHOLDER_BASIC_INFO[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_PLACEHOLDER_BASIC_INFO*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_PLACEHOLDER_BASIC_INFO*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_PLACEHOLDER_BASIC_INFO") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_PLACEHOLDER_STANDARD_INFO")public static class CF_PLACEHOLDER_STANDARD_INFO {

        /* package-private */ CF_PLACEHOLDER_STANDARD_INFO() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$struct$LAYOUT();
        }
        public static MemorySegment OnDiskDataSize$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(0, 8));
        }
        public static MemorySegment ValidatedDataSize$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 8));
        }
        public static MemorySegment ModifiedDataSize$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(16, 8));
        }
        public static MemorySegment PropertiesSize$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(24, 8));
        }
        public static VarHandle PinState$VH() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$PinState$VH();
        }
        public static  @C("CF_PIN_STATE") int PinState$get(@C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$PinState$VH().get(seg);
        }
        public static  @C("CF_PIN_STATE") int PinState$get(@C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$PinState$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void PinState$set(@C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment seg, @C("CF_PIN_STATE") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$PinState$VH().set(seg, x);
        }
        public static void PinState$set(@C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment seg, long index, @C("CF_PIN_STATE") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$PinState$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle InSyncState$VH() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$InSyncState$VH();
        }
        public static  @C("CF_IN_SYNC_STATE") int InSyncState$get(@C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$InSyncState$VH().get(seg);
        }
        public static  @C("CF_IN_SYNC_STATE") int InSyncState$get(@C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$InSyncState$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void InSyncState$set(@C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment seg, @C("CF_IN_SYNC_STATE") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$InSyncState$VH().set(seg, x);
        }
        public static void InSyncState$set(@C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment seg, long index, @C("CF_IN_SYNC_STATE") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$InSyncState$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment FileId$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(40, 8));
        }
        public static MemorySegment SyncRootFileId$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(48, 8));
        }
        public static VarHandle FileIdentityLength$VH() {
            return cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$FileIdentityLength$VH();
        }
        public static  @C("ULONG") int FileIdentityLength$get(@C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$FileIdentityLength$VH().get(seg);
        }
        public static  @C("ULONG") int FileIdentityLength$get(@C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$FileIdentityLength$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void FileIdentityLength$set(@C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$FileIdentityLength$VH().set(seg, x);
        }
        public static void FileIdentityLength$set(@C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$99.CF_PLACEHOLDER_STANDARD_INFO$FileIdentityLength$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment FileIdentity$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(60, 1));
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_PLACEHOLDER_STANDARD_INFO[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_PLACEHOLDER_STANDARD_INFO[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_PLACEHOLDER_STANDARD_INFO*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_PLACEHOLDER_STANDARD_INFO*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_PLACEHOLDER_STANDARD_INFO") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_SYNC_ROOT_BASIC_INFO")public static class CF_SYNC_ROOT_BASIC_INFO {

        /* package-private */ CF_SYNC_ROOT_BASIC_INFO() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$100.CF_SYNC_ROOT_BASIC_INFO$struct$LAYOUT();
        }
        public static MemorySegment SyncRootFileId$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(0, 8));
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_SYNC_ROOT_BASIC_INFO") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_SYNC_ROOT_BASIC_INFO") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_SYNC_ROOT_BASIC_INFO[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_SYNC_ROOT_BASIC_INFO[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_SYNC_ROOT_BASIC_INFO*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_SYNC_ROOT_BASIC_INFO*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_SYNC_ROOT_BASIC_INFO") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_SYNC_ROOT_PROVIDER_INFO")public static class CF_SYNC_ROOT_PROVIDER_INFO {

        /* package-private */ CF_SYNC_ROOT_PROVIDER_INFO() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$100.CF_SYNC_ROOT_PROVIDER_INFO$struct$LAYOUT();
        }
        public static VarHandle ProviderStatus$VH() {
            return cfapi_h$constants$100.CF_SYNC_ROOT_PROVIDER_INFO$ProviderStatus$VH();
        }
        public static  @C("CF_SYNC_PROVIDER_STATUS") int ProviderStatus$get(@C("struct CF_SYNC_ROOT_PROVIDER_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$100.CF_SYNC_ROOT_PROVIDER_INFO$ProviderStatus$VH().get(seg);
        }
        public static  @C("CF_SYNC_PROVIDER_STATUS") int ProviderStatus$get(@C("struct CF_SYNC_ROOT_PROVIDER_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$100.CF_SYNC_ROOT_PROVIDER_INFO$ProviderStatus$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void ProviderStatus$set(@C("struct CF_SYNC_ROOT_PROVIDER_INFO") MemorySegment seg, @C("CF_SYNC_PROVIDER_STATUS") int x) {
            cfapi_h$constants$100.CF_SYNC_ROOT_PROVIDER_INFO$ProviderStatus$VH().set(seg, x);
        }
        public static void ProviderStatus$set(@C("struct CF_SYNC_ROOT_PROVIDER_INFO") MemorySegment seg, long index, @C("CF_SYNC_PROVIDER_STATUS") int x) {
            cfapi_h$constants$100.CF_SYNC_ROOT_PROVIDER_INFO$ProviderStatus$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment ProviderName$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(4, 512));
        }
        public static MemorySegment ProviderVersion$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(516, 512));
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_SYNC_ROOT_PROVIDER_INFO") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_SYNC_ROOT_PROVIDER_INFO") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_SYNC_ROOT_PROVIDER_INFO[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_SYNC_ROOT_PROVIDER_INFO[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_SYNC_ROOT_PROVIDER_INFO*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_SYNC_ROOT_PROVIDER_INFO*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_SYNC_ROOT_PROVIDER_INFO") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }

    @C("struct CF_SYNC_ROOT_STANDARD_INFO")public static class CF_SYNC_ROOT_STANDARD_INFO {

        /* package-private */ CF_SYNC_ROOT_STANDARD_INFO() {}
        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$struct$LAYOUT();
        }
        public static MemorySegment SyncRootFileId$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(0, 8));
        }
        public static MemorySegment HydrationPolicy$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(8, 4));
        }
        public static MemorySegment PopulationPolicy$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(12, 4));
        }
        public static VarHandle InSyncPolicy$VH() {
            return cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$InSyncPolicy$VH();
        }
        public static  @C("CF_INSYNC_POLICY") int InSyncPolicy$get(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$InSyncPolicy$VH().get(seg);
        }
        public static  @C("CF_INSYNC_POLICY") int InSyncPolicy$get(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$InSyncPolicy$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void InSyncPolicy$set(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg, @C("CF_INSYNC_POLICY") int x) {
            cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$InSyncPolicy$VH().set(seg, x);
        }
        public static void InSyncPolicy$set(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg, long index, @C("CF_INSYNC_POLICY") int x) {
            cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$InSyncPolicy$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle HardLinkPolicy$VH() {
            return cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$HardLinkPolicy$VH();
        }
        public static  @C("CF_HARDLINK_POLICY") int HardLinkPolicy$get(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$HardLinkPolicy$VH().get(seg);
        }
        public static  @C("CF_HARDLINK_POLICY") int HardLinkPolicy$get(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$HardLinkPolicy$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void HardLinkPolicy$set(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg, @C("CF_HARDLINK_POLICY") int x) {
            cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$HardLinkPolicy$VH().set(seg, x);
        }
        public static void HardLinkPolicy$set(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg, long index, @C("CF_HARDLINK_POLICY") int x) {
            cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$HardLinkPolicy$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle ProviderStatus$VH() {
            return cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$ProviderStatus$VH();
        }
        public static  @C("CF_SYNC_PROVIDER_STATUS") int ProviderStatus$get(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$ProviderStatus$VH().get(seg);
        }
        public static  @C("CF_SYNC_PROVIDER_STATUS") int ProviderStatus$get(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$ProviderStatus$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void ProviderStatus$set(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg, @C("CF_SYNC_PROVIDER_STATUS") int x) {
            cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$ProviderStatus$VH().set(seg, x);
        }
        public static void ProviderStatus$set(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg, long index, @C("CF_SYNC_PROVIDER_STATUS") int x) {
            cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$ProviderStatus$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment ProviderName$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(28, 512));
        }
        public static MemorySegment ProviderVersion$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(540, 512));
        }
        public static VarHandle SyncRootIdentityLength$VH() {
            return cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$SyncRootIdentityLength$VH();
        }
        public static  @C("ULONG") int SyncRootIdentityLength$get(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg) {
            return (int)cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$SyncRootIdentityLength$VH().get(seg);
        }
        public static  @C("ULONG") int SyncRootIdentityLength$get(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg, long index) {
            return (int)cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$SyncRootIdentityLength$VH().get(seg.asSlice(index*sizeof()));
        }
        public static void SyncRootIdentityLength$set(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg, @C("ULONG") int x) {
            cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$SyncRootIdentityLength$VH().set(seg, x);
        }
        public static void SyncRootIdentityLength$set(@C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment seg, long index, @C("ULONG") int x) {
            cfapi_h$constants$100.CF_SYNC_ROOT_STANDARD_INFO$SyncRootIdentityLength$VH().set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment SyncRootIdentity$slice(MemorySegment seg) {
            return RuntimeHelper.nonCloseableNonTransferableSegment(seg.asSlice(1056, 1));
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static @C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment allocate() { return MemorySegment.allocateNative($LAYOUT()); }
        public static @C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment allocate(NativeScope scope) { return scope.allocate($LAYOUT()); }
        public static @C("struct CF_SYNC_ROOT_STANDARD_INFO[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }        public static @C("struct CF_SYNC_ROOT_STANDARD_INFO[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }
        public static @C("struct CF_SYNC_ROOT_STANDARD_INFO*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }
        public static @C("struct CF_SYNC_ROOT_STANDARD_INFO*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }
        public static @C("struct CF_SYNC_ROOT_STANDARD_INFO") MemorySegment ofAddressRestricted(MemoryAddress addr) { return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1); }
    }
}
