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

class cfapi_h$constants$99 extends cfapi_h$constants$28 {

    static final MemoryLayout CF_CONNECTION_KEY__$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONGLONG.withName("Internal")
    ).withName("CF_CONNECTION_KEY__");
    static final jdk.incubator.foreign.MemoryLayout CF_CONNECTION_KEY__$struct$LAYOUT() { return CF_CONNECTION_KEY__$struct$LAYOUT_; }

    static final MemoryLayout CF_CONNECTION_KEY__$Internal$LAYOUT_ = C_LONGLONG;
    static final jdk.incubator.foreign.MemoryLayout CF_CONNECTION_KEY__$Internal$LAYOUT() { return CF_CONNECTION_KEY__$Internal$LAYOUT_; }

    static final VarHandle CF_CONNECTION_KEY__$Internal$VH_ = CF_CONNECTION_KEY__$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("Internal"));
    static final java.lang.invoke.VarHandle CF_CONNECTION_KEY__$Internal$VH() { return CF_CONNECTION_KEY__$Internal$VH_; }

    static final MemoryLayout CF_FS_METADATA$struct$LAYOUT_ = MemoryLayout.ofStruct(
            MemoryLayout.ofStruct(
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("CreationTime"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("LastAccessTime"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("LastWriteTime"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("ChangeTime"),
                    C_LONG.withName("FileAttributes"),
                    MemoryLayout.ofPaddingBits(32)
            ).withName("BasicInfo"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("FileSize")
    ).withName("CF_FS_METADATA");
    static final jdk.incubator.foreign.MemoryLayout CF_FS_METADATA$struct$LAYOUT() { return CF_FS_METADATA$struct$LAYOUT_; }

    static final int CF_PLACEHOLDER_CREATE_FLAG_NONE() { return (int)0L; }

    static final int CF_PLACEHOLDER_CREATE_FLAG_DISABLE_ON_DEMAND_POPULATION() { return (int)1L; }

    static final int CF_PLACEHOLDER_CREATE_FLAG_MARK_IN_SYNC() { return (int)2L; }

    static final int CF_PLACEHOLDER_CREATE_FLAG_SUPERSEDE() { return (int)4L; }

    static final int CF_PLACEHOLDER_CREATE_FLAG_ALWAYS_FULL() { return (int)8L; }

    static final MemoryLayout CF_PLACEHOLDER_CREATE_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_POINTER.withName("RelativeFileName"),
            MemoryLayout.ofStruct(
                    MemoryLayout.ofStruct(
                            MemoryLayout.ofUnion(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart"),
                                    MemoryLayout.ofStruct(
                                            C_LONG.withName("LowPart"),
                                            C_LONG.withName("HighPart")
                                    ).withName("u"),
                                    C_LONGLONG.withName("QuadPart")
                            ).withName("CreationTime"),
                            MemoryLayout.ofUnion(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart"),
                                    MemoryLayout.ofStruct(
                                            C_LONG.withName("LowPart"),
                                            C_LONG.withName("HighPart")
                                    ).withName("u"),
                                    C_LONGLONG.withName("QuadPart")
                            ).withName("LastAccessTime"),
                            MemoryLayout.ofUnion(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart"),
                                    MemoryLayout.ofStruct(
                                            C_LONG.withName("LowPart"),
                                            C_LONG.withName("HighPart")
                                    ).withName("u"),
                                    C_LONGLONG.withName("QuadPart")
                            ).withName("LastWriteTime"),
                            MemoryLayout.ofUnion(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart"),
                                    MemoryLayout.ofStruct(
                                            C_LONG.withName("LowPart"),
                                            C_LONG.withName("HighPart")
                                    ).withName("u"),
                                    C_LONGLONG.withName("QuadPart")
                            ).withName("ChangeTime"),
                            C_LONG.withName("FileAttributes"),
                            MemoryLayout.ofPaddingBits(32)
                    ).withName("BasicInfo"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("FileSize")
            ).withName("FsMetadata"),
            C_POINTER.withName("FileIdentity"),
            C_LONG.withName("FileIdentityLength"),
            C_INT.withName("Flags"),
            C_LONG.withName("Result"),
            MemoryLayout.ofPaddingBits(32),
            C_LONGLONG.withName("CreateUsn")
    ).withName("CF_PLACEHOLDER_CREATE_INFO");
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_CREATE_INFO$struct$LAYOUT() { return CF_PLACEHOLDER_CREATE_INFO$struct$LAYOUT_; }

    static final MemoryLayout CF_PLACEHOLDER_CREATE_INFO$RelativeFileName$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_CREATE_INFO$RelativeFileName$LAYOUT() { return CF_PLACEHOLDER_CREATE_INFO$RelativeFileName$LAYOUT_; }

    static final VarHandle CF_PLACEHOLDER_CREATE_INFO$RelativeFileName$VH_ = MemoryHandles.asAddressVarHandle(CF_PLACEHOLDER_CREATE_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("RelativeFileName")));
    static final java.lang.invoke.VarHandle CF_PLACEHOLDER_CREATE_INFO$RelativeFileName$VH() { return CF_PLACEHOLDER_CREATE_INFO$RelativeFileName$VH_; }

    static final MemoryLayout CF_PLACEHOLDER_CREATE_INFO$FileIdentity$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_CREATE_INFO$FileIdentity$LAYOUT() { return CF_PLACEHOLDER_CREATE_INFO$FileIdentity$LAYOUT_; }

    static final VarHandle CF_PLACEHOLDER_CREATE_INFO$FileIdentity$VH_ = MemoryHandles.asAddressVarHandle(CF_PLACEHOLDER_CREATE_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("FileIdentity")));
    static final java.lang.invoke.VarHandle CF_PLACEHOLDER_CREATE_INFO$FileIdentity$VH() { return CF_PLACEHOLDER_CREATE_INFO$FileIdentity$VH_; }

    static final MemoryLayout CF_PLACEHOLDER_CREATE_INFO$FileIdentityLength$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_CREATE_INFO$FileIdentityLength$LAYOUT() { return CF_PLACEHOLDER_CREATE_INFO$FileIdentityLength$LAYOUT_; }

    static final VarHandle CF_PLACEHOLDER_CREATE_INFO$FileIdentityLength$VH_ = CF_PLACEHOLDER_CREATE_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("FileIdentityLength"));
    static final java.lang.invoke.VarHandle CF_PLACEHOLDER_CREATE_INFO$FileIdentityLength$VH() { return CF_PLACEHOLDER_CREATE_INFO$FileIdentityLength$VH_; }

    static final MemoryLayout CF_PLACEHOLDER_CREATE_INFO$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_CREATE_INFO$Flags$LAYOUT() { return CF_PLACEHOLDER_CREATE_INFO$Flags$LAYOUT_; }

    static final VarHandle CF_PLACEHOLDER_CREATE_INFO$Flags$VH_ = CF_PLACEHOLDER_CREATE_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_PLACEHOLDER_CREATE_INFO$Flags$VH() { return CF_PLACEHOLDER_CREATE_INFO$Flags$VH_; }

    static final MemoryLayout CF_PLACEHOLDER_CREATE_INFO$Result$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_CREATE_INFO$Result$LAYOUT() { return CF_PLACEHOLDER_CREATE_INFO$Result$LAYOUT_; }

    static final VarHandle CF_PLACEHOLDER_CREATE_INFO$Result$VH_ = CF_PLACEHOLDER_CREATE_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Result"));
    static final java.lang.invoke.VarHandle CF_PLACEHOLDER_CREATE_INFO$Result$VH() { return CF_PLACEHOLDER_CREATE_INFO$Result$VH_; }

    static final MemoryLayout CF_PLACEHOLDER_CREATE_INFO$CreateUsn$LAYOUT_ = C_LONGLONG;
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_CREATE_INFO$CreateUsn$LAYOUT() { return CF_PLACEHOLDER_CREATE_INFO$CreateUsn$LAYOUT_; }

    static final VarHandle CF_PLACEHOLDER_CREATE_INFO$CreateUsn$VH_ = CF_PLACEHOLDER_CREATE_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("CreateUsn"));
    static final java.lang.invoke.VarHandle CF_PLACEHOLDER_CREATE_INFO$CreateUsn$VH() { return CF_PLACEHOLDER_CREATE_INFO$CreateUsn$VH_; }

    static final int CF_PROVIDER_STATUS_DISCONNECTED() { return (int)0L; }

    static final int CF_PROVIDER_STATUS_IDLE() { return (int)1L; }

    static final int CF_PROVIDER_STATUS_POPULATE_NAMESPACE() { return (int)2L; }

    static final int CF_PROVIDER_STATUS_POPULATE_METADATA() { return (int)4L; }

    static final int CF_PROVIDER_STATUS_POPULATE_CONTENT() { return (int)8L; }

    static final int CF_PROVIDER_STATUS_SYNC_INCREMENTAL() { return (int)16L; }

    static final int CF_PROVIDER_STATUS_SYNC_FULL() { return (int)32L; }

    static final int CF_PROVIDER_STATUS_CONNECTIVITY_LOST() { return (int)64L; }

    static final int CF_PROVIDER_STATUS_CLEAR_FLAGS() { return (int)-2147483648L; }

    static final int CF_PROVIDER_STATUS_TERMINATED() { return (int)-1073741823L; }

    static final int CF_PROVIDER_STATUS_ERROR() { return (int)-1073741822L; }

    static final MemoryLayout CF_PROCESS_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("StructSize"),
            C_LONG.withName("ProcessId"),
            C_POINTER.withName("ImagePath"),
            C_POINTER.withName("PackageName"),
            C_POINTER.withName("ApplicationId"),
            C_POINTER.withName("CommandLine"),
            C_LONG.withName("SessionId"),
            MemoryLayout.ofPaddingBits(32)
    ).withName("CF_PROCESS_INFO");
    static final jdk.incubator.foreign.MemoryLayout CF_PROCESS_INFO$struct$LAYOUT() { return CF_PROCESS_INFO$struct$LAYOUT_; }

    static final MemoryLayout CF_PROCESS_INFO$StructSize$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_PROCESS_INFO$StructSize$LAYOUT() { return CF_PROCESS_INFO$StructSize$LAYOUT_; }

    static final VarHandle CF_PROCESS_INFO$StructSize$VH_ = CF_PROCESS_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("StructSize"));
    static final java.lang.invoke.VarHandle CF_PROCESS_INFO$StructSize$VH() { return CF_PROCESS_INFO$StructSize$VH_; }

    static final MemoryLayout CF_PROCESS_INFO$ProcessId$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_PROCESS_INFO$ProcessId$LAYOUT() { return CF_PROCESS_INFO$ProcessId$LAYOUT_; }

    static final VarHandle CF_PROCESS_INFO$ProcessId$VH_ = CF_PROCESS_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("ProcessId"));
    static final java.lang.invoke.VarHandle CF_PROCESS_INFO$ProcessId$VH() { return CF_PROCESS_INFO$ProcessId$VH_; }

    static final MemoryLayout CF_PROCESS_INFO$ImagePath$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_PROCESS_INFO$ImagePath$LAYOUT() { return CF_PROCESS_INFO$ImagePath$LAYOUT_; }

    static final VarHandle CF_PROCESS_INFO$ImagePath$VH_ = MemoryHandles.asAddressVarHandle(CF_PROCESS_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("ImagePath")));
    static final java.lang.invoke.VarHandle CF_PROCESS_INFO$ImagePath$VH() { return CF_PROCESS_INFO$ImagePath$VH_; }

    static final MemoryLayout CF_PROCESS_INFO$PackageName$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_PROCESS_INFO$PackageName$LAYOUT() { return CF_PROCESS_INFO$PackageName$LAYOUT_; }

    static final VarHandle CF_PROCESS_INFO$PackageName$VH_ = MemoryHandles.asAddressVarHandle(CF_PROCESS_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("PackageName")));
    static final java.lang.invoke.VarHandle CF_PROCESS_INFO$PackageName$VH() { return CF_PROCESS_INFO$PackageName$VH_; }

    static final MemoryLayout CF_PROCESS_INFO$ApplicationId$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_PROCESS_INFO$ApplicationId$LAYOUT() { return CF_PROCESS_INFO$ApplicationId$LAYOUT_; }

    static final VarHandle CF_PROCESS_INFO$ApplicationId$VH_ = MemoryHandles.asAddressVarHandle(CF_PROCESS_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("ApplicationId")));
    static final java.lang.invoke.VarHandle CF_PROCESS_INFO$ApplicationId$VH() { return CF_PROCESS_INFO$ApplicationId$VH_; }

    static final MemoryLayout CF_PROCESS_INFO$CommandLine$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_PROCESS_INFO$CommandLine$LAYOUT() { return CF_PROCESS_INFO$CommandLine$LAYOUT_; }

    static final VarHandle CF_PROCESS_INFO$CommandLine$VH_ = MemoryHandles.asAddressVarHandle(CF_PROCESS_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("CommandLine")));
    static final java.lang.invoke.VarHandle CF_PROCESS_INFO$CommandLine$VH() { return CF_PROCESS_INFO$CommandLine$VH_; }

    static final MemoryLayout CF_PROCESS_INFO$SessionId$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_PROCESS_INFO$SessionId$LAYOUT() { return CF_PROCESS_INFO$SessionId$LAYOUT_; }

    static final VarHandle CF_PROCESS_INFO$SessionId$VH_ = CF_PROCESS_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("SessionId"));
    static final java.lang.invoke.VarHandle CF_PROCESS_INFO$SessionId$VH() { return CF_PROCESS_INFO$SessionId$VH_; }

    static final MemoryLayout CF_PLATFORM_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("BuildNumber"),
            C_LONG.withName("RevisionNumber"),
            C_LONG.withName("IntegrationNumber")
    ).withName("CF_PLATFORM_INFO");
    static final jdk.incubator.foreign.MemoryLayout CF_PLATFORM_INFO$struct$LAYOUT() { return CF_PLATFORM_INFO$struct$LAYOUT_; }

    static final MemoryLayout CF_PLATFORM_INFO$BuildNumber$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_PLATFORM_INFO$BuildNumber$LAYOUT() { return CF_PLATFORM_INFO$BuildNumber$LAYOUT_; }

    static final VarHandle CF_PLATFORM_INFO$BuildNumber$VH_ = CF_PLATFORM_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("BuildNumber"));
    static final java.lang.invoke.VarHandle CF_PLATFORM_INFO$BuildNumber$VH() { return CF_PLATFORM_INFO$BuildNumber$VH_; }

    static final MemoryLayout CF_PLATFORM_INFO$RevisionNumber$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_PLATFORM_INFO$RevisionNumber$LAYOUT() { return CF_PLATFORM_INFO$RevisionNumber$LAYOUT_; }

    static final VarHandle CF_PLATFORM_INFO$RevisionNumber$VH_ = CF_PLATFORM_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("RevisionNumber"));
    static final java.lang.invoke.VarHandle CF_PLATFORM_INFO$RevisionNumber$VH() { return CF_PLATFORM_INFO$RevisionNumber$VH_; }

    static final MemoryLayout CF_PLATFORM_INFO$IntegrationNumber$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_PLATFORM_INFO$IntegrationNumber$LAYOUT() { return CF_PLATFORM_INFO$IntegrationNumber$LAYOUT_; }

    static final VarHandle CF_PLATFORM_INFO$IntegrationNumber$VH_ = CF_PLATFORM_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("IntegrationNumber"));
    static final java.lang.invoke.VarHandle CF_PLATFORM_INFO$IntegrationNumber$VH() { return CF_PLATFORM_INFO$IntegrationNumber$VH_; }

    static final FunctionDescriptor CfGetPlatformInfo$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfGetPlatformInfo$FUNC() { return CfGetPlatformInfo$FUNC_; }

    static final MethodHandle CfGetPlatformInfo$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfGetPlatformInfo",
            "(Ljdk/incubator/foreign/MemoryAddress;)I",
            CfGetPlatformInfo$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfGetPlatformInfo$MH() { return CfGetPlatformInfo$MH_; }

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

    static final MemoryLayout CF_CALLBACK_PARAMETERS$Cancel$struct$LAYOUT_ = MemoryLayout.ofStruct(
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
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$Cancel$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$Cancel$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$Cancel$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$Cancel$Flags$LAYOUT() { return CF_CALLBACK_PARAMETERS$Cancel$Flags$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$Cancel$Flags$VH_ = CF_CALLBACK_PARAMETERS$Cancel$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$Cancel$Flags$VH() { return CF_CALLBACK_PARAMETERS$Cancel$Flags$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$Cancel$FetchData$struct$LAYOUT_ = MemoryLayout.ofStruct(
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
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$Cancel$FetchData$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$Cancel$FetchData$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$FetchData$struct$LAYOUT_ = MemoryLayout.ofStruct(
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
    );
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$FetchData$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$FetchData$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$FetchData$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$FetchData$Flags$LAYOUT() { return CF_CALLBACK_PARAMETERS$FetchData$Flags$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$FetchData$Flags$VH_ = CF_CALLBACK_PARAMETERS$FetchData$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$FetchData$Flags$VH() { return CF_CALLBACK_PARAMETERS$FetchData$Flags$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$FetchData$LastDehydrationReason$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$FetchData$LastDehydrationReason$LAYOUT() { return CF_CALLBACK_PARAMETERS$FetchData$LastDehydrationReason$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$FetchData$LastDehydrationReason$VH_ = CF_CALLBACK_PARAMETERS$FetchData$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("LastDehydrationReason"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$FetchData$LastDehydrationReason$VH() { return CF_CALLBACK_PARAMETERS$FetchData$LastDehydrationReason$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$ValidateData$struct$LAYOUT_ = MemoryLayout.ofStruct(
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
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$ValidateData$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$ValidateData$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$ValidateData$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$ValidateData$Flags$LAYOUT() { return CF_CALLBACK_PARAMETERS$ValidateData$Flags$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$ValidateData$Flags$VH_ = CF_CALLBACK_PARAMETERS$ValidateData$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$ValidateData$Flags$VH() { return CF_CALLBACK_PARAMETERS$ValidateData$Flags$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$FetchPlaceholders$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            MemoryLayout.ofPaddingBits(32),
            C_POINTER.withName("Pattern")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$FetchPlaceholders$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$FetchPlaceholders$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$FetchPlaceholders$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$FetchPlaceholders$Flags$LAYOUT() { return CF_CALLBACK_PARAMETERS$FetchPlaceholders$Flags$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$FetchPlaceholders$Flags$VH_ = CF_CALLBACK_PARAMETERS$FetchPlaceholders$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$FetchPlaceholders$Flags$VH() { return CF_CALLBACK_PARAMETERS$FetchPlaceholders$Flags$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$FetchPlaceholders$Pattern$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$FetchPlaceholders$Pattern$LAYOUT() { return CF_CALLBACK_PARAMETERS$FetchPlaceholders$Pattern$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$FetchPlaceholders$Pattern$VH_ = MemoryHandles.asAddressVarHandle(CF_CALLBACK_PARAMETERS$FetchPlaceholders$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("Pattern")));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$FetchPlaceholders$Pattern$VH() { return CF_CALLBACK_PARAMETERS$FetchPlaceholders$Pattern$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$OpenCompletion$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$OpenCompletion$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$OpenCompletion$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$OpenCompletion$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$OpenCompletion$Flags$LAYOUT() { return CF_CALLBACK_PARAMETERS$OpenCompletion$Flags$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$OpenCompletion$Flags$VH_ = CF_CALLBACK_PARAMETERS$OpenCompletion$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$OpenCompletion$Flags$VH() { return CF_CALLBACK_PARAMETERS$OpenCompletion$Flags$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$CloseCompletion$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$CloseCompletion$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$CloseCompletion$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$CloseCompletion$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$CloseCompletion$Flags$LAYOUT() { return CF_CALLBACK_PARAMETERS$CloseCompletion$Flags$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$CloseCompletion$Flags$VH_ = CF_CALLBACK_PARAMETERS$CloseCompletion$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$CloseCompletion$Flags$VH() { return CF_CALLBACK_PARAMETERS$CloseCompletion$Flags$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$Dehydrate$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            C_INT.withName("Reason")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$Dehydrate$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$Dehydrate$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$Dehydrate$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$Dehydrate$Flags$LAYOUT() { return CF_CALLBACK_PARAMETERS$Dehydrate$Flags$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$Dehydrate$Flags$VH_ = CF_CALLBACK_PARAMETERS$Dehydrate$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$Dehydrate$Flags$VH() { return CF_CALLBACK_PARAMETERS$Dehydrate$Flags$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$Dehydrate$Reason$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$Dehydrate$Reason$LAYOUT() { return CF_CALLBACK_PARAMETERS$Dehydrate$Reason$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$Dehydrate$Reason$VH_ = CF_CALLBACK_PARAMETERS$Dehydrate$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Reason"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$Dehydrate$Reason$VH() { return CF_CALLBACK_PARAMETERS$Dehydrate$Reason$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$DehydrateCompletion$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            C_INT.withName("Reason")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$DehydrateCompletion$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$DehydrateCompletion$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$DehydrateCompletion$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$DehydrateCompletion$Flags$LAYOUT() { return CF_CALLBACK_PARAMETERS$DehydrateCompletion$Flags$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$DehydrateCompletion$Flags$VH_ = CF_CALLBACK_PARAMETERS$DehydrateCompletion$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$DehydrateCompletion$Flags$VH() { return CF_CALLBACK_PARAMETERS$DehydrateCompletion$Flags$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$DehydrateCompletion$Reason$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$DehydrateCompletion$Reason$LAYOUT() { return CF_CALLBACK_PARAMETERS$DehydrateCompletion$Reason$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$DehydrateCompletion$Reason$VH_ = CF_CALLBACK_PARAMETERS$DehydrateCompletion$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Reason"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$DehydrateCompletion$Reason$VH() { return CF_CALLBACK_PARAMETERS$DehydrateCompletion$Reason$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$Delete$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$Delete$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$Delete$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$Delete$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$Delete$Flags$LAYOUT() { return CF_CALLBACK_PARAMETERS$Delete$Flags$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$Delete$Flags$VH_ = CF_CALLBACK_PARAMETERS$Delete$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$Delete$Flags$VH() { return CF_CALLBACK_PARAMETERS$Delete$Flags$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$DeleteCompletion$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$DeleteCompletion$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$DeleteCompletion$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$DeleteCompletion$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$DeleteCompletion$Flags$LAYOUT() { return CF_CALLBACK_PARAMETERS$DeleteCompletion$Flags$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$DeleteCompletion$Flags$VH_ = CF_CALLBACK_PARAMETERS$DeleteCompletion$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$DeleteCompletion$Flags$VH() { return CF_CALLBACK_PARAMETERS$DeleteCompletion$Flags$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$Rename$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            MemoryLayout.ofPaddingBits(32),
            C_POINTER.withName("TargetPath")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$Rename$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$Rename$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$Rename$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$Rename$Flags$LAYOUT() { return CF_CALLBACK_PARAMETERS$Rename$Flags$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$Rename$Flags$VH_ = CF_CALLBACK_PARAMETERS$Rename$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$Rename$Flags$VH() { return CF_CALLBACK_PARAMETERS$Rename$Flags$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$Rename$TargetPath$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$Rename$TargetPath$LAYOUT() { return CF_CALLBACK_PARAMETERS$Rename$TargetPath$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$Rename$TargetPath$VH_ = MemoryHandles.asAddressVarHandle(CF_CALLBACK_PARAMETERS$Rename$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("TargetPath")));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$Rename$TargetPath$VH() { return CF_CALLBACK_PARAMETERS$Rename$TargetPath$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$RenameCompletion$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            MemoryLayout.ofPaddingBits(32),
            C_POINTER.withName("SourcePath")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$RenameCompletion$struct$LAYOUT() { return CF_CALLBACK_PARAMETERS$RenameCompletion$struct$LAYOUT_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$RenameCompletion$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$RenameCompletion$Flags$LAYOUT() { return CF_CALLBACK_PARAMETERS$RenameCompletion$Flags$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$RenameCompletion$Flags$VH_ = CF_CALLBACK_PARAMETERS$RenameCompletion$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$RenameCompletion$Flags$VH() { return CF_CALLBACK_PARAMETERS$RenameCompletion$Flags$VH_; }

    static final MemoryLayout CF_CALLBACK_PARAMETERS$RenameCompletion$SourcePath$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_CALLBACK_PARAMETERS$RenameCompletion$SourcePath$LAYOUT() { return CF_CALLBACK_PARAMETERS$RenameCompletion$SourcePath$LAYOUT_; }

    static final VarHandle CF_CALLBACK_PARAMETERS$RenameCompletion$SourcePath$VH_ = MemoryHandles.asAddressVarHandle(CF_CALLBACK_PARAMETERS$RenameCompletion$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("SourcePath")));
    static final java.lang.invoke.VarHandle CF_CALLBACK_PARAMETERS$RenameCompletion$SourcePath$VH() { return CF_CALLBACK_PARAMETERS$RenameCompletion$SourcePath$VH_; }

    static final FunctionDescriptor OnFetchData$FUNC_ = FunctionDescriptor.ofVoid(
            C_POINTER,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor OnFetchData$FUNC() { return OnFetchData$FUNC_; }

    static final MethodHandle OnFetchData$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "OnFetchData",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
            OnFetchData$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle OnFetchData$MH() { return OnFetchData$MH_; }

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

    static final FunctionDescriptor CfDisconnectSyncRoot$FUNC_ = FunctionDescriptor.of(C_LONG,
            MemoryLayout.ofStruct(
                    C_LONGLONG.withName("Internal")
            ).withName("CF_CONNECTION_KEY__")
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfDisconnectSyncRoot$FUNC() { return CfDisconnectSyncRoot$FUNC_; }

    static final MethodHandle CfDisconnectSyncRoot$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfDisconnectSyncRoot",
            "(Ljdk/incubator/foreign/MemorySegment;)I",
            CfDisconnectSyncRoot$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfDisconnectSyncRoot$MH() { return CfDisconnectSyncRoot$MH_; }

    static final FunctionDescriptor CfGetTransferKey$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfGetTransferKey$FUNC() { return CfGetTransferKey$FUNC_; }

    static final MethodHandle CfGetTransferKey$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfGetTransferKey",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            CfGetTransferKey$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfGetTransferKey$MH() { return CfGetTransferKey$MH_; }

    static final FunctionDescriptor CfReleaseTransferKey$FUNC_ = FunctionDescriptor.ofVoid(
            C_POINTER,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfReleaseTransferKey$FUNC() { return CfReleaseTransferKey$FUNC_; }

    static final MethodHandle CfReleaseTransferKey$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfReleaseTransferKey",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
            CfReleaseTransferKey$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfReleaseTransferKey$MH() { return CfReleaseTransferKey$MH_; }

    static final int CF_OPERATION_TYPE_TRANSFER_DATA() { return (int)0L; }

    static final int CF_OPERATION_TYPE_RETRIEVE_DATA() { return (int)1L; }

    static final int CF_OPERATION_TYPE_ACK_DATA() { return (int)2L; }

    static final int CF_OPERATION_TYPE_RESTART_HYDRATION() { return (int)3L; }

    static final int CF_OPERATION_TYPE_TRANSFER_PLACEHOLDERS() { return (int)4L; }

    static final int CF_OPERATION_TYPE_ACK_DEHYDRATE() { return (int)5L; }

    static final int CF_OPERATION_TYPE_ACK_DELETE() { return (int)6L; }

    static final int CF_OPERATION_TYPE_ACK_RENAME() { return (int)7L; }

    static final MemoryLayout CF_SYNC_STATUS$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("StructSize"),
            C_LONG.withName("Code"),
            C_LONG.withName("DescriptionOffset"),
            C_LONG.withName("DescriptionLength"),
            C_LONG.withName("DeviceIdOffset"),
            C_LONG.withName("DeviceIdLength")
    ).withName("CF_SYNC_STATUS");
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_STATUS$struct$LAYOUT() { return CF_SYNC_STATUS$struct$LAYOUT_; }

    static final MemoryLayout CF_SYNC_STATUS$StructSize$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_STATUS$StructSize$LAYOUT() { return CF_SYNC_STATUS$StructSize$LAYOUT_; }

    static final VarHandle CF_SYNC_STATUS$StructSize$VH_ = CF_SYNC_STATUS$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("StructSize"));
    static final java.lang.invoke.VarHandle CF_SYNC_STATUS$StructSize$VH() { return CF_SYNC_STATUS$StructSize$VH_; }

    static final MemoryLayout CF_SYNC_STATUS$Code$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_STATUS$Code$LAYOUT() { return CF_SYNC_STATUS$Code$LAYOUT_; }

    static final VarHandle CF_SYNC_STATUS$Code$VH_ = CF_SYNC_STATUS$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Code"));
    static final java.lang.invoke.VarHandle CF_SYNC_STATUS$Code$VH() { return CF_SYNC_STATUS$Code$VH_; }

    static final MemoryLayout CF_SYNC_STATUS$DescriptionOffset$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_STATUS$DescriptionOffset$LAYOUT() { return CF_SYNC_STATUS$DescriptionOffset$LAYOUT_; }

    static final VarHandle CF_SYNC_STATUS$DescriptionOffset$VH_ = CF_SYNC_STATUS$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("DescriptionOffset"));
    static final java.lang.invoke.VarHandle CF_SYNC_STATUS$DescriptionOffset$VH() { return CF_SYNC_STATUS$DescriptionOffset$VH_; }

    static final MemoryLayout CF_SYNC_STATUS$DescriptionLength$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_STATUS$DescriptionLength$LAYOUT() { return CF_SYNC_STATUS$DescriptionLength$LAYOUT_; }

    static final VarHandle CF_SYNC_STATUS$DescriptionLength$VH_ = CF_SYNC_STATUS$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("DescriptionLength"));
    static final java.lang.invoke.VarHandle CF_SYNC_STATUS$DescriptionLength$VH() { return CF_SYNC_STATUS$DescriptionLength$VH_; }

    static final MemoryLayout CF_SYNC_STATUS$DeviceIdOffset$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_STATUS$DeviceIdOffset$LAYOUT() { return CF_SYNC_STATUS$DeviceIdOffset$LAYOUT_; }

    static final VarHandle CF_SYNC_STATUS$DeviceIdOffset$VH_ = CF_SYNC_STATUS$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("DeviceIdOffset"));
    static final java.lang.invoke.VarHandle CF_SYNC_STATUS$DeviceIdOffset$VH() { return CF_SYNC_STATUS$DeviceIdOffset$VH_; }

    static final MemoryLayout CF_SYNC_STATUS$DeviceIdLength$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_STATUS$DeviceIdLength$LAYOUT() { return CF_SYNC_STATUS$DeviceIdLength$LAYOUT_; }

    static final VarHandle CF_SYNC_STATUS$DeviceIdLength$VH_ = CF_SYNC_STATUS$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("DeviceIdLength"));
    static final java.lang.invoke.VarHandle CF_SYNC_STATUS$DeviceIdLength$VH() { return CF_SYNC_STATUS$DeviceIdLength$VH_; }

    static final MemoryLayout CF_OPERATION_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("StructSize"),
            C_INT.withName("Type"),
            MemoryLayout.ofStruct(
                    C_LONGLONG.withName("Internal")
            ).withName("ConnectionKey"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("TransferKey"),
            C_POINTER.withName("CorrelationVector"),
            C_POINTER.withName("SyncStatus"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("RequestKey")
    ).withName("CF_OPERATION_INFO");
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_INFO$struct$LAYOUT() { return CF_OPERATION_INFO$struct$LAYOUT_; }

    static final MemoryLayout CF_OPERATION_INFO$StructSize$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_INFO$StructSize$LAYOUT() { return CF_OPERATION_INFO$StructSize$LAYOUT_; }

    static final VarHandle CF_OPERATION_INFO$StructSize$VH_ = CF_OPERATION_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("StructSize"));
    static final java.lang.invoke.VarHandle CF_OPERATION_INFO$StructSize$VH() { return CF_OPERATION_INFO$StructSize$VH_; }

    static final MemoryLayout CF_OPERATION_INFO$Type$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_INFO$Type$LAYOUT() { return CF_OPERATION_INFO$Type$LAYOUT_; }

    static final VarHandle CF_OPERATION_INFO$Type$VH_ = CF_OPERATION_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Type"));
    static final java.lang.invoke.VarHandle CF_OPERATION_INFO$Type$VH() { return CF_OPERATION_INFO$Type$VH_; }

    static final MemoryLayout CF_OPERATION_INFO$CorrelationVector$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_INFO$CorrelationVector$LAYOUT() { return CF_OPERATION_INFO$CorrelationVector$LAYOUT_; }

    static final VarHandle CF_OPERATION_INFO$CorrelationVector$VH_ = MemoryHandles.asAddressVarHandle(CF_OPERATION_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("CorrelationVector")));
    static final java.lang.invoke.VarHandle CF_OPERATION_INFO$CorrelationVector$VH() { return CF_OPERATION_INFO$CorrelationVector$VH_; }

    static final MemoryLayout CF_OPERATION_INFO$SyncStatus$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_INFO$SyncStatus$LAYOUT() { return CF_OPERATION_INFO$SyncStatus$LAYOUT_; }

    static final VarHandle CF_OPERATION_INFO$SyncStatus$VH_ = MemoryHandles.asAddressVarHandle(CF_OPERATION_INFO$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("SyncStatus")));
    static final java.lang.invoke.VarHandle CF_OPERATION_INFO$SyncStatus$VH() { return CF_OPERATION_INFO$SyncStatus$VH_; }

    static final int CF_OPERATION_TRANSFER_DATA_FLAG_NONE() { return (int)0L; }

    static final int CF_OPERATION_RETRIEVE_DATA_FLAG_NONE() { return (int)0L; }

    static final int CF_OPERATION_ACK_DATA_FLAG_NONE() { return (int)0L; }

    static final int CF_OPERATION_RESTART_HYDRATION_FLAG_NONE() { return (int)0L; }

    static final int CF_OPERATION_RESTART_HYDRATION_FLAG_MARK_IN_SYNC() { return (int)1L; }

    static final int CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_NONE() { return (int)0L; }

    static final int CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_STOP_ON_ERROR() { return (int)1L; }

    static final int CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_DISABLE_ON_DEMAND_POPULATION() { return (int)2L; }

    static final int CF_OPERATION_ACK_DEHYDRATE_FLAG_NONE() { return (int)0L; }

    static final int CF_OPERATION_ACK_RENAME_FLAG_NONE() { return (int)0L; }

    static final int CF_OPERATION_ACK_DELETE_FLAG_NONE() { return (int)0L; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("ParamSize"),
            MemoryLayout.ofPaddingBits(32),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    C_LONG.withName("CompletionStatus"),
                    C_POINTER.withName("Buffer"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("Offset"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("Length")
            ).withName("TransferData"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    MemoryLayout.ofPaddingBits(32),
                    C_POINTER.withName("Buffer"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("Offset"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("Length"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("ReturnedLength")
            ).withName("RetrieveData"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    C_LONG.withName("CompletionStatus"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("Offset"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("Length")
            ).withName("AckData"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    MemoryLayout.ofPaddingBits(32),
                    C_POINTER.withName("FsMetadata"),
                    C_POINTER.withName("FileIdentity"),
                    C_LONG.withName("FileIdentityLength"),
                    MemoryLayout.ofPaddingBits(32)
            ).withName("RestartHydration"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    C_LONG.withName("CompletionStatus"),
                    MemoryLayout.ofUnion(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart"),
                            MemoryLayout.ofStruct(
                                    C_LONG.withName("LowPart"),
                                    C_LONG.withName("HighPart")
                            ).withName("u"),
                            C_LONGLONG.withName("QuadPart")
                    ).withName("PlaceholderTotalCount"),
                    C_POINTER.withName("PlaceholderArray"),
                    C_LONG.withName("PlaceholderCount"),
                    C_LONG.withName("EntriesProcessed")
            ).withName("TransferPlaceholders"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    C_LONG.withName("CompletionStatus"),
                    C_POINTER.withName("FileIdentity"),
                    C_LONG.withName("FileIdentityLength"),
                    MemoryLayout.ofPaddingBits(32)
            ).withName("AckDehydrate"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    C_LONG.withName("CompletionStatus")
            ).withName("AckRename"),
            MemoryLayout.ofStruct(
                    C_INT.withName("Flags"),
                    C_LONG.withName("CompletionStatus")
            ).withName("AckDelete")
    ).withName("CF_OPERATION_PARAMETERS");
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$struct$LAYOUT() { return CF_OPERATION_PARAMETERS$struct$LAYOUT_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$ParamSize$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$ParamSize$LAYOUT() { return CF_OPERATION_PARAMETERS$ParamSize$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$ParamSize$VH_ = CF_OPERATION_PARAMETERS$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("ParamSize"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$ParamSize$VH() { return CF_OPERATION_PARAMETERS$ParamSize$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$TransferData$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            C_LONG.withName("CompletionStatus"),
            C_POINTER.withName("Buffer"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("Offset"),
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
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$TransferData$struct$LAYOUT() { return CF_OPERATION_PARAMETERS$TransferData$struct$LAYOUT_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$TransferData$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$TransferData$Flags$LAYOUT() { return CF_OPERATION_PARAMETERS$TransferData$Flags$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$TransferData$Flags$VH_ = CF_OPERATION_PARAMETERS$TransferData$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$TransferData$Flags$VH() { return CF_OPERATION_PARAMETERS$TransferData$Flags$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$TransferData$CompletionStatus$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$TransferData$CompletionStatus$LAYOUT() { return CF_OPERATION_PARAMETERS$TransferData$CompletionStatus$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$TransferData$CompletionStatus$VH_ = CF_OPERATION_PARAMETERS$TransferData$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("CompletionStatus"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$TransferData$CompletionStatus$VH() { return CF_OPERATION_PARAMETERS$TransferData$CompletionStatus$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$TransferData$Buffer$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$TransferData$Buffer$LAYOUT() { return CF_OPERATION_PARAMETERS$TransferData$Buffer$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$TransferData$Buffer$VH_ = MemoryHandles.asAddressVarHandle(CF_OPERATION_PARAMETERS$TransferData$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("Buffer")));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$TransferData$Buffer$VH() { return CF_OPERATION_PARAMETERS$TransferData$Buffer$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$RetrieveData$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            MemoryLayout.ofPaddingBits(32),
            C_POINTER.withName("Buffer"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("Offset"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("Length"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("ReturnedLength")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$RetrieveData$struct$LAYOUT() { return CF_OPERATION_PARAMETERS$RetrieveData$struct$LAYOUT_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$RetrieveData$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$RetrieveData$Flags$LAYOUT() { return CF_OPERATION_PARAMETERS$RetrieveData$Flags$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$RetrieveData$Flags$VH_ = CF_OPERATION_PARAMETERS$RetrieveData$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$RetrieveData$Flags$VH() { return CF_OPERATION_PARAMETERS$RetrieveData$Flags$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$RetrieveData$Buffer$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$RetrieveData$Buffer$LAYOUT() { return CF_OPERATION_PARAMETERS$RetrieveData$Buffer$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$RetrieveData$Buffer$VH_ = MemoryHandles.asAddressVarHandle(CF_OPERATION_PARAMETERS$RetrieveData$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("Buffer")));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$RetrieveData$Buffer$VH() { return CF_OPERATION_PARAMETERS$RetrieveData$Buffer$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckData$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            C_LONG.withName("CompletionStatus"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("Offset"),
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
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckData$struct$LAYOUT() { return CF_OPERATION_PARAMETERS$AckData$struct$LAYOUT_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckData$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckData$Flags$LAYOUT() { return CF_OPERATION_PARAMETERS$AckData$Flags$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$AckData$Flags$VH_ = CF_OPERATION_PARAMETERS$AckData$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$AckData$Flags$VH() { return CF_OPERATION_PARAMETERS$AckData$Flags$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckData$CompletionStatus$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckData$CompletionStatus$LAYOUT() { return CF_OPERATION_PARAMETERS$AckData$CompletionStatus$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$AckData$CompletionStatus$VH_ = CF_OPERATION_PARAMETERS$AckData$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("CompletionStatus"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$AckData$CompletionStatus$VH() { return CF_OPERATION_PARAMETERS$AckData$CompletionStatus$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$RestartHydration$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            MemoryLayout.ofPaddingBits(32),
            C_POINTER.withName("FsMetadata"),
            C_POINTER.withName("FileIdentity"),
            C_LONG.withName("FileIdentityLength"),
            MemoryLayout.ofPaddingBits(32)
    );
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$RestartHydration$struct$LAYOUT() { return CF_OPERATION_PARAMETERS$RestartHydration$struct$LAYOUT_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$RestartHydration$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$RestartHydration$Flags$LAYOUT() { return CF_OPERATION_PARAMETERS$RestartHydration$Flags$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$RestartHydration$Flags$VH_ = CF_OPERATION_PARAMETERS$RestartHydration$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$RestartHydration$Flags$VH() { return CF_OPERATION_PARAMETERS$RestartHydration$Flags$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$RestartHydration$FsMetadata$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$RestartHydration$FsMetadata$LAYOUT() { return CF_OPERATION_PARAMETERS$RestartHydration$FsMetadata$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$RestartHydration$FsMetadata$VH_ = MemoryHandles.asAddressVarHandle(CF_OPERATION_PARAMETERS$RestartHydration$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("FsMetadata")));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$RestartHydration$FsMetadata$VH() { return CF_OPERATION_PARAMETERS$RestartHydration$FsMetadata$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$RestartHydration$FileIdentity$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$RestartHydration$FileIdentity$LAYOUT() { return CF_OPERATION_PARAMETERS$RestartHydration$FileIdentity$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$RestartHydration$FileIdentity$VH_ = MemoryHandles.asAddressVarHandle(CF_OPERATION_PARAMETERS$RestartHydration$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("FileIdentity")));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$RestartHydration$FileIdentity$VH() { return CF_OPERATION_PARAMETERS$RestartHydration$FileIdentity$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$RestartHydration$FileIdentityLength$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$RestartHydration$FileIdentityLength$LAYOUT() { return CF_OPERATION_PARAMETERS$RestartHydration$FileIdentityLength$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$RestartHydration$FileIdentityLength$VH_ = CF_OPERATION_PARAMETERS$RestartHydration$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("FileIdentityLength"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$RestartHydration$FileIdentityLength$VH() { return CF_OPERATION_PARAMETERS$RestartHydration$FileIdentityLength$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$TransferPlaceholders$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            C_LONG.withName("CompletionStatus"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("PlaceholderTotalCount"),
            C_POINTER.withName("PlaceholderArray"),
            C_LONG.withName("PlaceholderCount"),
            C_LONG.withName("EntriesProcessed")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$TransferPlaceholders$struct$LAYOUT() { return CF_OPERATION_PARAMETERS$TransferPlaceholders$struct$LAYOUT_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$TransferPlaceholders$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$TransferPlaceholders$Flags$LAYOUT() { return CF_OPERATION_PARAMETERS$TransferPlaceholders$Flags$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$TransferPlaceholders$Flags$VH_ = CF_OPERATION_PARAMETERS$TransferPlaceholders$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$TransferPlaceholders$Flags$VH() { return CF_OPERATION_PARAMETERS$TransferPlaceholders$Flags$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$TransferPlaceholders$CompletionStatus$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$TransferPlaceholders$CompletionStatus$LAYOUT() { return CF_OPERATION_PARAMETERS$TransferPlaceholders$CompletionStatus$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$TransferPlaceholders$CompletionStatus$VH_ = CF_OPERATION_PARAMETERS$TransferPlaceholders$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("CompletionStatus"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$TransferPlaceholders$CompletionStatus$VH() { return CF_OPERATION_PARAMETERS$TransferPlaceholders$CompletionStatus$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderArray$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderArray$LAYOUT() { return CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderArray$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderArray$VH_ = MemoryHandles.asAddressVarHandle(CF_OPERATION_PARAMETERS$TransferPlaceholders$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("PlaceholderArray")));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderArray$VH() { return CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderArray$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderCount$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderCount$LAYOUT() { return CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderCount$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderCount$VH_ = CF_OPERATION_PARAMETERS$TransferPlaceholders$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("PlaceholderCount"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderCount$VH() { return CF_OPERATION_PARAMETERS$TransferPlaceholders$PlaceholderCount$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$TransferPlaceholders$EntriesProcessed$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$TransferPlaceholders$EntriesProcessed$LAYOUT() { return CF_OPERATION_PARAMETERS$TransferPlaceholders$EntriesProcessed$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$TransferPlaceholders$EntriesProcessed$VH_ = CF_OPERATION_PARAMETERS$TransferPlaceholders$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("EntriesProcessed"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$TransferPlaceholders$EntriesProcessed$VH() { return CF_OPERATION_PARAMETERS$TransferPlaceholders$EntriesProcessed$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckDehydrate$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            C_LONG.withName("CompletionStatus"),
            C_POINTER.withName("FileIdentity"),
            C_LONG.withName("FileIdentityLength"),
            MemoryLayout.ofPaddingBits(32)
    );
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckDehydrate$struct$LAYOUT() { return CF_OPERATION_PARAMETERS$AckDehydrate$struct$LAYOUT_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckDehydrate$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckDehydrate$Flags$LAYOUT() { return CF_OPERATION_PARAMETERS$AckDehydrate$Flags$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$AckDehydrate$Flags$VH_ = CF_OPERATION_PARAMETERS$AckDehydrate$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$AckDehydrate$Flags$VH() { return CF_OPERATION_PARAMETERS$AckDehydrate$Flags$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckDehydrate$CompletionStatus$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckDehydrate$CompletionStatus$LAYOUT() { return CF_OPERATION_PARAMETERS$AckDehydrate$CompletionStatus$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$AckDehydrate$CompletionStatus$VH_ = CF_OPERATION_PARAMETERS$AckDehydrate$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("CompletionStatus"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$AckDehydrate$CompletionStatus$VH() { return CF_OPERATION_PARAMETERS$AckDehydrate$CompletionStatus$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentity$LAYOUT_ = C_POINTER;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentity$LAYOUT() { return CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentity$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentity$VH_ = MemoryHandles.asAddressVarHandle(CF_OPERATION_PARAMETERS$AckDehydrate$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("FileIdentity")));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentity$VH() { return CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentity$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentityLength$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentityLength$LAYOUT() { return CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentityLength$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentityLength$VH_ = CF_OPERATION_PARAMETERS$AckDehydrate$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("FileIdentityLength"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentityLength$VH() { return CF_OPERATION_PARAMETERS$AckDehydrate$FileIdentityLength$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckRename$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            C_LONG.withName("CompletionStatus")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckRename$struct$LAYOUT() { return CF_OPERATION_PARAMETERS$AckRename$struct$LAYOUT_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckRename$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckRename$Flags$LAYOUT() { return CF_OPERATION_PARAMETERS$AckRename$Flags$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$AckRename$Flags$VH_ = CF_OPERATION_PARAMETERS$AckRename$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$AckRename$Flags$VH() { return CF_OPERATION_PARAMETERS$AckRename$Flags$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckRename$CompletionStatus$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckRename$CompletionStatus$LAYOUT() { return CF_OPERATION_PARAMETERS$AckRename$CompletionStatus$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$AckRename$CompletionStatus$VH_ = CF_OPERATION_PARAMETERS$AckRename$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("CompletionStatus"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$AckRename$CompletionStatus$VH() { return CF_OPERATION_PARAMETERS$AckRename$CompletionStatus$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckDelete$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("Flags"),
            C_LONG.withName("CompletionStatus")
    );
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckDelete$struct$LAYOUT() { return CF_OPERATION_PARAMETERS$AckDelete$struct$LAYOUT_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckDelete$Flags$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckDelete$Flags$LAYOUT() { return CF_OPERATION_PARAMETERS$AckDelete$Flags$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$AckDelete$Flags$VH_ = CF_OPERATION_PARAMETERS$AckDelete$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$AckDelete$Flags$VH() { return CF_OPERATION_PARAMETERS$AckDelete$Flags$VH_; }

    static final MemoryLayout CF_OPERATION_PARAMETERS$AckDelete$CompletionStatus$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_OPERATION_PARAMETERS$AckDelete$CompletionStatus$LAYOUT() { return CF_OPERATION_PARAMETERS$AckDelete$CompletionStatus$LAYOUT_; }

    static final VarHandle CF_OPERATION_PARAMETERS$AckDelete$CompletionStatus$VH_ = CF_OPERATION_PARAMETERS$AckDelete$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("CompletionStatus"));
    static final java.lang.invoke.VarHandle CF_OPERATION_PARAMETERS$AckDelete$CompletionStatus$VH() { return CF_OPERATION_PARAMETERS$AckDelete$CompletionStatus$VH_; }

    static final FunctionDescriptor CfExecute$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfExecute$FUNC() { return CfExecute$FUNC_; }

    static final MethodHandle CfExecute$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfExecute",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            CfExecute$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfExecute$MH() { return CfExecute$MH_; }

    static final FunctionDescriptor CfUpdateSyncProviderStatus$FUNC_ = FunctionDescriptor.of(C_LONG,
            MemoryLayout.ofStruct(
                    C_LONGLONG.withName("Internal")
            ).withName("CF_CONNECTION_KEY__"),
            C_INT
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfUpdateSyncProviderStatus$FUNC() { return CfUpdateSyncProviderStatus$FUNC_; }

    static final MethodHandle CfUpdateSyncProviderStatus$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfUpdateSyncProviderStatus",
            "(Ljdk/incubator/foreign/MemorySegment;I)I",
            CfUpdateSyncProviderStatus$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfUpdateSyncProviderStatus$MH() { return CfUpdateSyncProviderStatus$MH_; }

    static final FunctionDescriptor CfQuerySyncProviderStatus$FUNC_ = FunctionDescriptor.of(C_LONG,
            MemoryLayout.ofStruct(
                    C_LONGLONG.withName("Internal")
            ).withName("CF_CONNECTION_KEY__"),
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfQuerySyncProviderStatus$FUNC() { return CfQuerySyncProviderStatus$FUNC_; }

    static final MethodHandle CfQuerySyncProviderStatus$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfQuerySyncProviderStatus",
            "(Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;)I",
            CfQuerySyncProviderStatus$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfQuerySyncProviderStatus$MH() { return CfQuerySyncProviderStatus$MH_; }

    static final FunctionDescriptor CfReportSyncStatus$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfReportSyncStatus$FUNC() { return CfReportSyncStatus$FUNC_; }

    static final MethodHandle CfReportSyncStatus$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfReportSyncStatus",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            CfReportSyncStatus$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfReportSyncStatus$MH() { return CfReportSyncStatus$MH_; }

    static final int CF_CREATE_FLAG_NONE() { return (int)0L; }

    static final int CF_CREATE_FLAG_STOP_ON_ERROR() { return (int)1L; }

    static final FunctionDescriptor CfCreatePlaceholders$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER,
            C_LONG,
            C_INT,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfCreatePlaceholders$FUNC() { return CfCreatePlaceholders$FUNC_; }

    static final MethodHandle CfCreatePlaceholders$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfCreatePlaceholders",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
            CfCreatePlaceholders$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfCreatePlaceholders$MH() { return CfCreatePlaceholders$MH_; }

    static final int CF_OPEN_FILE_FLAG_NONE() { return (int)0L; }

    static final int CF_OPEN_FILE_FLAG_EXCLUSIVE() { return (int)1L; }

    static final int CF_OPEN_FILE_FLAG_WRITE_ACCESS() { return (int)2L; }

    static final int CF_OPEN_FILE_FLAG_DELETE_ACCESS() { return (int)4L; }

    static final int CF_OPEN_FILE_FLAG_FOREGROUND() { return (int)8L; }

    static final FunctionDescriptor CfOpenFileWithOplock$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_INT,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfOpenFileWithOplock$FUNC() { return CfOpenFileWithOplock$FUNC_; }

    static final MethodHandle CfOpenFileWithOplock$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfOpenFileWithOplock",
            "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
            CfOpenFileWithOplock$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfOpenFileWithOplock$MH() { return CfOpenFileWithOplock$MH_; }

    static final FunctionDescriptor CfReferenceProtectedHandle$FUNC_ = FunctionDescriptor.of(C_CHAR,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfReferenceProtectedHandle$FUNC() { return CfReferenceProtectedHandle$FUNC_; }

    static final MethodHandle CfReferenceProtectedHandle$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfReferenceProtectedHandle",
            "(Ljdk/incubator/foreign/MemoryAddress;)B",
            CfReferenceProtectedHandle$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfReferenceProtectedHandle$MH() { return CfReferenceProtectedHandle$MH_; }

    static final FunctionDescriptor CfGetWin32HandleFromProtectedHandle$FUNC_ = FunctionDescriptor.of(C_POINTER,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfGetWin32HandleFromProtectedHandle$FUNC() { return CfGetWin32HandleFromProtectedHandle$FUNC_; }

    static final MethodHandle CfGetWin32HandleFromProtectedHandle$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfGetWin32HandleFromProtectedHandle",
            "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
            CfGetWin32HandleFromProtectedHandle$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfGetWin32HandleFromProtectedHandle$MH() { return CfGetWin32HandleFromProtectedHandle$MH_; }

    static final FunctionDescriptor CfReleaseProtectedHandle$FUNC_ = FunctionDescriptor.ofVoid(
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfReleaseProtectedHandle$FUNC() { return CfReleaseProtectedHandle$FUNC_; }

    static final MethodHandle CfReleaseProtectedHandle$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfReleaseProtectedHandle",
            "(Ljdk/incubator/foreign/MemoryAddress;)V",
            CfReleaseProtectedHandle$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfReleaseProtectedHandle$MH() { return CfReleaseProtectedHandle$MH_; }

    static final FunctionDescriptor CfCloseHandle$FUNC_ = FunctionDescriptor.ofVoid(
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfCloseHandle$FUNC() { return CfCloseHandle$FUNC_; }

    static final MethodHandle CfCloseHandle$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfCloseHandle",
            "(Ljdk/incubator/foreign/MemoryAddress;)V",
            CfCloseHandle$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfCloseHandle$MH() { return CfCloseHandle$MH_; }

    static final MemoryLayout CF_FILE_RANGE$struct$LAYOUT_ = MemoryLayout.ofStruct(
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("StartingOffset"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("Length")
    ).withName("CF_FILE_RANGE");
    static final jdk.incubator.foreign.MemoryLayout CF_FILE_RANGE$struct$LAYOUT() { return CF_FILE_RANGE$struct$LAYOUT_; }

    static final int CF_CONVERT_FLAG_NONE() { return (int)0L; }

    static final int CF_CONVERT_FLAG_MARK_IN_SYNC() { return (int)1L; }

    static final int CF_CONVERT_FLAG_DEHYDRATE() { return (int)2L; }

    static final int CF_CONVERT_FLAG_ENABLE_ON_DEMAND_POPULATION() { return (int)4L; }

    static final int CF_CONVERT_FLAG_ALWAYS_FULL() { return (int)8L; }

    static final FunctionDescriptor CfConvertToPlaceholder$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER,
            C_LONG,
            C_INT,
            C_POINTER,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfConvertToPlaceholder$FUNC() { return CfConvertToPlaceholder$FUNC_; }

    static final MethodHandle CfConvertToPlaceholder$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfConvertToPlaceholder",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            CfConvertToPlaceholder$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfConvertToPlaceholder$MH() { return CfConvertToPlaceholder$MH_; }

    static final int CF_UPDATE_FLAG_NONE() { return (int)0L; }

    static final int CF_UPDATE_FLAG_VERIFY_IN_SYNC() { return (int)1L; }

    static final int CF_UPDATE_FLAG_MARK_IN_SYNC() { return (int)2L; }

    static final int CF_UPDATE_FLAG_DEHYDRATE() { return (int)4L; }

    static final int CF_UPDATE_FLAG_ENABLE_ON_DEMAND_POPULATION() { return (int)8L; }

    static final int CF_UPDATE_FLAG_DISABLE_ON_DEMAND_POPULATION() { return (int)16L; }

    static final int CF_UPDATE_FLAG_REMOVE_FILE_IDENTITY() { return (int)32L; }

    static final int CF_UPDATE_FLAG_CLEAR_IN_SYNC() { return (int)64L; }

    static final int CF_UPDATE_FLAG_REMOVE_PROPERTY() { return (int)128L; }

    static final int CF_UPDATE_FLAG_PASSTHROUGH_FS_METADATA() { return (int)256L; }

    static final int CF_UPDATE_FLAG_ALWAYS_FULL() { return (int)512L; }

    static final int CF_UPDATE_FLAG_ALLOW_PARTIAL() { return (int)1024L; }

    static final FunctionDescriptor CfUpdatePlaceholder$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER,
            C_POINTER,
            C_LONG,
            C_POINTER,
            C_LONG,
            C_INT,
            C_POINTER,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfUpdatePlaceholder$FUNC() { return CfUpdatePlaceholder$FUNC_; }

    static final MethodHandle CfUpdatePlaceholder$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfUpdatePlaceholder",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            CfUpdatePlaceholder$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfUpdatePlaceholder$MH() { return CfUpdatePlaceholder$MH_; }

    static final int CF_REVERT_FLAG_NONE() { return (int)0L; }

    static final FunctionDescriptor CfRevertPlaceholder$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_INT,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfRevertPlaceholder$FUNC() { return CfRevertPlaceholder$FUNC_; }

    static final MethodHandle CfRevertPlaceholder$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfRevertPlaceholder",
            "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
            CfRevertPlaceholder$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfRevertPlaceholder$MH() { return CfRevertPlaceholder$MH_; }

    static final int CF_HYDRATE_FLAG_NONE() { return (int)0L; }

    static final FunctionDescriptor CfHydratePlaceholder$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("_LARGE_INTEGER"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("_LARGE_INTEGER"),
            C_INT,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfHydratePlaceholder$FUNC() { return CfHydratePlaceholder$FUNC_; }

    static final MethodHandle CfHydratePlaceholder$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfHydratePlaceholder",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;ILjdk/incubator/foreign/MemoryAddress;)I",
            CfHydratePlaceholder$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfHydratePlaceholder$MH() { return CfHydratePlaceholder$MH_; }

    static final int CF_DEHYDRATE_FLAG_NONE() { return (int)0L; }

    static final int CF_DEHYDRATE_FLAG_BACKGROUND() { return (int)1L; }

    static final FunctionDescriptor CfDehydratePlaceholder$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("_LARGE_INTEGER"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("_LARGE_INTEGER"),
            C_INT,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfDehydratePlaceholder$FUNC() { return CfDehydratePlaceholder$FUNC_; }

    static final MethodHandle CfDehydratePlaceholder$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfDehydratePlaceholder",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;ILjdk/incubator/foreign/MemoryAddress;)I",
            CfDehydratePlaceholder$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfDehydratePlaceholder$MH() { return CfDehydratePlaceholder$MH_; }

    static final int CF_PIN_STATE_UNSPECIFIED() { return (int)0L; }

    static final int CF_PIN_STATE_PINNED() { return (int)1L; }

    static final int CF_PIN_STATE_UNPINNED() { return (int)2L; }

    static final int CF_PIN_STATE_EXCLUDED() { return (int)3L; }

    static final int CF_PIN_STATE_INHERIT() { return (int)4L; }

    static final int CF_SET_PIN_FLAG_NONE() { return (int)0L; }

    static final int CF_SET_PIN_FLAG_RECURSE() { return (int)1L; }

    static final int CF_SET_PIN_FLAG_RECURSE_ONLY() { return (int)2L; }

    static final int CF_SET_PIN_FLAG_RECURSE_STOP_ON_ERROR() { return (int)4L; }

    static final FunctionDescriptor CfSetPinState$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_INT,
            C_INT,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfSetPinState$FUNC() { return CfSetPinState$FUNC_; }

    static final MethodHandle CfSetPinState$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfSetPinState",
            "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
            CfSetPinState$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfSetPinState$MH() { return CfSetPinState$MH_; }

    static final int CF_IN_SYNC_STATE_NOT_IN_SYNC() { return (int)0L; }

    static final int CF_IN_SYNC_STATE_IN_SYNC() { return (int)1L; }

    static final int CF_SET_IN_SYNC_FLAG_NONE() { return (int)0L; }

    static final FunctionDescriptor CfSetInSyncState$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_INT,
            C_INT,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfSetInSyncState$FUNC() { return CfSetInSyncState$FUNC_; }

    static final MethodHandle CfSetInSyncState$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfSetInSyncState",
            "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
            CfSetInSyncState$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfSetInSyncState$MH() { return CfSetInSyncState$MH_; }

    static final FunctionDescriptor CfSetCorrelationVector$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfSetCorrelationVector$FUNC() { return CfSetCorrelationVector$FUNC_; }

    static final MethodHandle CfSetCorrelationVector$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfSetCorrelationVector",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            CfSetCorrelationVector$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfSetCorrelationVector$MH() { return CfSetCorrelationVector$MH_; }

    static final FunctionDescriptor CfGetCorrelationVector$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfGetCorrelationVector$FUNC() { return CfGetCorrelationVector$FUNC_; }

    static final MethodHandle CfGetCorrelationVector$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfGetCorrelationVector",
            "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
            CfGetCorrelationVector$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfGetCorrelationVector$MH() { return CfGetCorrelationVector$MH_; }

    static final int CF_PLACEHOLDER_STATE_NO_STATES() { return (int)0L; }

    static final int CF_PLACEHOLDER_STATE_PLACEHOLDER() { return (int)1L; }

    static final int CF_PLACEHOLDER_STATE_SYNC_ROOT() { return (int)2L; }

    static final int CF_PLACEHOLDER_STATE_ESSENTIAL_PROP_PRESENT() { return (int)4L; }

    static final int CF_PLACEHOLDER_STATE_IN_SYNC() { return (int)8L; }

    static final int CF_PLACEHOLDER_STATE_PARTIAL() { return (int)16L; }

    static final int CF_PLACEHOLDER_STATE_PARTIALLY_ON_DISK() { return (int)32L; }

    static final int CF_PLACEHOLDER_STATE_INVALID() { return (int)-1L; }

    static final FunctionDescriptor CfGetPlaceholderStateFromAttributeTag$FUNC_ = FunctionDescriptor.of(C_INT,
            C_LONG,
            C_LONG
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfGetPlaceholderStateFromAttributeTag$FUNC() { return CfGetPlaceholderStateFromAttributeTag$FUNC_; }

    static final MethodHandle CfGetPlaceholderStateFromAttributeTag$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfGetPlaceholderStateFromAttributeTag",
            "(II)I",
            CfGetPlaceholderStateFromAttributeTag$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfGetPlaceholderStateFromAttributeTag$MH() { return CfGetPlaceholderStateFromAttributeTag$MH_; }

    static final FunctionDescriptor CfGetPlaceholderStateFromFileInfo$FUNC_ = FunctionDescriptor.of(C_INT,
            C_POINTER,
            C_INT
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfGetPlaceholderStateFromFileInfo$FUNC() { return CfGetPlaceholderStateFromFileInfo$FUNC_; }

    static final MethodHandle CfGetPlaceholderStateFromFileInfo$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfGetPlaceholderStateFromFileInfo",
            "(Ljdk/incubator/foreign/MemoryAddress;I)I",
            CfGetPlaceholderStateFromFileInfo$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfGetPlaceholderStateFromFileInfo$MH() { return CfGetPlaceholderStateFromFileInfo$MH_; }

    static final FunctionDescriptor CfGetPlaceholderStateFromFindData$FUNC_ = FunctionDescriptor.of(C_INT,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfGetPlaceholderStateFromFindData$FUNC() { return CfGetPlaceholderStateFromFindData$FUNC_; }

    static final MethodHandle CfGetPlaceholderStateFromFindData$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfGetPlaceholderStateFromFindData",
            "(Ljdk/incubator/foreign/MemoryAddress;)I",
            CfGetPlaceholderStateFromFindData$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfGetPlaceholderStateFromFindData$MH() { return CfGetPlaceholderStateFromFindData$MH_; }

    static final int CF_PLACEHOLDER_INFO_BASIC() { return (int)0L; }

    static final int CF_PLACEHOLDER_INFO_STANDARD() { return (int)1L; }

    static final MemoryLayout CF_PLACEHOLDER_BASIC_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("PinState"),
            C_INT.withName("InSyncState"),
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
            ).withName("SyncRootFileId"),
            C_LONG.withName("FileIdentityLength"),
            MemoryLayout.ofSequence(1, C_CHAR).withName("FileIdentity"),
            MemoryLayout.ofPaddingBits(24)
    ).withName("CF_PLACEHOLDER_BASIC_INFO");
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_BASIC_INFO$struct$LAYOUT() { return CF_PLACEHOLDER_BASIC_INFO$struct$LAYOUT_; }

    static final MemoryLayout CF_PLACEHOLDER_BASIC_INFO$PinState$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_BASIC_INFO$PinState$LAYOUT() { return CF_PLACEHOLDER_BASIC_INFO$PinState$LAYOUT_; }

    static final VarHandle CF_PLACEHOLDER_BASIC_INFO$PinState$VH_ = CF_PLACEHOLDER_BASIC_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("PinState"));
    static final java.lang.invoke.VarHandle CF_PLACEHOLDER_BASIC_INFO$PinState$VH() { return CF_PLACEHOLDER_BASIC_INFO$PinState$VH_; }

    static final MemoryLayout CF_PLACEHOLDER_BASIC_INFO$InSyncState$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_BASIC_INFO$InSyncState$LAYOUT() { return CF_PLACEHOLDER_BASIC_INFO$InSyncState$LAYOUT_; }

    static final VarHandle CF_PLACEHOLDER_BASIC_INFO$InSyncState$VH_ = CF_PLACEHOLDER_BASIC_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("InSyncState"));
    static final java.lang.invoke.VarHandle CF_PLACEHOLDER_BASIC_INFO$InSyncState$VH() { return CF_PLACEHOLDER_BASIC_INFO$InSyncState$VH_; }

    static final MemoryLayout CF_PLACEHOLDER_BASIC_INFO$FileIdentityLength$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_BASIC_INFO$FileIdentityLength$LAYOUT() { return CF_PLACEHOLDER_BASIC_INFO$FileIdentityLength$LAYOUT_; }

    static final VarHandle CF_PLACEHOLDER_BASIC_INFO$FileIdentityLength$VH_ = CF_PLACEHOLDER_BASIC_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("FileIdentityLength"));
    static final java.lang.invoke.VarHandle CF_PLACEHOLDER_BASIC_INFO$FileIdentityLength$VH() { return CF_PLACEHOLDER_BASIC_INFO$FileIdentityLength$VH_; }

    static final MemoryLayout CF_PLACEHOLDER_STANDARD_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("OnDiskDataSize"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("ValidatedDataSize"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("ModifiedDataSize"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("PropertiesSize"),
            C_INT.withName("PinState"),
            C_INT.withName("InSyncState"),
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
            ).withName("SyncRootFileId"),
            C_LONG.withName("FileIdentityLength"),
            MemoryLayout.ofSequence(1, C_CHAR).withName("FileIdentity"),
            MemoryLayout.ofPaddingBits(24)
    ).withName("CF_PLACEHOLDER_STANDARD_INFO");
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_STANDARD_INFO$struct$LAYOUT() { return CF_PLACEHOLDER_STANDARD_INFO$struct$LAYOUT_; }

    static final MemoryLayout CF_PLACEHOLDER_STANDARD_INFO$PinState$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_STANDARD_INFO$PinState$LAYOUT() { return CF_PLACEHOLDER_STANDARD_INFO$PinState$LAYOUT_; }

    static final VarHandle CF_PLACEHOLDER_STANDARD_INFO$PinState$VH_ = CF_PLACEHOLDER_STANDARD_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("PinState"));
    static final java.lang.invoke.VarHandle CF_PLACEHOLDER_STANDARD_INFO$PinState$VH() { return CF_PLACEHOLDER_STANDARD_INFO$PinState$VH_; }

    static final MemoryLayout CF_PLACEHOLDER_STANDARD_INFO$InSyncState$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_STANDARD_INFO$InSyncState$LAYOUT() { return CF_PLACEHOLDER_STANDARD_INFO$InSyncState$LAYOUT_; }

    static final VarHandle CF_PLACEHOLDER_STANDARD_INFO$InSyncState$VH_ = CF_PLACEHOLDER_STANDARD_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("InSyncState"));
    static final java.lang.invoke.VarHandle CF_PLACEHOLDER_STANDARD_INFO$InSyncState$VH() { return CF_PLACEHOLDER_STANDARD_INFO$InSyncState$VH_; }

    static final MemoryLayout CF_PLACEHOLDER_STANDARD_INFO$FileIdentityLength$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_PLACEHOLDER_STANDARD_INFO$FileIdentityLength$LAYOUT() { return CF_PLACEHOLDER_STANDARD_INFO$FileIdentityLength$LAYOUT_; }

    static final VarHandle CF_PLACEHOLDER_STANDARD_INFO$FileIdentityLength$VH_ = CF_PLACEHOLDER_STANDARD_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("FileIdentityLength"));
    static final java.lang.invoke.VarHandle CF_PLACEHOLDER_STANDARD_INFO$FileIdentityLength$VH() { return CF_PLACEHOLDER_STANDARD_INFO$FileIdentityLength$VH_; }

    static final FunctionDescriptor ALLOCATE_CF_CALLBACK$FUNC_ = FunctionDescriptor.ofVoid(
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor ALLOCATE_CF_CALLBACK$FUNC() { return ALLOCATE_CF_CALLBACK$FUNC_; }

    static final MethodHandle ALLOCATE_CF_CALLBACK$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "ALLOCATE_CF_CALLBACK",
            "(Ljdk/incubator/foreign/MemoryAddress;)V",
            ALLOCATE_CF_CALLBACK$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle ALLOCATE_CF_CALLBACK$MH() { return ALLOCATE_CF_CALLBACK$MH_; }

    static final FunctionDescriptor ALLOCATE_CF_CALLBACK$CF_CALLBACK$FUNC_ = FunctionDescriptor.ofVoid(
            C_POINTER,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor ALLOCATE_CF_CALLBACK$CF_CALLBACK$FUNC() { return ALLOCATE_CF_CALLBACK$CF_CALLBACK$FUNC_; }
}
