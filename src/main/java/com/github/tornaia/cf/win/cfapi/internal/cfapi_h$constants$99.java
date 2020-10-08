package com.github.tornaia.cf.win.cfapi.internal;

import jdk.incubator.foreign.FunctionDescriptor;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemoryLayout;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_INT;

public class cfapi_h$constants$99 extends cfapi_h$constants$0 {

    static final MemoryLayout CF_PLATFORM_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("BuildNumber"),
            C_LONG.withName("RevisionNumber"),
            C_LONG.withName("IntegrationNumber")
    ).withName("CF_PLATFORM_INFO");

    static final jdk.incubator.foreign.MemoryLayout CF_PLATFORM_INFO$struct$LAYOUT() {
        return CF_PLATFORM_INFO$struct$LAYOUT_;
    }

    static final MemoryLayout CF_PLATFORM_INFO$BuildNumber$LAYOUT_ = C_LONG;

    static final jdk.incubator.foreign.MemoryLayout CF_PLATFORM_INFO$BuildNumber$LAYOUT() {
        return CF_PLATFORM_INFO$BuildNumber$LAYOUT_;
    }

    static final VarHandle CF_PLATFORM_INFO$BuildNumber$VH_ = CF_PLATFORM_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("BuildNumber"));

    static final java.lang.invoke.VarHandle CF_PLATFORM_INFO$BuildNumber$VH() {
        return CF_PLATFORM_INFO$BuildNumber$VH_;
    }

    static final MemoryLayout CF_PLATFORM_INFO$RevisionNumber$LAYOUT_ = C_LONG;

    static final jdk.incubator.foreign.MemoryLayout CF_PLATFORM_INFO$RevisionNumber$LAYOUT() {
        return CF_PLATFORM_INFO$RevisionNumber$LAYOUT_;
    }

    static final VarHandle CF_PLATFORM_INFO$RevisionNumber$VH_ = CF_PLATFORM_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("RevisionNumber"));

    static final java.lang.invoke.VarHandle CF_PLATFORM_INFO$RevisionNumber$VH() {
        return CF_PLATFORM_INFO$RevisionNumber$VH_;
    }

    static final MemoryLayout CF_PLATFORM_INFO$IntegrationNumber$LAYOUT_ = C_LONG;

    static final jdk.incubator.foreign.MemoryLayout CF_PLATFORM_INFO$IntegrationNumber$LAYOUT() {
        return CF_PLATFORM_INFO$IntegrationNumber$LAYOUT_;
    }

    static final VarHandle CF_PLATFORM_INFO$IntegrationNumber$VH_ = CF_PLATFORM_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("IntegrationNumber"));

    static final java.lang.invoke.VarHandle CF_PLATFORM_INFO$IntegrationNumber$VH() {
        return CF_PLATFORM_INFO$IntegrationNumber$VH_;
    }

    static final FunctionDescriptor CfGetPlatformInfo$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER
    );

    static final jdk.incubator.foreign.FunctionDescriptor CfGetPlatformInfo$FUNC() {
        return CfGetPlatformInfo$FUNC_;
    }

    static final MethodHandle CfGetPlatformInfo$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfGetPlatformInfo",
            "(Ljdk/incubator/foreign/MemoryAddress;)I",
            CfGetPlatformInfo$FUNC_, false
    );

    static final java.lang.invoke.MethodHandle CfGetPlatformInfo$MH() {
        return CfGetPlatformInfo$MH_;
    }

    static final int CF_REGISTER_FLAG_NONE() { return (int)0L; }

    static final int CF_REGISTER_FLAG_UPDATE() { return (int)1L; }

    static final int CF_REGISTER_FLAG_DISABLE_ON_DEMAND_POPULATION_ON_ROOT() { return (int)2L; }

    static final int CF_REGISTER_FLAG_MARK_IN_SYNC_ON_ROOT() { return (int)4L; }

    static final int CF_HYDRATION_POLICY_PARTIAL() { return (int)0L; }

    static final int CF_HYDRATION_POLICY_PROGRESSIVE() { return (int)1L; }

    static final int CF_HYDRATION_POLICY_FULL() { return (int)2L; }

    static final int CF_HYDRATION_POLICY_ALWAYS_FULL() { return (int)3L; }

    static final int CF_HYDRATION_POLICY_MODIFIER_NONE() { return (int)0L; }

    static final int CF_HYDRATION_POLICY_MODIFIER_VALIDATION_REQUIRED() { return (int)1L; }

    static final int CF_HYDRATION_POLICY_MODIFIER_STREAMING_ALLOWED() { return (int)2L; }

    static final int CF_HYDRATION_POLICY_MODIFIER_AUTO_DEHYDRATION_ALLOWED() { return (int)4L; }

    static final MemoryLayout CF_HYDRATION_POLICY$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_SHORT.withName("Primary"),
            C_SHORT.withName("Modifier")
    ).withName("CF_HYDRATION_POLICY");
    static final jdk.incubator.foreign.MemoryLayout CF_HYDRATION_POLICY$struct$LAYOUT() { return CF_HYDRATION_POLICY$struct$LAYOUT_; }

    static final MemoryLayout CF_HYDRATION_POLICY$Primary$LAYOUT_ = C_SHORT;
    static final jdk.incubator.foreign.MemoryLayout CF_HYDRATION_POLICY$Primary$LAYOUT() { return CF_HYDRATION_POLICY$Primary$LAYOUT_; }

    static final VarHandle CF_HYDRATION_POLICY$Primary$VH_ = CF_HYDRATION_POLICY$struct$LAYOUT_.varHandle(short.class, MemoryLayout.PathElement.groupElement("Primary"));
    static final java.lang.invoke.VarHandle CF_HYDRATION_POLICY$Primary$VH() { return CF_HYDRATION_POLICY$Primary$VH_; }

    static final MemoryLayout CF_HYDRATION_POLICY$Modifier$LAYOUT_ = C_SHORT;
    static final jdk.incubator.foreign.MemoryLayout CF_HYDRATION_POLICY$Modifier$LAYOUT() { return CF_HYDRATION_POLICY$Modifier$LAYOUT_; }

    static final VarHandle CF_HYDRATION_POLICY$Modifier$VH_ = CF_HYDRATION_POLICY$struct$LAYOUT_.varHandle(short.class, MemoryLayout.PathElement.groupElement("Modifier"));
    static final java.lang.invoke.VarHandle CF_HYDRATION_POLICY$Modifier$VH() { return CF_HYDRATION_POLICY$Modifier$VH_; }

    static final int CF_POPULATION_POLICY_PARTIAL() { return (int)0L; }

    static final int CF_POPULATION_POLICY_FULL() { return (int)2L; }

    static final int CF_POPULATION_POLICY_ALWAYS_FULL() { return (int)3L; }

    static final int CF_POPULATION_POLICY_MODIFIER_NONE() { return (int)0L; }

    static final MemoryLayout CF_POPULATION_POLICY$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_SHORT.withName("Primary"),
            C_SHORT.withName("Modifier")
    ).withName("CF_POPULATION_POLICY");
    static final jdk.incubator.foreign.MemoryLayout CF_POPULATION_POLICY$struct$LAYOUT() { return CF_POPULATION_POLICY$struct$LAYOUT_; }

    static final MemoryLayout CF_POPULATION_POLICY$Primary$LAYOUT_ = C_SHORT;
    static final jdk.incubator.foreign.MemoryLayout CF_POPULATION_POLICY$Primary$LAYOUT() { return CF_POPULATION_POLICY$Primary$LAYOUT_; }

    static final VarHandle CF_POPULATION_POLICY$Primary$VH_ = CF_POPULATION_POLICY$struct$LAYOUT_.varHandle(short.class, MemoryLayout.PathElement.groupElement("Primary"));
    static final java.lang.invoke.VarHandle CF_POPULATION_POLICY$Primary$VH() { return CF_POPULATION_POLICY$Primary$VH_; }

    static final MemoryLayout CF_POPULATION_POLICY$Modifier$LAYOUT_ = C_SHORT;
    static final jdk.incubator.foreign.MemoryLayout CF_POPULATION_POLICY$Modifier$LAYOUT() { return CF_POPULATION_POLICY$Modifier$LAYOUT_; }

    static final VarHandle CF_POPULATION_POLICY$Modifier$VH_ = CF_POPULATION_POLICY$struct$LAYOUT_.varHandle(short.class, MemoryLayout.PathElement.groupElement("Modifier"));
    static final java.lang.invoke.VarHandle CF_POPULATION_POLICY$Modifier$VH() { return CF_POPULATION_POLICY$Modifier$VH_; }


    static final int CF_PLACEHOLDER_MANAGEMENT_POLICY_DEFAULT() { return (int)0L; }

    static final int CF_PLACEHOLDER_MANAGEMENT_POLICY_CREATE_UNRESTRICTED() { return (int)1L; }

    static final int CF_PLACEHOLDER_MANAGEMENT_POLICY_CONVERT_TO_UNRESTRICTED() { return (int)2L; }

    static final int CF_PLACEHOLDER_MANAGEMENT_POLICY_UPDATE_UNRESTRICTED() { return (int)4L; }

    static final int CF_INSYNC_POLICY_NONE() { return (int)0L; }

    static final int CF_INSYNC_POLICY_TRACK_FILE_CREATION_TIME() { return (int)1L; }

    static final int CF_INSYNC_POLICY_TRACK_FILE_READONLY_ATTRIBUTE() { return (int)2L; }

    static final int CF_INSYNC_POLICY_TRACK_FILE_HIDDEN_ATTRIBUTE() { return (int)4L; }

    static final int CF_INSYNC_POLICY_TRACK_FILE_SYSTEM_ATTRIBUTE() { return (int)8L; }

    static final int CF_INSYNC_POLICY_TRACK_DIRECTORY_CREATION_TIME() { return (int)16L; }

    static final int CF_INSYNC_POLICY_TRACK_DIRECTORY_READONLY_ATTRIBUTE() { return (int)32L; }

    static final int CF_INSYNC_POLICY_TRACK_DIRECTORY_HIDDEN_ATTRIBUTE() { return (int)64L; }

    static final int CF_INSYNC_POLICY_TRACK_DIRECTORY_SYSTEM_ATTRIBUTE() { return (int)128L; }

    static final int CF_INSYNC_POLICY_TRACK_FILE_LAST_WRITE_TIME() { return (int)256L; }

    static final int CF_INSYNC_POLICY_TRACK_DIRECTORY_LAST_WRITE_TIME() { return (int)512L; }

    static final int CF_INSYNC_POLICY_TRACK_FILE_ALL() { return (int)5592335L; }

    static final int CF_INSYNC_POLICY_TRACK_DIRECTORY_ALL() { return (int)11184880L; }

    static final int CF_INSYNC_POLICY_TRACK_ALL() { return (int)16777215L; }

    static final int CF_INSYNC_POLICY_PRESERVE_INSYNC_FOR_SYNC_ENGINE() { return (int)-2147483648L; }

    static final int CF_HARDLINK_POLICY_NONE() { return (int)0L; }

    static final int CF_HARDLINK_POLICY_ALLOWED() { return (int)1L; }

    static final MemoryLayout CF_SYNC_POLICIES$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("StructSize"),
            MemoryLayout.ofStruct(
                    C_SHORT.withName("Primary"),
                    C_SHORT.withName("Modifier")
            ).withName("Hydration"),
            MemoryLayout.ofStruct(
                    C_SHORT.withName("Primary"),
                    C_SHORT.withName("Modifier")
            ).withName("Population"),
            C_INT.withName("InSync"),
            C_INT.withName("HardLink"),
            C_INT.withName("PlaceholderManagement")
    ).withName("CF_SYNC_POLICIES");
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_POLICIES$struct$LAYOUT() { return CF_SYNC_POLICIES$struct$LAYOUT_; }

    static final MemoryLayout CF_SYNC_POLICIES$StructSize$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_POLICIES$StructSize$LAYOUT() { return CF_SYNC_POLICIES$StructSize$LAYOUT_; }

    static final VarHandle CF_SYNC_POLICIES$StructSize$VH_ = CF_SYNC_POLICIES$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("StructSize"));
    static final java.lang.invoke.VarHandle CF_SYNC_POLICIES$StructSize$VH() { return CF_SYNC_POLICIES$StructSize$VH_; }

    static final MemoryLayout CF_SYNC_POLICIES$InSync$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_POLICIES$InSync$LAYOUT() { return CF_SYNC_POLICIES$InSync$LAYOUT_; }

    static final VarHandle CF_SYNC_POLICIES$InSync$VH_ = CF_SYNC_POLICIES$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("InSync"));
    static final java.lang.invoke.VarHandle CF_SYNC_POLICIES$InSync$VH() { return CF_SYNC_POLICIES$InSync$VH_; }

    static final MemoryLayout CF_SYNC_POLICIES$HardLink$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_POLICIES$HardLink$LAYOUT() { return CF_SYNC_POLICIES$HardLink$LAYOUT_; }

    static final VarHandle CF_SYNC_POLICIES$HardLink$VH_ = CF_SYNC_POLICIES$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("HardLink"));
    static final java.lang.invoke.VarHandle CF_SYNC_POLICIES$HardLink$VH() { return CF_SYNC_POLICIES$HardLink$VH_; }

    static final MemoryLayout CF_SYNC_POLICIES$PlaceholderManagement$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_POLICIES$PlaceholderManagement$LAYOUT() { return CF_SYNC_POLICIES$PlaceholderManagement$LAYOUT_; }

    static final VarHandle CF_SYNC_POLICIES$PlaceholderManagement$VH_ = CF_SYNC_POLICIES$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("PlaceholderManagement"));
    static final java.lang.invoke.VarHandle CF_SYNC_POLICIES$PlaceholderManagement$VH() { return CF_SYNC_POLICIES$PlaceholderManagement$VH_; }

    static final MemoryLayout CF_SYNC_REGISTRATION$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("StructSize"),
            MemoryLayout.ofPaddingBits(32),
            C_POINTER.withName("ProviderName"),
            C_POINTER.withName("ProviderVersion"),
            C_POINTER.withName("SyncRootIdentity"),
            C_LONG.withName("SyncRootIdentityLength"),
            MemoryLayout.ofPaddingBits(32),
            C_POINTER.withName("FileIdentity"),
            C_LONG.withName("FileIdentityLength"),
            MemoryLayout.ofStruct(
                    C_LONG.withName("Data1"),
                    C_SHORT.withName("Data2"),
                    C_SHORT.withName("Data3"),
                    MemoryLayout.ofSequence(8, C_CHAR).withName("Data4")
            ).withName("ProviderId"),
            MemoryLayout.ofPaddingBits(32)
    ).withName("CF_SYNC_REGISTRATION");
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_REGISTRATION$struct$LAYOUT() { return CF_SYNC_REGISTRATION$struct$LAYOUT_; }

    static final MemoryLayout CF_SYNC_REGISTRATION$StructSize$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_REGISTRATION$StructSize$LAYOUT() { return CF_SYNC_REGISTRATION$StructSize$LAYOUT_; }

    static final VarHandle CF_SYNC_REGISTRATION$StructSize$VH_ = CF_SYNC_REGISTRATION$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("StructSize"));
    static final java.lang.invoke.VarHandle CF_SYNC_REGISTRATION$StructSize$VH() { return CF_SYNC_REGISTRATION$StructSize$VH_; }

    static final MemoryLayout CF_SYNC_REGISTRATION$ProviderName$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_REGISTRATION$ProviderName$LAYOUT() { return CF_SYNC_REGISTRATION$ProviderName$LAYOUT_; }

    static final VarHandle CF_SYNC_REGISTRATION$ProviderName$VH_ = MemoryHandles.asAddressVarHandle(CF_SYNC_REGISTRATION$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("ProviderName")));
    static final java.lang.invoke.VarHandle CF_SYNC_REGISTRATION$ProviderName$VH() { return CF_SYNC_REGISTRATION$ProviderName$VH_; }

    static final MemoryLayout CF_SYNC_REGISTRATION$ProviderVersion$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_REGISTRATION$ProviderVersion$LAYOUT() { return CF_SYNC_REGISTRATION$ProviderVersion$LAYOUT_; }

    static final VarHandle CF_SYNC_REGISTRATION$ProviderVersion$VH_ = MemoryHandles.asAddressVarHandle(CF_SYNC_REGISTRATION$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("ProviderVersion")));
    static final java.lang.invoke.VarHandle CF_SYNC_REGISTRATION$ProviderVersion$VH() { return CF_SYNC_REGISTRATION$ProviderVersion$VH_; }

    static final MemoryLayout CF_SYNC_REGISTRATION$SyncRootIdentity$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_REGISTRATION$SyncRootIdentity$LAYOUT() { return CF_SYNC_REGISTRATION$SyncRootIdentity$LAYOUT_; }

    static final VarHandle CF_SYNC_REGISTRATION$SyncRootIdentity$VH_ = MemoryHandles.asAddressVarHandle(CF_SYNC_REGISTRATION$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("SyncRootIdentity")));
    static final java.lang.invoke.VarHandle CF_SYNC_REGISTRATION$SyncRootIdentity$VH() { return CF_SYNC_REGISTRATION$SyncRootIdentity$VH_; }

    static final MemoryLayout CF_SYNC_REGISTRATION$SyncRootIdentityLength$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_REGISTRATION$SyncRootIdentityLength$LAYOUT() { return CF_SYNC_REGISTRATION$SyncRootIdentityLength$LAYOUT_; }

    static final VarHandle CF_SYNC_REGISTRATION$SyncRootIdentityLength$VH_ = CF_SYNC_REGISTRATION$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("SyncRootIdentityLength"));
    static final java.lang.invoke.VarHandle CF_SYNC_REGISTRATION$SyncRootIdentityLength$VH() { return CF_SYNC_REGISTRATION$SyncRootIdentityLength$VH_; }

    static final MemoryLayout CF_SYNC_REGISTRATION$FileIdentity$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_REGISTRATION$FileIdentity$LAYOUT() { return CF_SYNC_REGISTRATION$FileIdentity$LAYOUT_; }

    static final VarHandle CF_SYNC_REGISTRATION$FileIdentity$VH_ = MemoryHandles.asAddressVarHandle(CF_SYNC_REGISTRATION$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("FileIdentity")));
    static final java.lang.invoke.VarHandle CF_SYNC_REGISTRATION$FileIdentity$VH() { return CF_SYNC_REGISTRATION$FileIdentity$VH_; }

    static final MemoryLayout CF_SYNC_REGISTRATION$FileIdentityLength$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_REGISTRATION$FileIdentityLength$LAYOUT() { return CF_SYNC_REGISTRATION$FileIdentityLength$LAYOUT_; }

    static final VarHandle CF_SYNC_REGISTRATION$FileIdentityLength$VH_ = CF_SYNC_REGISTRATION$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("FileIdentityLength"));
    static final java.lang.invoke.VarHandle CF_SYNC_REGISTRATION$FileIdentityLength$VH() { return CF_SYNC_REGISTRATION$FileIdentityLength$VH_; }

    static final FunctionDescriptor CfRegisterSyncRoot$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER,
            C_POINTER,
            C_INT
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfRegisterSyncRoot$FUNC() { return CfRegisterSyncRoot$FUNC_; }

    static final MethodHandle CfRegisterSyncRoot$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfRegisterSyncRoot",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
            CfRegisterSyncRoot$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfRegisterSyncRoot$MH() { return CfRegisterSyncRoot$MH_; }
}
