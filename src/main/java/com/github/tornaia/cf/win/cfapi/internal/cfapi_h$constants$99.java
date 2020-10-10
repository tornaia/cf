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
import static jdk.incubator.foreign.CLinker.C_LONGLONG;

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

    static final MemoryLayout CF_CONNECTION_KEY__$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONGLONG.withName("Internal")
    ).withName("CF_CONNECTION_KEY__");
    static final jdk.incubator.foreign.MemoryLayout CF_CONNECTION_KEY__$struct$LAYOUT() { return CF_CONNECTION_KEY__$struct$LAYOUT_; }

    static final MemoryLayout CF_CONNECTION_KEY__$Internal$LAYOUT_ = C_LONGLONG;
    static final jdk.incubator.foreign.MemoryLayout CF_CONNECTION_KEY__$Internal$LAYOUT() { return CF_CONNECTION_KEY__$Internal$LAYOUT_; }

    static final VarHandle CF_CONNECTION_KEY__$Internal$VH_ = CF_CONNECTION_KEY__$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("Internal"));
    static final java.lang.invoke.VarHandle CF_CONNECTION_KEY__$Internal$VH() { return CF_CONNECTION_KEY__$Internal$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("StructSize"),
            MemoryLayout.ofPaddingBits(32),
            MemoryLayout.ofStruct(
                    C_LONGLONG.withName("Internal")
            ).withName("ConnectionKey"),
            C_POINTER.withName("CallbackContext"),
            C_POINTER.withName("VolumeGuidName"),
            C_POINTER.withName("VolumeDosName"),
            C_LONG.withName("VolumeSerialNumber"),
            MemoryLayout.ofPaddingBits(32),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("SyncRootFileId"),
            C_POINTER.withName("SyncRootIdentity"),
            C_LONG.withName("SyncRootIdentityLength"),
            MemoryLayout.ofPaddingBits(32),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("FileId"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("FileSize"),
            C_POINTER.withName("FileIdentity"),
            C_LONG.withName("FileIdentityLength"),
            MemoryLayout.ofPaddingBits(32),
            C_POINTER.withName("NormalizedPath"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("TransferKey"),
            C_CHAR.withName("PriorityHint"),
            MemoryLayout.ofPaddingBits(56),
            C_POINTER.withName("CorrelationVector"),
            C_POINTER.withName("ProcessInfo"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("RequestKey")
    ).withName("CF_CALLBACK_INFO");
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$struct$LAYOUT() { return CF_CALLBACK_INFO$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_INFO$StructSize$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$StructSize$LAYOUT() { return CF_CALLBACK_INFO$StructSize$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$StructSize$VH_ = CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("StructSize"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$StructSize$VH() { return CF_CALLBACK_INFO$StructSize$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$CallbackContext$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$CallbackContext$LAYOUT() { return CF_CALLBACK_INFO$CallbackContext$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$CallbackContext$VH_ = MemoryHandles.asAddressVarHandle(CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("CallbackContext")));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$CallbackContext$VH() { return CF_CALLBACK_INFO$CallbackContext$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$VolumeGuidName$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$VolumeGuidName$LAYOUT() { return CF_CALLBACK_INFO$VolumeGuidName$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$VolumeGuidName$VH_ = MemoryHandles.asAddressVarHandle(CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("VolumeGuidName")));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$VolumeGuidName$VH() { return CF_CALLBACK_INFO$VolumeGuidName$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$VolumeDosName$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$VolumeDosName$LAYOUT() { return CF_CALLBACK_INFO$VolumeDosName$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$VolumeDosName$VH_ = MemoryHandles.asAddressVarHandle(CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("VolumeDosName")));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$VolumeDosName$VH() { return CF_CALLBACK_INFO$VolumeDosName$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$VolumeSerialNumber$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$VolumeSerialNumber$LAYOUT() { return CF_CALLBACK_INFO$VolumeSerialNumber$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$VolumeSerialNumber$VH_ = CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("VolumeSerialNumber"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$VolumeSerialNumber$VH() { return CF_CALLBACK_INFO$VolumeSerialNumber$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$SyncRootIdentity$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$SyncRootIdentity$LAYOUT() { return CF_CALLBACK_INFO$SyncRootIdentity$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$SyncRootIdentity$VH_ = MemoryHandles.asAddressVarHandle(CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("SyncRootIdentity")));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$SyncRootIdentity$VH() { return CF_CALLBACK_INFO$SyncRootIdentity$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$SyncRootIdentityLength$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$SyncRootIdentityLength$LAYOUT() { return CF_CALLBACK_INFO$SyncRootIdentityLength$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$SyncRootIdentityLength$VH_ = CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("SyncRootIdentityLength"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$SyncRootIdentityLength$VH() { return CF_CALLBACK_INFO$SyncRootIdentityLength$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$FileIdentity$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$FileIdentity$LAYOUT() { return CF_CALLBACK_INFO$FileIdentity$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$FileIdentity$VH_ = MemoryHandles.asAddressVarHandle(CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("FileIdentity")));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$FileIdentity$VH() { return CF_CALLBACK_INFO$FileIdentity$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$FileIdentityLength$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$FileIdentityLength$LAYOUT() { return CF_CALLBACK_INFO$FileIdentityLength$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$FileIdentityLength$VH_ = CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("FileIdentityLength"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$FileIdentityLength$VH() { return CF_CALLBACK_INFO$FileIdentityLength$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$NormalizedPath$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$NormalizedPath$LAYOUT() { return CF_CALLBACK_INFO$NormalizedPath$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$NormalizedPath$VH_ = MemoryHandles.asAddressVarHandle(CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("NormalizedPath")));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$NormalizedPath$VH() { return CF_CALLBACK_INFO$NormalizedPath$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$PriorityHint$LAYOUT_ = C_CHAR;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$PriorityHint$LAYOUT() { return CF_CALLBACK_INFO$PriorityHint$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$PriorityHint$VH_ = CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(byte.class, MemoryLayout.PathElement.groupElement("PriorityHint"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$PriorityHint$VH() { return CF_CALLBACK_INFO$PriorityHint$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$CorrelationVector$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$CorrelationVector$LAYOUT() { return CF_CALLBACK_INFO$CorrelationVector$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$CorrelationVector$VH_ = MemoryHandles.asAddressVarHandle(CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("CorrelationVector")));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$CorrelationVector$VH() { return CF_CALLBACK_INFO$CorrelationVector$VH_; }

    static final MemoryLayout CF_CALLBACK_INFO$ProcessInfo$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_INFO$ProcessInfo$LAYOUT() { return CF_CALLBACK_INFO$ProcessInfo$LAYOUT_; }

    static final VarHandle CF_CALLBACK_INFO$ProcessInfo$VH_ = MemoryHandles.asAddressVarHandle(CF_CALLBACK_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("ProcessInfo")));
    static final java.lang.invoke.VarHandle CF_CALLBACK_INFO$ProcessInfo$VH() { return CF_CALLBACK_INFO$ProcessInfo$VH_; }

    static final int CF_CALLBACK_CANCEL_FLAG_NONE() { return (int)0L; }

    static final int CF_CALLBACK_CANCEL_FLAG_IO_TIMEOUT() { return (int)1L; }

    static final int CF_CALLBACK_CANCEL_FLAG_IO_ABORTED() { return (int)2L; }

    static final int CF_CALLBACK_FETCH_DATA_FLAG_NONE() { return (int)0L; }

    static final int CF_CALLBACK_FETCH_DATA_FLAG_RECOVERY() { return (int)1L; }

    static final int CF_CALLBACK_FETCH_DATA_FLAG_EXPLICIT_HYDRATION() { return (int)2L; }

    static final int CF_CALLBACK_VALIDATE_DATA_FLAG_NONE() { return (int)0L; }

    static final int CF_CALLBACK_VALIDATE_DATA_FLAG_EXPLICIT_HYDRATION() { return (int)2L; }

    static final int CF_CALLBACK_FETCH_PLACEHOLDERS_FLAG_NONE() { return (int)0L; }

    static final int CF_CALLBACK_OPEN_COMPLETION_FLAG_NONE() { return (int)0L; }

    static final int CF_CALLBACK_OPEN_COMPLETION_FLAG_PLACEHOLDER_UNKNOWN() { return (int)1L; }

    static final int CF_CALLBACK_OPEN_COMPLETION_FLAG_PLACEHOLDER_UNSUPPORTED() { return (int)2L; }

    static final int CF_CALLBACK_CLOSE_COMPLETION_FLAG_NONE() { return (int)0L; }

    static final int CF_CALLBACK_CLOSE_COMPLETION_FLAG_DELETED() { return (int)1L; }

    static final int CF_CALLBACK_DEHYDRATE_FLAG_NONE() { return (int)0L; }

    static final int CF_CALLBACK_DEHYDRATE_FLAG_BACKGROUND() { return (int)1L; }

    static final int CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_NONE() { return (int)0L; }

    static final int CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_BACKGROUND() { return (int)1L; }

    static final int CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_DEHYDRATED() { return (int)2L; }

    static final int CF_CALLBACK_DELETE_FLAG_NONE() { return (int)0L; }

    static final int CF_CALLBACK_DELETE_FLAG_IS_DIRECTORY() { return (int)1L; }

    static final int CF_CALLBACK_DELETE_FLAG_IS_UNDELETE() { return (int)2L; }

    static final int CF_CALLBACK_DELETE_COMPLETION_FLAG_NONE() { return (int)0L; }

    static final int CF_CALLBACK_RENAME_FLAG_NONE() { return (int)0L; }

    static final int CF_CALLBACK_RENAME_FLAG_IS_DIRECTORY() { return (int)1L; }

    static final int CF_CALLBACK_RENAME_FLAG_SOURCE_IN_SCOPE() { return (int)2L; }

    static final int CF_CALLBACK_RENAME_FLAG_TARGET_IN_SCOPE() { return (int)4L; }

    static final int CF_CALLBACK_RENAME_COMPLETION_FLAG_NONE() { return (int)0L; }

    static final int CF_CALLBACK_DEHYDRATION_REASON_NONE() { return (int)0L; }

    static final int CF_CALLBACK_DEHYDRATION_REASON_USER_MANUAL() { return (int)1L; }

    static final int CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_LOW_SPACE() { return (int)2L; }

    static final int CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_INACTIVITY() { return (int)3L; }

    static final int CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_OS_UPGRADE() { return (int)4L; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("ParamSize"),
            MemoryLayout.ofPaddingBits(32),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    MemoryLayout.ofPaddingBits(32),
                    MemoryLayout.ofStruct(
                            MemoryLayout.ofUnion(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart"),
                                    MemoryLayout.ofStruct(
                                            C_LONG.withName("LowPart"),
                                            C_LONG.withName("HighPart")
                                    ).withName("u"),
                                    C_LONGLONG.withName("QuadPart")
                            ).withName("FileOffset"),
                            MemoryLayout.ofUnion(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart"),
                                    MemoryLayout.ofStruct(
                                            C_LONG.withName("LowPart"),
                                            C_LONG.withName("HighPart")
                                    ).withName("u"),
                                    C_LONGLONG.withName("QuadPart")
                            ).withName("Length")
                    ).withName("FetchData")
            ).withName("Cancel"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    MemoryLayout.ofPaddingBits(32),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("RequiredFileOffset"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("RequiredLength"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("OptionalFileOffset"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("OptionalLength"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("LastDehydrationTime"),
                    C_INT.withName("LastDehydrationReason"),
                    MemoryLayout.ofPaddingBits(32)
            ).withName("FetchData"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    MemoryLayout.ofPaddingBits(32),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("RequiredFileOffset"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("RequiredLength")
            ).withName("ValidateData"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    MemoryLayout.ofPaddingBits(32),
                    C_POINTER.withName("Pattern")
            ).withName("FetchPlaceholders"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags")
            ).withName("OpenCompletion"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags")
            ).withName("CloseCompletion"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    C_INT.withName("Reason")
            ).withName("Dehydrate"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    C_INT.withName("Reason")
            ).withName("DehydrateCompletion"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags")
            ).withName("Delete"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags")
            ).withName("DeleteCompletion"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    MemoryLayout.ofPaddingBits(32),
                    C_POINTER.withName("TargetPath")
            ).withName("Rename"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    MemoryLayout.ofPaddingBits(32),
                    C_POINTER.withName("SourcePath")
            ).withName("RenameCompletion")
    ).withName("CF_CALLBACK_PARAMETERS");
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$ParamSize$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$ParamSize$LAYOUT() { return CF_CALLBACK_PARAMETERS$ParamSize$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$ParamSize$VH_ = CF_CALLBACK_PARAMETERS$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("ParamSize"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$ParamSize$VH() { return CF_CALLBACK_PARAMETERS$ParamSize$VH_; }

    static final MemoryLayout Cancel$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            MemoryLayout.ofPaddingBits(32),
            MemoryLayout.ofStruct(
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("FileOffset"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("Length")
            ).withName("FetchData")
    );
    static final jdk.incubator.foreign.MemoryLayout Cancel$struct$LAYOUT() { return Cancel$struct$LAYOUT_; }

    static final MemoryLayout Cancel$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout Cancel$Flags$LAYOUT() { return Cancel$Flags$LAYOUT_; }

    static final VarHandle Cancel$Flags$VH_ = Cancel$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle Cancel$Flags$VH() { return Cancel$Flags$VH_; }

    static final MemoryLayout FetchData$struct$LAYOUT_ = MemoryLayout.ofStruct(
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("FileOffset"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("Length")
    );
    static final jdk.incubator.foreign.MemoryLayout FetchData$struct$LAYOUT() { return FetchData$struct$LAYOUT_; }

    static final MemoryLayout FetchData$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout FetchData$Flags$LAYOUT() { return FetchData$Flags$LAYOUT_; }

    static final VarHandle FetchData$Flags$VH_ = FetchData$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle FetchData$Flags$VH() { return FetchData$Flags$VH_; }

    static final MemoryLayout FetchData$LastDehydrationReason$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout FetchData$LastDehydrationReason$LAYOUT() { return FetchData$LastDehydrationReason$LAYOUT_; }

    static final VarHandle FetchData$LastDehydrationReason$VH_ = FetchData$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("LastDehydrationReason"));
    static final java.lang.invoke.VarHandle FetchData$LastDehydrationReason$VH() { return FetchData$LastDehydrationReason$VH_; }

    static final MemoryLayout ValidateData$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            MemoryLayout.ofPaddingBits(32),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("RequiredFileOffset"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("RequiredLength")
    );
    static final jdk.incubator.foreign.MemoryLayout ValidateData$struct$LAYOUT() { return ValidateData$struct$LAYOUT_; }

    static final MemoryLayout ValidateData$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout ValidateData$Flags$LAYOUT() { return ValidateData$Flags$LAYOUT_; }

    static final VarHandle ValidateData$Flags$VH_ = ValidateData$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle ValidateData$Flags$VH() { return ValidateData$Flags$VH_; }

    static final MemoryLayout FetchPlaceholders$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            MemoryLayout.ofPaddingBits(32),
            C_POINTER.withName("Pattern")
    );
    static final jdk.incubator.foreign.MemoryLayout FetchPlaceholders$struct$LAYOUT() { return FetchPlaceholders$struct$LAYOUT_; }

    static final MemoryLayout FetchPlaceholders$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout FetchPlaceholders$Flags$LAYOUT() { return FetchPlaceholders$Flags$LAYOUT_; }

    static final VarHandle FetchPlaceholders$Flags$VH_ = FetchPlaceholders$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle FetchPlaceholders$Flags$VH() { return FetchPlaceholders$Flags$VH_; }

    static final MemoryLayout FetchPlaceholders$Pattern$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout FetchPlaceholders$Pattern$LAYOUT() { return FetchPlaceholders$Pattern$LAYOUT_; }

    static final VarHandle FetchPlaceholders$Pattern$VH_ = MemoryHandles.asAddressVarHandle(FetchPlaceholders$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("Pattern")));
    static final java.lang.invoke.VarHandle FetchPlaceholders$Pattern$VH() { return FetchPlaceholders$Pattern$VH_; }

    static final MemoryLayout OpenCompletion$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags")
    );
    static final jdk.incubator.foreign.MemoryLayout OpenCompletion$struct$LAYOUT() { return OpenCompletion$struct$LAYOUT_; }

    static final MemoryLayout OpenCompletion$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout OpenCompletion$Flags$LAYOUT() { return OpenCompletion$Flags$LAYOUT_; }

    static final VarHandle OpenCompletion$Flags$VH_ = OpenCompletion$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle OpenCompletion$Flags$VH() { return OpenCompletion$Flags$VH_; }

    static final MemoryLayout CloseCompletion$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags")
    );
    static final jdk.incubator.foreign.MemoryLayout CloseCompletion$struct$LAYOUT() { return CloseCompletion$struct$LAYOUT_; }

    static final MemoryLayout CloseCompletion$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CloseCompletion$Flags$LAYOUT() { return CloseCompletion$Flags$LAYOUT_; }

    static final VarHandle CloseCompletion$Flags$VH_ = CloseCompletion$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CloseCompletion$Flags$VH() { return CloseCompletion$Flags$VH_; }

    static final MemoryLayout Dehydrate$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            C_INT.withName("Reason")
    );
    static final jdk.incubator.foreign.MemoryLayout Dehydrate$struct$LAYOUT() { return Dehydrate$struct$LAYOUT_; }

    static final MemoryLayout Dehydrate$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout Dehydrate$Flags$LAYOUT() { return Dehydrate$Flags$LAYOUT_; }

    static final VarHandle Dehydrate$Flags$VH_ = Dehydrate$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle Dehydrate$Flags$VH() { return Dehydrate$Flags$VH_; }

    static final MemoryLayout Dehydrate$Reason$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout Dehydrate$Reason$LAYOUT() { return Dehydrate$Reason$LAYOUT_; }

    static final VarHandle Dehydrate$Reason$VH_ = Dehydrate$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Reason"));
    static final java.lang.invoke.VarHandle Dehydrate$Reason$VH() { return Dehydrate$Reason$VH_; }

    static final MemoryLayout DehydrateCompletion$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            C_INT.withName("Reason")
    );
    static final jdk.incubator.foreign.MemoryLayout DehydrateCompletion$struct$LAYOUT() { return DehydrateCompletion$struct$LAYOUT_; }

    static final MemoryLayout DehydrateCompletion$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout DehydrateCompletion$Flags$LAYOUT() { return DehydrateCompletion$Flags$LAYOUT_; }

    static final VarHandle DehydrateCompletion$Flags$VH_ = DehydrateCompletion$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle DehydrateCompletion$Flags$VH() { return DehydrateCompletion$Flags$VH_; }

    static final MemoryLayout DehydrateCompletion$Reason$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout DehydrateCompletion$Reason$LAYOUT() { return DehydrateCompletion$Reason$LAYOUT_; }

    static final VarHandle DehydrateCompletion$Reason$VH_ = DehydrateCompletion$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Reason"));
    static final java.lang.invoke.VarHandle DehydrateCompletion$Reason$VH() { return DehydrateCompletion$Reason$VH_; }

    static final MemoryLayout Delete$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags")
    );
    static final jdk.incubator.foreign.MemoryLayout Delete$struct$LAYOUT() { return Delete$struct$LAYOUT_; }

    static final MemoryLayout Delete$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout Delete$Flags$LAYOUT() { return Delete$Flags$LAYOUT_; }

    static final VarHandle Delete$Flags$VH_ = Delete$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle Delete$Flags$VH() { return Delete$Flags$VH_; }

    static final MemoryLayout DeleteCompletion$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags")
    );
    static final jdk.incubator.foreign.MemoryLayout DeleteCompletion$struct$LAYOUT() { return DeleteCompletion$struct$LAYOUT_; }

    static final MemoryLayout DeleteCompletion$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout DeleteCompletion$Flags$LAYOUT() { return DeleteCompletion$Flags$LAYOUT_; }

    static final VarHandle DeleteCompletion$Flags$VH_ = DeleteCompletion$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle DeleteCompletion$Flags$VH() { return DeleteCompletion$Flags$VH_; }

    static final MemoryLayout Rename$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            MemoryLayout.ofPaddingBits(32),
            C_POINTER.withName("TargetPath")
    );
    static final jdk.incubator.foreign.MemoryLayout Rename$struct$LAYOUT() { return Rename$struct$LAYOUT_; }

    static final MemoryLayout Rename$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout Rename$Flags$LAYOUT() { return Rename$Flags$LAYOUT_; }

    static final VarHandle Rename$Flags$VH_ = Rename$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle Rename$Flags$VH() { return Rename$Flags$VH_; }

    static final MemoryLayout Rename$TargetPath$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout Rename$TargetPath$LAYOUT() { return Rename$TargetPath$LAYOUT_; }

    static final VarHandle Rename$TargetPath$VH_ = MemoryHandles.asAddressVarHandle(Rename$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("TargetPath")));
    static final java.lang.invoke.VarHandle Rename$TargetPath$VH() { return Rename$TargetPath$VH_; }

    static final MemoryLayout RenameCompletion$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            MemoryLayout.ofPaddingBits(32),
            C_POINTER.withName("SourcePath")
    );
    static final jdk.incubator.foreign.MemoryLayout RenameCompletion$struct$LAYOUT() { return RenameCompletion$struct$LAYOUT_; }

    static final MemoryLayout RenameCompletion$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout RenameCompletion$Flags$LAYOUT() { return RenameCompletion$Flags$LAYOUT_; }

    static final VarHandle RenameCompletion$Flags$VH_ = RenameCompletion$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle RenameCompletion$Flags$VH() { return RenameCompletion$Flags$VH_; }

    static final MemoryLayout RenameCompletion$SourcePath$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout RenameCompletion$SourcePath$LAYOUT() { return RenameCompletion$SourcePath$LAYOUT_; }

    static final VarHandle RenameCompletion$SourcePath$VH_ = MemoryHandles.asAddressVarHandle(RenameCompletion$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("SourcePath")));
    static final java.lang.invoke.VarHandle RenameCompletion$SourcePath$VH() { return RenameCompletion$SourcePath$VH_; }

    static final int CF_CALLBACK_TYPE_FETCH_DATA() { return (int)0L; }

    static final int CF_CALLBACK_TYPE_VALIDATE_DATA() { return (int)1L; }

    static final int CF_CALLBACK_TYPE_CANCEL_FETCH_DATA() { return (int)2L; }

    static final int CF_CALLBACK_TYPE_FETCH_PLACEHOLDERS() { return (int)3L; }

    static final int CF_CALLBACK_TYPE_CANCEL_FETCH_PLACEHOLDERS() { return (int)4L; }

    static final int CF_CALLBACK_TYPE_NOTIFY_FILE_OPEN_COMPLETION() { return (int)5L; }

    static final int CF_CALLBACK_TYPE_NOTIFY_FILE_CLOSE_COMPLETION() { return (int)6L; }

    static final int CF_CALLBACK_TYPE_NOTIFY_DEHYDRATE() { return (int)7L; }

    static final int CF_CALLBACK_TYPE_NOTIFY_DEHYDRATE_COMPLETION() { return (int)8L; }

    static final int CF_CALLBACK_TYPE_NOTIFY_DELETE() { return (int)9L; }

    static final int CF_CALLBACK_TYPE_NOTIFY_DELETE_COMPLETION() { return (int)10L; }

    static final int CF_CALLBACK_TYPE_NOTIFY_RENAME() { return (int)11L; }

    static final int CF_CALLBACK_TYPE_NOTIFY_RENAME_COMPLETION() { return (int)12L; }

    static final int CF_CALLBACK_TYPE_NONE() { return (int)-1L; }

    static final MemoryLayout CF_CALLBACK_REGISTRATION$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Type"),
            MemoryLayout.ofPaddingBits(32),
            C_POINTER.withName("Callback")
    ).withName("CF_CALLBACK_REGISTRATION");
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_REGISTRATION$struct$LAYOUT() { return CF_CALLBACK_REGISTRATION$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_REGISTRATION$Type$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_REGISTRATION$Type$LAYOUT() { return CF_CALLBACK_REGISTRATION$Type$LAYOUT_; }

    static final VarHandle CF_CALLBACK_REGISTRATION$Type$VH_ = CF_CALLBACK_REGISTRATION$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Type"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_REGISTRATION$Type$VH() { return CF_CALLBACK_REGISTRATION$Type$VH_; }

    static final MemoryLayout CF_CALLBACK_REGISTRATION$Callback$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_REGISTRATION$Callback$LAYOUT() { return CF_CALLBACK_REGISTRATION$Callback$LAYOUT_; }

    static final VarHandle CF_CALLBACK_REGISTRATION$Callback$VH_ = MemoryHandles.asAddressVarHandle(CF_CALLBACK_REGISTRATION$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("Callback")));
    static final java.lang.invoke.VarHandle CF_CALLBACK_REGISTRATION$Callback$VH() { return CF_CALLBACK_REGISTRATION$Callback$VH_; }


    static final int CF_CONNECT_FLAG_NONE() { return (int)0L; }

    static final int CF_CONNECT_FLAG_REQUIRE_PROCESS_INFO() { return (int)2L; }

    static final int CF_CONNECT_FLAG_REQUIRE_FULL_FILE_PATH() { return (int)4L; }

    static final int CF_CONNECT_FLAG_BLOCK_SELF_IMPLICIT_HYDRATION() { return (int)8L; }

    static final FunctionDescriptor CfConnectSyncRoot$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER,
            C_POINTER,
            C_INT,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfConnectSyncRoot$FUNC() { return CfConnectSyncRoot$FUNC_; }

    static final MethodHandle CfConnectSyncRoot$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfConnectSyncRoot",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
            CfConnectSyncRoot$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfConnectSyncRoot$MH() { return CfConnectSyncRoot$MH_; }

    static final FunctionDescriptor CfUnregisterSyncRoot$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfUnregisterSyncRoot$FUNC() { return CfUnregisterSyncRoot$FUNC_; }

    static final MethodHandle CfUnregisterSyncRoot$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfUnregisterSyncRoot",
            "(Ljdk/incubator/foreign/MemoryAddress;)I",
            CfUnregisterSyncRoot$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfUnregisterSyncRoot$MH() { return CfUnregisterSyncRoot$MH_; }
}
