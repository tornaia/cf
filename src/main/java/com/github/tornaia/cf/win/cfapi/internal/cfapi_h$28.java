package com.github.tornaia.cf.win.cfapi.internal;

import jdk.incubator.foreign.Addressable;

import java.lang.invoke.MethodHandle;

public class cfapi_h$28 {

    public static @C("int") int CF_REGISTER_FLAG_NONE() {
        return cfapi_h$constants$99.CF_REGISTER_FLAG_NONE();
    }
    public static @C("int") int CF_REGISTER_FLAG_UPDATE() {
        return cfapi_h$constants$99.CF_REGISTER_FLAG_UPDATE();
    }
    public static @C("int") int CF_REGISTER_FLAG_DISABLE_ON_DEMAND_POPULATION_ON_ROOT() {
        return cfapi_h$constants$99.CF_REGISTER_FLAG_DISABLE_ON_DEMAND_POPULATION_ON_ROOT();
    }
    public static @C("int") int CF_REGISTER_FLAG_MARK_IN_SYNC_ON_ROOT() {
        return cfapi_h$constants$99.CF_REGISTER_FLAG_MARK_IN_SYNC_ON_ROOT();
    }
    public static @C("int") int CF_HYDRATION_POLICY_PARTIAL() {
        return cfapi_h$constants$99.CF_HYDRATION_POLICY_PARTIAL();
    }
    public static @C("int") int CF_HYDRATION_POLICY_PROGRESSIVE() {
        return cfapi_h$constants$99.CF_HYDRATION_POLICY_PROGRESSIVE();
    }
    public static @C("int") int CF_HYDRATION_POLICY_FULL() {
        return cfapi_h$constants$99.CF_HYDRATION_POLICY_FULL();
    }
    public static @C("int") int CF_HYDRATION_POLICY_ALWAYS_FULL() {
        return cfapi_h$constants$99.CF_HYDRATION_POLICY_ALWAYS_FULL();
    }
    public static @C("int") int CF_HYDRATION_POLICY_MODIFIER_NONE() {
        return cfapi_h$constants$99.CF_HYDRATION_POLICY_MODIFIER_NONE();
    }
    public static @C("int") int CF_HYDRATION_POLICY_MODIFIER_VALIDATION_REQUIRED() {
        return cfapi_h$constants$99.CF_HYDRATION_POLICY_MODIFIER_VALIDATION_REQUIRED();
    }
    public static @C("int") int CF_HYDRATION_POLICY_MODIFIER_STREAMING_ALLOWED() {
        return cfapi_h$constants$99.CF_HYDRATION_POLICY_MODIFIER_STREAMING_ALLOWED();
    }
    public static @C("int") int CF_HYDRATION_POLICY_MODIFIER_AUTO_DEHYDRATION_ALLOWED() {
        return cfapi_h$constants$99.CF_HYDRATION_POLICY_MODIFIER_AUTO_DEHYDRATION_ALLOWED();
    }
    public static @C("int") int CF_POPULATION_POLICY_PARTIAL() {
        return cfapi_h$constants$99.CF_POPULATION_POLICY_PARTIAL();
    }
    public static @C("int") int CF_POPULATION_POLICY_FULL() {
        return cfapi_h$constants$99.CF_POPULATION_POLICY_FULL();
    }
    public static @C("int") int CF_POPULATION_POLICY_ALWAYS_FULL() {
        return cfapi_h$constants$99.CF_POPULATION_POLICY_ALWAYS_FULL();
    }
    public static @C("int") int CF_POPULATION_POLICY_MODIFIER_NONE() {
        return cfapi_h$constants$99.CF_POPULATION_POLICY_MODIFIER_NONE();
    }
    public static @C("int") int CF_PLACEHOLDER_MANAGEMENT_POLICY_DEFAULT() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_MANAGEMENT_POLICY_DEFAULT();
    }
    public static @C("int") int CF_PLACEHOLDER_MANAGEMENT_POLICY_CREATE_UNRESTRICTED() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_MANAGEMENT_POLICY_CREATE_UNRESTRICTED();
    }
    public static @C("int") int CF_PLACEHOLDER_MANAGEMENT_POLICY_CONVERT_TO_UNRESTRICTED() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_MANAGEMENT_POLICY_CONVERT_TO_UNRESTRICTED();
    }
    public static @C("int") int CF_PLACEHOLDER_MANAGEMENT_POLICY_UPDATE_UNRESTRICTED() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_MANAGEMENT_POLICY_UPDATE_UNRESTRICTED();
    }
    public static @C("int") int CF_INSYNC_POLICY_NONE() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_NONE();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_FILE_CREATION_TIME() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_FILE_CREATION_TIME();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_FILE_READONLY_ATTRIBUTE() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_FILE_READONLY_ATTRIBUTE();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_FILE_HIDDEN_ATTRIBUTE() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_FILE_HIDDEN_ATTRIBUTE();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_FILE_SYSTEM_ATTRIBUTE() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_FILE_SYSTEM_ATTRIBUTE();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_DIRECTORY_CREATION_TIME() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_DIRECTORY_CREATION_TIME();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_DIRECTORY_READONLY_ATTRIBUTE() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_DIRECTORY_READONLY_ATTRIBUTE();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_DIRECTORY_HIDDEN_ATTRIBUTE() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_DIRECTORY_HIDDEN_ATTRIBUTE();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_DIRECTORY_SYSTEM_ATTRIBUTE() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_DIRECTORY_SYSTEM_ATTRIBUTE();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_FILE_LAST_WRITE_TIME() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_FILE_LAST_WRITE_TIME();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_DIRECTORY_LAST_WRITE_TIME() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_DIRECTORY_LAST_WRITE_TIME();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_FILE_ALL() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_FILE_ALL();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_DIRECTORY_ALL() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_DIRECTORY_ALL();
    }
    public static @C("int") int CF_INSYNC_POLICY_TRACK_ALL() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_TRACK_ALL();
    }
    public static @C("int") int CF_INSYNC_POLICY_PRESERVE_INSYNC_FOR_SYNC_ENGINE() {
        return cfapi_h$constants$99.CF_INSYNC_POLICY_PRESERVE_INSYNC_FOR_SYNC_ENGINE();
    }
    public static @C("int") int CF_HARDLINK_POLICY_NONE() {
        return cfapi_h$constants$99.CF_HARDLINK_POLICY_NONE();
    }
    public static @C("int") int CF_HARDLINK_POLICY_ALLOWED() {
        return cfapi_h$constants$99.CF_HARDLINK_POLICY_ALLOWED();
    }

    public static  MethodHandle CfRegisterSyncRoot$MH() {
        return cfapi_h$constants$99.CfRegisterSyncRoot$MH();
    }
    public static @C("HRESULT") int CfRegisterSyncRoot (@C("LPCWSTR") Addressable SyncRootPath, @C("const CF_SYNC_REGISTRATION*") Addressable Registration, @C("const CF_SYNC_POLICIES*") Addressable Policies, @C("CF_REGISTER_FLAGS") int RegisterFlags) {
        try {
            return (int)cfapi_h$constants$99.CfRegisterSyncRoot$MH().invokeExact(SyncRootPath.address(), Registration.address(), Policies.address(), RegisterFlags);
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }

    public static  MethodHandle CfUnregisterSyncRoot$MH() {
        return cfapi_h$constants$99.CfUnregisterSyncRoot$MH();
    }
    public static @C("HRESULT") int CfUnregisterSyncRoot (@C("LPCWSTR") Addressable SyncRootPath) {
        try {
            return (int)cfapi_h$constants$99.CfUnregisterSyncRoot$MH().invokeExact(SyncRootPath.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }

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
