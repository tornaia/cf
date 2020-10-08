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
}
