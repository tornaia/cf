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

    public static @C("int") int CF_CALLBACK_CANCEL_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_CANCEL_FLAG_NONE();
    }
    public static @C("int") int CF_CALLBACK_CANCEL_FLAG_IO_TIMEOUT() {
        return cfapi_h$constants$99.CF_CALLBACK_CANCEL_FLAG_IO_TIMEOUT();
    }
    public static @C("int") int CF_CALLBACK_CANCEL_FLAG_IO_ABORTED() {
        return cfapi_h$constants$99.CF_CALLBACK_CANCEL_FLAG_IO_ABORTED();
    }
    public static @C("int") int CF_CALLBACK_FETCH_DATA_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_FETCH_DATA_FLAG_NONE();
    }
    public static @C("int") int CF_CALLBACK_FETCH_DATA_FLAG_RECOVERY() {
        return cfapi_h$constants$99.CF_CALLBACK_FETCH_DATA_FLAG_RECOVERY();
    }
    public static @C("int") int CF_CALLBACK_FETCH_DATA_FLAG_EXPLICIT_HYDRATION() {
        return cfapi_h$constants$99.CF_CALLBACK_FETCH_DATA_FLAG_EXPLICIT_HYDRATION();
    }
    public static @C("int") int CF_CALLBACK_VALIDATE_DATA_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_VALIDATE_DATA_FLAG_NONE();
    }
    public static @C("int") int CF_CALLBACK_VALIDATE_DATA_FLAG_EXPLICIT_HYDRATION() {
        return cfapi_h$constants$99.CF_CALLBACK_VALIDATE_DATA_FLAG_EXPLICIT_HYDRATION();
    }
    public static @C("int") int CF_CALLBACK_FETCH_PLACEHOLDERS_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_FETCH_PLACEHOLDERS_FLAG_NONE();
    }
    public static @C("int") int CF_CALLBACK_OPEN_COMPLETION_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_OPEN_COMPLETION_FLAG_NONE();
    }
    public static @C("int") int CF_CALLBACK_OPEN_COMPLETION_FLAG_PLACEHOLDER_UNKNOWN() {
        return cfapi_h$constants$99.CF_CALLBACK_OPEN_COMPLETION_FLAG_PLACEHOLDER_UNKNOWN();
    }
    public static @C("int") int CF_CALLBACK_OPEN_COMPLETION_FLAG_PLACEHOLDER_UNSUPPORTED() {
        return cfapi_h$constants$99.CF_CALLBACK_OPEN_COMPLETION_FLAG_PLACEHOLDER_UNSUPPORTED();
    }
    public static @C("int") int CF_CALLBACK_CLOSE_COMPLETION_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_CLOSE_COMPLETION_FLAG_NONE();
    }
    public static @C("int") int CF_CALLBACK_CLOSE_COMPLETION_FLAG_DELETED() {
        return cfapi_h$constants$99.CF_CALLBACK_CLOSE_COMPLETION_FLAG_DELETED();
    }
    public static @C("int") int CF_CALLBACK_DEHYDRATE_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_DEHYDRATE_FLAG_NONE();
    }
    public static @C("int") int CF_CALLBACK_DEHYDRATE_FLAG_BACKGROUND() {
        return cfapi_h$constants$99.CF_CALLBACK_DEHYDRATE_FLAG_BACKGROUND();
    }
    public static @C("int") int CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_NONE();
    }
    public static @C("int") int CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_BACKGROUND() {
        return cfapi_h$constants$99.CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_BACKGROUND();
    }
    public static @C("int") int CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_DEHYDRATED() {
        return cfapi_h$constants$99.CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_DEHYDRATED();
    }
    public static @C("int") int CF_CALLBACK_DELETE_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_DELETE_FLAG_NONE();
    }
    public static @C("int") int CF_CALLBACK_DELETE_FLAG_IS_DIRECTORY() {
        return cfapi_h$constants$99.CF_CALLBACK_DELETE_FLAG_IS_DIRECTORY();
    }
    public static @C("int") int CF_CALLBACK_DELETE_FLAG_IS_UNDELETE() {
        return cfapi_h$constants$99.CF_CALLBACK_DELETE_FLAG_IS_UNDELETE();
    }
    public static @C("int") int CF_CALLBACK_DELETE_COMPLETION_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_DELETE_COMPLETION_FLAG_NONE();
    }
    public static @C("int") int CF_CALLBACK_RENAME_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_RENAME_FLAG_NONE();
    }
    public static @C("int") int CF_CALLBACK_RENAME_FLAG_IS_DIRECTORY() {
        return cfapi_h$constants$99.CF_CALLBACK_RENAME_FLAG_IS_DIRECTORY();
    }
    public static @C("int") int CF_CALLBACK_RENAME_FLAG_SOURCE_IN_SCOPE() {
        return cfapi_h$constants$99.CF_CALLBACK_RENAME_FLAG_SOURCE_IN_SCOPE();
    }
    public static @C("int") int CF_CALLBACK_RENAME_FLAG_TARGET_IN_SCOPE() {
        return cfapi_h$constants$99.CF_CALLBACK_RENAME_FLAG_TARGET_IN_SCOPE();
    }
    public static @C("int") int CF_CALLBACK_RENAME_COMPLETION_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_RENAME_COMPLETION_FLAG_NONE();
    }
    public static @C("int") int CF_CALLBACK_DEHYDRATION_REASON_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_DEHYDRATION_REASON_NONE();
    }
    public static @C("int") int CF_CALLBACK_DEHYDRATION_REASON_USER_MANUAL() {
        return cfapi_h$constants$99.CF_CALLBACK_DEHYDRATION_REASON_USER_MANUAL();
    }
    public static @C("int") int CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_LOW_SPACE() {
        return cfapi_h$constants$99.CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_LOW_SPACE();
    }
    public static @C("int") int CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_INACTIVITY() {
        return cfapi_h$constants$99.CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_INACTIVITY();
    }
    public static @C("int") int CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_OS_UPGRADE() {
        return cfapi_h$constants$99.CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_OS_UPGRADE();
    }
    public static @C("int") int CF_CALLBACK_TYPE_FETCH_DATA() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_FETCH_DATA();
    }
    public static @C("int") int CF_CALLBACK_TYPE_VALIDATE_DATA() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_VALIDATE_DATA();
    }
    public static @C("int") int CF_CALLBACK_TYPE_CANCEL_FETCH_DATA() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_CANCEL_FETCH_DATA();
    }
    public static @C("int") int CF_CALLBACK_TYPE_FETCH_PLACEHOLDERS() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_FETCH_PLACEHOLDERS();
    }
    public static @C("int") int CF_CALLBACK_TYPE_CANCEL_FETCH_PLACEHOLDERS() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_CANCEL_FETCH_PLACEHOLDERS();
    }
    public static @C("int") int CF_CALLBACK_TYPE_NOTIFY_FILE_OPEN_COMPLETION() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_NOTIFY_FILE_OPEN_COMPLETION();
    }
    public static @C("int") int CF_CALLBACK_TYPE_NOTIFY_FILE_CLOSE_COMPLETION() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_NOTIFY_FILE_CLOSE_COMPLETION();
    }
    public static @C("int") int CF_CALLBACK_TYPE_NOTIFY_DEHYDRATE() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_NOTIFY_DEHYDRATE();
    }
    public static @C("int") int CF_CALLBACK_TYPE_NOTIFY_DEHYDRATE_COMPLETION() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_NOTIFY_DEHYDRATE_COMPLETION();
    }
    public static @C("int") int CF_CALLBACK_TYPE_NOTIFY_DELETE() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_NOTIFY_DELETE();
    }
    public static @C("int") int CF_CALLBACK_TYPE_NOTIFY_DELETE_COMPLETION() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_NOTIFY_DELETE_COMPLETION();
    }
    public static @C("int") int CF_CALLBACK_TYPE_NOTIFY_RENAME() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_NOTIFY_RENAME();
    }
    public static @C("int") int CF_CALLBACK_TYPE_NOTIFY_RENAME_COMPLETION() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_NOTIFY_RENAME_COMPLETION();
    }
    public static @C("int") int CF_CALLBACK_TYPE_NONE() {
        return cfapi_h$constants$99.CF_CALLBACK_TYPE_NONE();
    }
    public static @C("int") int CF_CONNECT_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CONNECT_FLAG_NONE();
    }
    public static @C("int") int CF_CONNECT_FLAG_REQUIRE_PROCESS_INFO() {
        return cfapi_h$constants$99.CF_CONNECT_FLAG_REQUIRE_PROCESS_INFO();
    }
    public static @C("int") int CF_CONNECT_FLAG_REQUIRE_FULL_FILE_PATH() {
        return cfapi_h$constants$99.CF_CONNECT_FLAG_REQUIRE_FULL_FILE_PATH();
    }
    public static @C("int") int CF_CONNECT_FLAG_BLOCK_SELF_IMPLICIT_HYDRATION() {
        return cfapi_h$constants$99.CF_CONNECT_FLAG_BLOCK_SELF_IMPLICIT_HYDRATION();
    }
    public static  MethodHandle CfConnectSyncRoot$MH() {
        return cfapi_h$constants$99.CfConnectSyncRoot$MH();
    }
    public static @C("HRESULT") int CfConnectSyncRoot (@C("LPCWSTR") Addressable SyncRootPath, @C("const CF_CALLBACK_REGISTRATION*") Addressable CallbackTable, @C("LPCVOID") Addressable CallbackContext, @C("CF_CONNECT_FLAGS") int ConnectFlags, @C("CF_CONNECTION_KEY*") Addressable ConnectionKey) {
        try {
            return (int)cfapi_h$constants$99.CfConnectSyncRoot$MH().invokeExact(SyncRootPath.address(), CallbackTable.address(), CallbackContext.address(), ConnectFlags, ConnectionKey.address());
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
