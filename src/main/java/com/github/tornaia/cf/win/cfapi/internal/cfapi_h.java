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
                return cfapi_h$constants$99.Cancel$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.Cancel$Flags$VH();
            }
            public static  @C("CF_CALLBACK_CANCEL_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.Cancel$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_CANCEL_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.Cancel$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_CANCEL_FLAGS") int x) {
                cfapi_h$constants$99.Cancel$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_CANCEL_FLAGS") int x) {
                cfapi_h$constants$99.Cancel$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            @C("struct ")public static class FetchData {

                /* package-private */ FetchData() {}
                public static MemoryLayout $LAYOUT() {
                    return cfapi_h$constants$99.FetchData$struct$LAYOUT();
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
                return cfapi_h$constants$99.FetchData$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.FetchData$Flags$VH();
            }
            public static  @C("CF_CALLBACK_FETCH_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.FetchData$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_FETCH_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.FetchData$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_FETCH_DATA_FLAGS") int x) {
                cfapi_h$constants$99.FetchData$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_FETCH_DATA_FLAGS") int x) {
                cfapi_h$constants$99.FetchData$Flags$VH().set(seg.asSlice(index*sizeof()), x);
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
                return cfapi_h$constants$99.FetchData$LastDehydrationReason$VH();
            }
            public static  @C("CF_CALLBACK_DEHYDRATION_REASON") int LastDehydrationReason$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.FetchData$LastDehydrationReason$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DEHYDRATION_REASON") int LastDehydrationReason$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.FetchData$LastDehydrationReason$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void LastDehydrationReason$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DEHYDRATION_REASON") int x) {
                cfapi_h$constants$99.FetchData$LastDehydrationReason$VH().set(seg, x);
            }
            public static void LastDehydrationReason$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DEHYDRATION_REASON") int x) {
                cfapi_h$constants$99.FetchData$LastDehydrationReason$VH().set(seg.asSlice(index*sizeof()), x);
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
                return cfapi_h$constants$99.ValidateData$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.ValidateData$Flags$VH();
            }
            public static  @C("CF_CALLBACK_VALIDATE_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.ValidateData$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_VALIDATE_DATA_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.ValidateData$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_VALIDATE_DATA_FLAGS") int x) {
                cfapi_h$constants$99.ValidateData$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_VALIDATE_DATA_FLAGS") int x) {
                cfapi_h$constants$99.ValidateData$Flags$VH().set(seg.asSlice(index*sizeof()), x);
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
                return cfapi_h$constants$99.FetchPlaceholders$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.FetchPlaceholders$Flags$VH();
            }
            public static  @C("CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.FetchPlaceholders$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.FetchPlaceholders$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS") int x) {
                cfapi_h$constants$99.FetchPlaceholders$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS") int x) {
                cfapi_h$constants$99.FetchPlaceholders$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle Pattern$VH() {
                return cfapi_h$constants$99.FetchPlaceholders$Pattern$VH();
            }
            public static  @C("PCWSTR") MemoryAddress Pattern$get(@C("struct ") MemorySegment seg) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.FetchPlaceholders$Pattern$VH().get(seg);
            }
            public static  @C("PCWSTR") MemoryAddress Pattern$get(@C("struct ") MemorySegment seg, long index) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.FetchPlaceholders$Pattern$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Pattern$set(@C("struct ") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
                cfapi_h$constants$99.FetchPlaceholders$Pattern$VH().set(seg, x);
            }
            public static void Pattern$set(@C("struct ") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
                cfapi_h$constants$99.FetchPlaceholders$Pattern$VH().set(seg.asSlice(index*sizeof()), x);
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
                return cfapi_h$constants$99.OpenCompletion$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.OpenCompletion$Flags$VH();
            }
            public static  @C("CF_CALLBACK_OPEN_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.OpenCompletion$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_OPEN_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.OpenCompletion$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_OPEN_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.OpenCompletion$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_OPEN_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.OpenCompletion$Flags$VH().set(seg.asSlice(index*sizeof()), x);
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
                return cfapi_h$constants$99.CloseCompletion$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.CloseCompletion$Flags$VH();
            }
            public static  @C("CF_CALLBACK_CLOSE_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.CloseCompletion$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_CLOSE_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.CloseCompletion$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_CLOSE_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.CloseCompletion$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_CLOSE_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.CloseCompletion$Flags$VH().set(seg.asSlice(index*sizeof()), x);
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
                return cfapi_h$constants$99.Dehydrate$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.Dehydrate$Flags$VH();
            }
            public static  @C("CF_CALLBACK_DEHYDRATE_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.Dehydrate$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DEHYDRATE_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.Dehydrate$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DEHYDRATE_FLAGS") int x) {
                cfapi_h$constants$99.Dehydrate$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DEHYDRATE_FLAGS") int x) {
                cfapi_h$constants$99.Dehydrate$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle Reason$VH() {
                return cfapi_h$constants$99.Dehydrate$Reason$VH();
            }
            public static  @C("CF_CALLBACK_DEHYDRATION_REASON") int Reason$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.Dehydrate$Reason$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DEHYDRATION_REASON") int Reason$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.Dehydrate$Reason$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Reason$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DEHYDRATION_REASON") int x) {
                cfapi_h$constants$99.Dehydrate$Reason$VH().set(seg, x);
            }
            public static void Reason$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DEHYDRATION_REASON") int x) {
                cfapi_h$constants$99.Dehydrate$Reason$VH().set(seg.asSlice(index*sizeof()), x);
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
                return cfapi_h$constants$99.DehydrateCompletion$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.DehydrateCompletion$Flags$VH();
            }
            public static  @C("CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.DehydrateCompletion$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.DehydrateCompletion$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.DehydrateCompletion$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.DehydrateCompletion$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle Reason$VH() {
                return cfapi_h$constants$99.DehydrateCompletion$Reason$VH();
            }
            public static  @C("CF_CALLBACK_DEHYDRATION_REASON") int Reason$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.DehydrateCompletion$Reason$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DEHYDRATION_REASON") int Reason$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.DehydrateCompletion$Reason$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Reason$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DEHYDRATION_REASON") int x) {
                cfapi_h$constants$99.DehydrateCompletion$Reason$VH().set(seg, x);
            }
            public static void Reason$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DEHYDRATION_REASON") int x) {
                cfapi_h$constants$99.DehydrateCompletion$Reason$VH().set(seg.asSlice(index*sizeof()), x);
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
                return cfapi_h$constants$99.Delete$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.Delete$Flags$VH();
            }
            public static  @C("CF_CALLBACK_DELETE_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.Delete$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DELETE_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.Delete$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DELETE_FLAGS") int x) {
                cfapi_h$constants$99.Delete$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DELETE_FLAGS") int x) {
                cfapi_h$constants$99.Delete$Flags$VH().set(seg.asSlice(index*sizeof()), x);
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
                return cfapi_h$constants$99.DeleteCompletion$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.DeleteCompletion$Flags$VH();
            }
            public static  @C("CF_CALLBACK_DELETE_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.DeleteCompletion$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_DELETE_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.DeleteCompletion$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_DELETE_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.DeleteCompletion$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_DELETE_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.DeleteCompletion$Flags$VH().set(seg.asSlice(index*sizeof()), x);
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
                return cfapi_h$constants$99.Rename$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.Rename$Flags$VH();
            }
            public static  @C("CF_CALLBACK_RENAME_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.Rename$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_RENAME_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.Rename$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_RENAME_FLAGS") int x) {
                cfapi_h$constants$99.Rename$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_RENAME_FLAGS") int x) {
                cfapi_h$constants$99.Rename$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle TargetPath$VH() {
                return cfapi_h$constants$99.Rename$TargetPath$VH();
            }
            public static  @C("PCWSTR") MemoryAddress TargetPath$get(@C("struct ") MemorySegment seg) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.Rename$TargetPath$VH().get(seg);
            }
            public static  @C("PCWSTR") MemoryAddress TargetPath$get(@C("struct ") MemorySegment seg, long index) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.Rename$TargetPath$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void TargetPath$set(@C("struct ") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
                cfapi_h$constants$99.Rename$TargetPath$VH().set(seg, x);
            }
            public static void TargetPath$set(@C("struct ") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
                cfapi_h$constants$99.Rename$TargetPath$VH().set(seg.asSlice(index*sizeof()), x);
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
                return cfapi_h$constants$99.RenameCompletion$struct$LAYOUT();
            }
            public static VarHandle Flags$VH() {
                return cfapi_h$constants$99.RenameCompletion$Flags$VH();
            }
            public static  @C("CF_CALLBACK_RENAME_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg) {
                return (int)cfapi_h$constants$99.RenameCompletion$Flags$VH().get(seg);
            }
            public static  @C("CF_CALLBACK_RENAME_COMPLETION_FLAGS") int Flags$get(@C("struct ") MemorySegment seg, long index) {
                return (int)cfapi_h$constants$99.RenameCompletion$Flags$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, @C("CF_CALLBACK_RENAME_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.RenameCompletion$Flags$VH().set(seg, x);
            }
            public static void Flags$set(@C("struct ") MemorySegment seg, long index, @C("CF_CALLBACK_RENAME_COMPLETION_FLAGS") int x) {
                cfapi_h$constants$99.RenameCompletion$Flags$VH().set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle SourcePath$VH() {
                return cfapi_h$constants$99.RenameCompletion$SourcePath$VH();
            }
            public static  @C("PCWSTR") MemoryAddress SourcePath$get(@C("struct ") MemorySegment seg) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.RenameCompletion$SourcePath$VH().get(seg);
            }
            public static  @C("PCWSTR") MemoryAddress SourcePath$get(@C("struct ") MemorySegment seg, long index) {
                return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.RenameCompletion$SourcePath$VH().get(seg.asSlice(index*sizeof()));
            }
            public static void SourcePath$set(@C("struct ") MemorySegment seg, @C("PCWSTR") MemoryAddress x) {
                cfapi_h$constants$99.RenameCompletion$SourcePath$VH().set(seg, x);
            }
            public static void SourcePath$set(@C("struct ") MemorySegment seg, long index, @C("PCWSTR") MemoryAddress x) {
                cfapi_h$constants$99.RenameCompletion$SourcePath$VH().set(seg.asSlice(index*sizeof()), x);
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
}
