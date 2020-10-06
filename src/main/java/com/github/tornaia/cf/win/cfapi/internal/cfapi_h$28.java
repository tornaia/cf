package com.github.tornaia.cf.win.cfapi.internal;

import jdk.incubator.foreign.Addressable;

import java.lang.invoke.MethodHandle;

public class cfapi_h$28 {

    public static MethodHandle CfGetPlatformInfo$MH() {
        return cfapi_h$constants$99.CfGetPlatformInfo$MH();
    }

    public static @C("HRESULT") int CfGetPlatformInfo(@C("CF_PLATFORM_INFO*") Addressable PlatformVersion) {
        try {
            return (int) cfapi_h$constants$99.CfGetPlatformInfo$MH().invokeExact(PlatformVersion.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
}
