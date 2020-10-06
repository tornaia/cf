package com.github.tornaia.cf.win.cfapi.internal;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.NativeScope;

import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_POINTER;

public class cfapi_h extends cfapi_h$28 {

    @C("struct CF_PLATFORM_INFO")
    public static class CF_PLATFORM_INFO {

        /* package-private */ CF_PLATFORM_INFO() {
        }

        public static MemoryLayout $LAYOUT() {
            return cfapi_h$constants$99.CF_PLATFORM_INFO$struct$LAYOUT();
        }

        public static VarHandle BuildNumber$VH() {
            return cfapi_h$constants$99.CF_PLATFORM_INFO$BuildNumber$VH();
        }

        public static @C("DWORD") int BuildNumber$get(@C("struct CF_PLATFORM_INFO") MemorySegment seg) {
            return (int) cfapi_h$constants$99.CF_PLATFORM_INFO$BuildNumber$VH().get(seg);
        }

        public static @C("DWORD") int BuildNumber$get(@C("struct CF_PLATFORM_INFO") MemorySegment seg, long index) {
            return (int) cfapi_h$constants$99.CF_PLATFORM_INFO$BuildNumber$VH().get(seg.asSlice(index * sizeof()));
        }

        public static void BuildNumber$set(@C("struct CF_PLATFORM_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLATFORM_INFO$BuildNumber$VH().set(seg, x);
        }

        public static void BuildNumber$set(@C("struct CF_PLATFORM_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLATFORM_INFO$BuildNumber$VH().set(seg.asSlice(index * sizeof()), x);
        }

        public static VarHandle RevisionNumber$VH() {
            return cfapi_h$constants$99.CF_PLATFORM_INFO$RevisionNumber$VH();
        }

        public static @C("DWORD") int RevisionNumber$get(@C("struct CF_PLATFORM_INFO") MemorySegment seg) {
            return (int) cfapi_h$constants$99.CF_PLATFORM_INFO$RevisionNumber$VH().get(seg);
        }

        public static @C("DWORD") int RevisionNumber$get(@C("struct CF_PLATFORM_INFO") MemorySegment seg, long index) {
            return (int) cfapi_h$constants$99.CF_PLATFORM_INFO$RevisionNumber$VH().get(seg.asSlice(index * sizeof()));
        }

        public static void RevisionNumber$set(@C("struct CF_PLATFORM_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLATFORM_INFO$RevisionNumber$VH().set(seg, x);
        }

        public static void RevisionNumber$set(@C("struct CF_PLATFORM_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLATFORM_INFO$RevisionNumber$VH().set(seg.asSlice(index * sizeof()), x);
        }

        public static VarHandle IntegrationNumber$VH() {
            return cfapi_h$constants$99.CF_PLATFORM_INFO$IntegrationNumber$VH();
        }

        public static @C("DWORD") int IntegrationNumber$get(@C("struct CF_PLATFORM_INFO") MemorySegment seg) {
            return (int) cfapi_h$constants$99.CF_PLATFORM_INFO$IntegrationNumber$VH().get(seg);
        }

        public static @C("DWORD") int IntegrationNumber$get(@C("struct CF_PLATFORM_INFO") MemorySegment seg, long index) {
            return (int) cfapi_h$constants$99.CF_PLATFORM_INFO$IntegrationNumber$VH().get(seg.asSlice(index * sizeof()));
        }

        public static void IntegrationNumber$set(@C("struct CF_PLATFORM_INFO") MemorySegment seg, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLATFORM_INFO$IntegrationNumber$VH().set(seg, x);
        }

        public static void IntegrationNumber$set(@C("struct CF_PLATFORM_INFO") MemorySegment seg, long index, @C("DWORD") int x) {
            cfapi_h$constants$99.CF_PLATFORM_INFO$IntegrationNumber$VH().set(seg.asSlice(index * sizeof()), x);
        }

        public static long sizeof() {
            return $LAYOUT().byteSize();
        }

        public static @C("struct CF_PLATFORM_INFO") MemorySegment allocate() {
            return MemorySegment.allocateNative($LAYOUT());
        }

        public static @C("struct CF_PLATFORM_INFO") MemorySegment allocate(NativeScope scope) {
            return scope.allocate($LAYOUT());
        }

        public static @C("struct CF_PLATFORM_INFO[]") MemorySegment allocateArray(int len) {
            return MemorySegment.allocateNative(MemoryLayout.ofSequence(len, $LAYOUT()));
        }

        public static @C("struct CF_PLATFORM_INFO[]") MemorySegment allocateArray(int len, NativeScope scope) {
            return scope.allocate(MemoryLayout.ofSequence(len, $LAYOUT()));
        }

        public static @C("struct CF_PLATFORM_INFO*") MemorySegment allocatePointer() {
            return MemorySegment.allocateNative(C_POINTER);
        }

        public static @C("struct CF_PLATFORM_INFO*") MemorySegment allocatePointer(NativeScope scope) {
            return scope.allocate(C_POINTER);
        }

        public static @C("struct CF_PLATFORM_INFO") MemorySegment ofAddressRestricted(MemoryAddress addr) {
            return RuntimeHelper.asArrayRestricted(addr, $LAYOUT(), 1);
        }
    }
}
