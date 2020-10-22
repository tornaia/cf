package com.github.tornaia.cf.win.cfapi.internal;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;

class cfapi_h$constants$100 extends cfapi_h$constants$99 {

    /* package-private */ cfapi_h$constants$100() {}
    static final FunctionDescriptor CfGetPlaceholderInfo$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_INT,
            C_POINTER,
            C_LONG,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfGetPlaceholderInfo$FUNC() { return CfGetPlaceholderInfo$FUNC_; }

    static final MethodHandle CfGetPlaceholderInfo$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfGetPlaceholderInfo",
            "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
            CfGetPlaceholderInfo$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfGetPlaceholderInfo$MH() { return CfGetPlaceholderInfo$MH_; }

    static final int CF_SYNC_ROOT_INFO_BASIC() { return (int)0L; }

    static final int CF_SYNC_ROOT_INFO_STANDARD() { return (int)1L; }

    static final int CF_SYNC_ROOT_INFO_PROVIDER() { return (int)2L; }

    static final MemoryLayout CF_SYNC_ROOT_BASIC_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("SyncRootFileId")
    ).withName("CF_SYNC_ROOT_BASIC_INFO");
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_ROOT_BASIC_INFO$struct$LAYOUT() { return CF_SYNC_ROOT_BASIC_INFO$struct$LAYOUT_; }

    static final MemoryLayout CF_SYNC_ROOT_PROVIDER_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_INT.withName("ProviderStatus"),
            MemoryLayout.ofSequence(256, C_SHORT).withName("ProviderName"),
            MemoryLayout.ofSequence(256, C_SHORT).withName("ProviderVersion")
    ).withName("CF_SYNC_ROOT_PROVIDER_INFO");
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_ROOT_PROVIDER_INFO$struct$LAYOUT() { return CF_SYNC_ROOT_PROVIDER_INFO$struct$LAYOUT_; }

    static final MemoryLayout CF_SYNC_ROOT_PROVIDER_INFO$ProviderStatus$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_ROOT_PROVIDER_INFO$ProviderStatus$LAYOUT() { return CF_SYNC_ROOT_PROVIDER_INFO$ProviderStatus$LAYOUT_; }

    static final VarHandle CF_SYNC_ROOT_PROVIDER_INFO$ProviderStatus$VH_ = CF_SYNC_ROOT_PROVIDER_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("ProviderStatus"));
    static final java.lang.invoke.VarHandle CF_SYNC_ROOT_PROVIDER_INFO$ProviderStatus$VH() { return CF_SYNC_ROOT_PROVIDER_INFO$ProviderStatus$VH_; }

    static final MemoryLayout CF_SYNC_ROOT_STANDARD_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("SyncRootFileId"),
            MemoryLayout.ofStruct(
                    C_SHORT.withName("Primary"),
                    C_SHORT.withName("Modifier")
            ).withName("HydrationPolicy"),
            MemoryLayout.ofStruct(
                    C_SHORT.withName("Primary"),
                    C_SHORT.withName("Modifier")
            ).withName("PopulationPolicy"),
            C_INT.withName("InSyncPolicy"),
            C_INT.withName("HardLinkPolicy"),
            C_INT.withName("ProviderStatus"),
            MemoryLayout.ofSequence(256, C_SHORT).withName("ProviderName"),
            MemoryLayout.ofSequence(256, C_SHORT).withName("ProviderVersion"),
            C_LONG.withName("SyncRootIdentityLength"),
            MemoryLayout.ofSequence(1, C_CHAR).withName("SyncRootIdentity"),
            MemoryLayout.ofPaddingBits(56)
    ).withName("CF_SYNC_ROOT_STANDARD_INFO");
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_ROOT_STANDARD_INFO$struct$LAYOUT() { return CF_SYNC_ROOT_STANDARD_INFO$struct$LAYOUT_; }

    static final MemoryLayout CF_SYNC_ROOT_STANDARD_INFO$InSyncPolicy$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_ROOT_STANDARD_INFO$InSyncPolicy$LAYOUT() { return CF_SYNC_ROOT_STANDARD_INFO$InSyncPolicy$LAYOUT_; }

    static final VarHandle CF_SYNC_ROOT_STANDARD_INFO$InSyncPolicy$VH_ = CF_SYNC_ROOT_STANDARD_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("InSyncPolicy"));
    static final java.lang.invoke.VarHandle CF_SYNC_ROOT_STANDARD_INFO$InSyncPolicy$VH() { return CF_SYNC_ROOT_STANDARD_INFO$InSyncPolicy$VH_; }

    static final MemoryLayout CF_SYNC_ROOT_STANDARD_INFO$HardLinkPolicy$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_ROOT_STANDARD_INFO$HardLinkPolicy$LAYOUT() { return CF_SYNC_ROOT_STANDARD_INFO$HardLinkPolicy$LAYOUT_; }

    static final VarHandle CF_SYNC_ROOT_STANDARD_INFO$HardLinkPolicy$VH_ = CF_SYNC_ROOT_STANDARD_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("HardLinkPolicy"));
    static final java.lang.invoke.VarHandle CF_SYNC_ROOT_STANDARD_INFO$HardLinkPolicy$VH() { return CF_SYNC_ROOT_STANDARD_INFO$HardLinkPolicy$VH_; }

    static final MemoryLayout CF_SYNC_ROOT_STANDARD_INFO$ProviderStatus$LAYOUT_ = C_INT;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_ROOT_STANDARD_INFO$ProviderStatus$LAYOUT() { return CF_SYNC_ROOT_STANDARD_INFO$ProviderStatus$LAYOUT_; }

    static final VarHandle CF_SYNC_ROOT_STANDARD_INFO$ProviderStatus$VH_ = CF_SYNC_ROOT_STANDARD_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("ProviderStatus"));
    static final java.lang.invoke.VarHandle CF_SYNC_ROOT_STANDARD_INFO$ProviderStatus$VH() { return CF_SYNC_ROOT_STANDARD_INFO$ProviderStatus$VH_; }

    static final MemoryLayout CF_SYNC_ROOT_STANDARD_INFO$SyncRootIdentityLength$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout CF_SYNC_ROOT_STANDARD_INFO$SyncRootIdentityLength$LAYOUT() { return CF_SYNC_ROOT_STANDARD_INFO$SyncRootIdentityLength$LAYOUT_; }

    static final VarHandle CF_SYNC_ROOT_STANDARD_INFO$SyncRootIdentityLength$VH_ = CF_SYNC_ROOT_STANDARD_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("SyncRootIdentityLength"));
    static final java.lang.invoke.VarHandle CF_SYNC_ROOT_STANDARD_INFO$SyncRootIdentityLength$VH() { return CF_SYNC_ROOT_STANDARD_INFO$SyncRootIdentityLength$VH_; }

    static final FunctionDescriptor CfGetSyncRootInfoByPath$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_INT,
            C_POINTER,
            C_LONG,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfGetSyncRootInfoByPath$FUNC() { return CfGetSyncRootInfoByPath$FUNC_; }

    static final MethodHandle CfGetSyncRootInfoByPath$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfGetSyncRootInfoByPath",
            "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
            CfGetSyncRootInfoByPath$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfGetSyncRootInfoByPath$MH() { return CfGetSyncRootInfoByPath$MH_; }

    static final FunctionDescriptor CfGetSyncRootInfoByHandle$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_INT,
            C_POINTER,
            C_LONG,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfGetSyncRootInfoByHandle$FUNC() { return CfGetSyncRootInfoByHandle$FUNC_; }

    static final MethodHandle CfGetSyncRootInfoByHandle$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfGetSyncRootInfoByHandle",
            "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
            CfGetSyncRootInfoByHandle$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfGetSyncRootInfoByHandle$MH() { return CfGetSyncRootInfoByHandle$MH_; }

    static final int CF_PLACEHOLDER_RANGE_INFO_ONDISK() { return (int)1L; }

    static final int CF_PLACEHOLDER_RANGE_INFO_VALIDATED() { return (int)2L; }

    static final int CF_PLACEHOLDER_RANGE_INFO_MODIFIED() { return (int)3L; }

    static final FunctionDescriptor CfGetPlaceholderRangeInfo$FUNC_ = FunctionDescriptor.of(C_LONG,
            C_POINTER,
            C_INT,
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
            C_POINTER,
            C_LONG,
            C_POINTER
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfGetPlaceholderRangeInfo$FUNC() { return CfGetPlaceholderRangeInfo$FUNC_; }

    static final MethodHandle CfGetPlaceholderRangeInfo$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfGetPlaceholderRangeInfo",
            "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
            CfGetPlaceholderRangeInfo$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfGetPlaceholderRangeInfo$MH() { return CfGetPlaceholderRangeInfo$MH_; }

    static final FunctionDescriptor CfReportProviderProgress$FUNC_ = FunctionDescriptor.of(C_LONG,
            MemoryLayout.ofStruct(
                    C_LONGLONG.withName("Internal")
            ).withName("CF_CONNECTION_KEY__"),
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
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("_LARGE_INTEGER")
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfReportProviderProgress$FUNC() { return CfReportProviderProgress$FUNC_; }

    static final MethodHandle CfReportProviderProgress$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfReportProviderProgress",
            "(Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;)I",
            CfReportProviderProgress$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfReportProviderProgress$MH() { return CfReportProviderProgress$MH_; }

    static final FunctionDescriptor CfReportProviderProgress2$FUNC_ = FunctionDescriptor.of(C_LONG,
            MemoryLayout.ofStruct(
                    C_LONGLONG.withName("Internal")
            ).withName("CF_CONNECTION_KEY__"),
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
            C_LONG
    );
    static final jdk.incubator.foreign.FunctionDescriptor CfReportProviderProgress2$FUNC() { return CfReportProviderProgress2$FUNC_; }

    static final MethodHandle CfReportProviderProgress2$MH_ = RuntimeHelper.downcallHandle(
            LIBRARIES, "CfReportProviderProgress2",
            "(Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;I)I",
            CfReportProviderProgress2$FUNC_, false
    );
    static final java.lang.invoke.MethodHandle CfReportProviderProgress2$MH() { return CfReportProviderProgress2$MH_; }

}
