package com.github.tornaia.cf.win.cfapi.internal;

import jdk.incubator.foreign.FunctionDescriptor;
import jdk.incubator.foreign.MemoryLayout;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

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
}
