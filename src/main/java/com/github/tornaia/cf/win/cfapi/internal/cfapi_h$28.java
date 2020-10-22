package com.github.tornaia.cf.win.cfapi.internal;

import jdk.incubator.foreign.Addressable;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;

class cfapi_h$28 extends cfapi_h$11 {

    public static @C("int") int CF_PLACEHOLDER_CREATE_FLAG_NONE() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_FLAG_NONE();
    }
    public static @C("int") int CF_PLACEHOLDER_CREATE_FLAG_DISABLE_ON_DEMAND_POPULATION() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_FLAG_DISABLE_ON_DEMAND_POPULATION();
    }
    public static @C("int") int CF_PLACEHOLDER_CREATE_FLAG_MARK_IN_SYNC() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_FLAG_MARK_IN_SYNC();
    }
    public static @C("int") int CF_PLACEHOLDER_CREATE_FLAG_SUPERSEDE() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_FLAG_SUPERSEDE();
    }
    public static @C("int") int CF_PLACEHOLDER_CREATE_FLAG_ALWAYS_FULL() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_CREATE_FLAG_ALWAYS_FULL();
    }
    public static @C("int") int CF_PROVIDER_STATUS_DISCONNECTED() {
        return cfapi_h$constants$99.CF_PROVIDER_STATUS_DISCONNECTED();
    }
    public static @C("int") int CF_PROVIDER_STATUS_IDLE() {
        return cfapi_h$constants$99.CF_PROVIDER_STATUS_IDLE();
    }
    public static @C("int") int CF_PROVIDER_STATUS_POPULATE_NAMESPACE() {
        return cfapi_h$constants$99.CF_PROVIDER_STATUS_POPULATE_NAMESPACE();
    }
    public static @C("int") int CF_PROVIDER_STATUS_POPULATE_METADATA() {
        return cfapi_h$constants$99.CF_PROVIDER_STATUS_POPULATE_METADATA();
    }
    public static @C("int") int CF_PROVIDER_STATUS_POPULATE_CONTENT() {
        return cfapi_h$constants$99.CF_PROVIDER_STATUS_POPULATE_CONTENT();
    }
    public static @C("int") int CF_PROVIDER_STATUS_SYNC_INCREMENTAL() {
        return cfapi_h$constants$99.CF_PROVIDER_STATUS_SYNC_INCREMENTAL();
    }
    public static @C("int") int CF_PROVIDER_STATUS_SYNC_FULL() {
        return cfapi_h$constants$99.CF_PROVIDER_STATUS_SYNC_FULL();
    }
    public static @C("int") int CF_PROVIDER_STATUS_CONNECTIVITY_LOST() {
        return cfapi_h$constants$99.CF_PROVIDER_STATUS_CONNECTIVITY_LOST();
    }
    public static @C("int") int CF_PROVIDER_STATUS_CLEAR_FLAGS() {
        return cfapi_h$constants$99.CF_PROVIDER_STATUS_CLEAR_FLAGS();
    }
    public static @C("int") int CF_PROVIDER_STATUS_TERMINATED() {
        return cfapi_h$constants$99.CF_PROVIDER_STATUS_TERMINATED();
    }
    public static @C("int") int CF_PROVIDER_STATUS_ERROR() {
        return cfapi_h$constants$99.CF_PROVIDER_STATUS_ERROR();
    }
    public static  MethodHandle CfGetPlatformInfo$MH() {
        return cfapi_h$constants$99.CfGetPlatformInfo$MH();
    }
    public static @C("HRESULT") int CfGetPlatformInfo (@C("CF_PLATFORM_INFO*") Addressable PlatformVersion) {
        try {
            return (int)cfapi_h$constants$99.CfGetPlatformInfo$MH().invokeExact(PlatformVersion.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
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
    public static  MethodHandle OnFetchData$MH() {
        return cfapi_h$constants$99.OnFetchData$MH();
    }
    public static void OnFetchData (@C("const CF_CALLBACK_INFO*") Addressable callbackInfo, @C("const CF_CALLBACK_PARAMETERS*") Addressable callbackParameters) {
        try {
            cfapi_h$constants$99.OnFetchData$MH().invokeExact(callbackInfo.address(), callbackParameters.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
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
    public static  MethodHandle CfDisconnectSyncRoot$MH() {
        return cfapi_h$constants$99.CfDisconnectSyncRoot$MH();
    }
    public static @C("HRESULT") int CfDisconnectSyncRoot (@C("CF_CONNECTION_KEY") MemorySegment ConnectionKey) {
        try {
            return (int)cfapi_h$constants$99.CfDisconnectSyncRoot$MH().invokeExact(ConnectionKey);
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfGetTransferKey$MH() {
        return cfapi_h$constants$99.CfGetTransferKey$MH();
    }
    public static @C("HRESULT") int CfGetTransferKey (@C("HANDLE") Addressable FileHandle, @C("CF_TRANSFER_KEY*") Addressable TransferKey) {
        try {
            return (int)cfapi_h$constants$99.CfGetTransferKey$MH().invokeExact(FileHandle.address(), TransferKey.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfReleaseTransferKey$MH() {
        return cfapi_h$constants$99.CfReleaseTransferKey$MH();
    }
    public static void CfReleaseTransferKey (@C("HANDLE") Addressable FileHandle, @C("CF_TRANSFER_KEY*") Addressable TransferKey) {
        try {
            cfapi_h$constants$99.CfReleaseTransferKey$MH().invokeExact(FileHandle.address(), TransferKey.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_OPERATION_TYPE_TRANSFER_DATA() {
        return cfapi_h$constants$99.CF_OPERATION_TYPE_TRANSFER_DATA();
    }
    public static @C("int") int CF_OPERATION_TYPE_RETRIEVE_DATA() {
        return cfapi_h$constants$99.CF_OPERATION_TYPE_RETRIEVE_DATA();
    }
    public static @C("int") int CF_OPERATION_TYPE_ACK_DATA() {
        return cfapi_h$constants$99.CF_OPERATION_TYPE_ACK_DATA();
    }
    public static @C("int") int CF_OPERATION_TYPE_RESTART_HYDRATION() {
        return cfapi_h$constants$99.CF_OPERATION_TYPE_RESTART_HYDRATION();
    }
    public static @C("int") int CF_OPERATION_TYPE_TRANSFER_PLACEHOLDERS() {
        return cfapi_h$constants$99.CF_OPERATION_TYPE_TRANSFER_PLACEHOLDERS();
    }
    public static @C("int") int CF_OPERATION_TYPE_ACK_DEHYDRATE() {
        return cfapi_h$constants$99.CF_OPERATION_TYPE_ACK_DEHYDRATE();
    }
    public static @C("int") int CF_OPERATION_TYPE_ACK_DELETE() {
        return cfapi_h$constants$99.CF_OPERATION_TYPE_ACK_DELETE();
    }
    public static @C("int") int CF_OPERATION_TYPE_ACK_RENAME() {
        return cfapi_h$constants$99.CF_OPERATION_TYPE_ACK_RENAME();
    }
    public static @C("int") int CF_OPERATION_TRANSFER_DATA_FLAG_NONE() {
        return cfapi_h$constants$99.CF_OPERATION_TRANSFER_DATA_FLAG_NONE();
    }
    public static @C("int") int CF_OPERATION_RETRIEVE_DATA_FLAG_NONE() {
        return cfapi_h$constants$99.CF_OPERATION_RETRIEVE_DATA_FLAG_NONE();
    }
    public static @C("int") int CF_OPERATION_ACK_DATA_FLAG_NONE() {
        return cfapi_h$constants$99.CF_OPERATION_ACK_DATA_FLAG_NONE();
    }
    public static @C("int") int CF_OPERATION_RESTART_HYDRATION_FLAG_NONE() {
        return cfapi_h$constants$99.CF_OPERATION_RESTART_HYDRATION_FLAG_NONE();
    }
    public static @C("int") int CF_OPERATION_RESTART_HYDRATION_FLAG_MARK_IN_SYNC() {
        return cfapi_h$constants$99.CF_OPERATION_RESTART_HYDRATION_FLAG_MARK_IN_SYNC();
    }
    public static @C("int") int CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_NONE() {
        return cfapi_h$constants$99.CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_NONE();
    }
    public static @C("int") int CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_STOP_ON_ERROR() {
        return cfapi_h$constants$99.CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_STOP_ON_ERROR();
    }
    public static @C("int") int CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_DISABLE_ON_DEMAND_POPULATION() {
        return cfapi_h$constants$99.CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_DISABLE_ON_DEMAND_POPULATION();
    }
    public static @C("int") int CF_OPERATION_ACK_DEHYDRATE_FLAG_NONE() {
        return cfapi_h$constants$99.CF_OPERATION_ACK_DEHYDRATE_FLAG_NONE();
    }
    public static @C("int") int CF_OPERATION_ACK_RENAME_FLAG_NONE() {
        return cfapi_h$constants$99.CF_OPERATION_ACK_RENAME_FLAG_NONE();
    }
    public static @C("int") int CF_OPERATION_ACK_DELETE_FLAG_NONE() {
        return cfapi_h$constants$99.CF_OPERATION_ACK_DELETE_FLAG_NONE();
    }
    public static  MethodHandle CfExecute$MH() {
        return cfapi_h$constants$99.CfExecute$MH();
    }
    public static @C("HRESULT") int CfExecute (@C("const CF_OPERATION_INFO*") Addressable OpInfo, @C("CF_OPERATION_PARAMETERS*") Addressable OpParams) {
        try {
            return (int)cfapi_h$constants$99.CfExecute$MH().invokeExact(OpInfo.address(), OpParams.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfUpdateSyncProviderStatus$MH() {
        return cfapi_h$constants$99.CfUpdateSyncProviderStatus$MH();
    }
    public static @C("HRESULT") int CfUpdateSyncProviderStatus (@C("CF_CONNECTION_KEY") MemorySegment ConnectionKey, @C("CF_SYNC_PROVIDER_STATUS") int ProviderStatus) {
        try {
            return (int)cfapi_h$constants$99.CfUpdateSyncProviderStatus$MH().invokeExact(ConnectionKey, ProviderStatus);
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfQuerySyncProviderStatus$MH() {
        return cfapi_h$constants$99.CfQuerySyncProviderStatus$MH();
    }
    public static @C("HRESULT") int CfQuerySyncProviderStatus (@C("CF_CONNECTION_KEY") MemorySegment ConnectionKey, @C("CF_SYNC_PROVIDER_STATUS*") Addressable ProviderStatus) {
        try {
            return (int)cfapi_h$constants$99.CfQuerySyncProviderStatus$MH().invokeExact(ConnectionKey, ProviderStatus.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfReportSyncStatus$MH() {
        return cfapi_h$constants$99.CfReportSyncStatus$MH();
    }
    public static @C("HRESULT") int CfReportSyncStatus (@C("LPCWSTR") Addressable SyncRootPath, @C("CF_SYNC_STATUS*") Addressable SyncStatus) {
        try {
            return (int)cfapi_h$constants$99.CfReportSyncStatus$MH().invokeExact(SyncRootPath.address(), SyncStatus.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_CREATE_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CREATE_FLAG_NONE();
    }
    public static @C("int") int CF_CREATE_FLAG_STOP_ON_ERROR() {
        return cfapi_h$constants$99.CF_CREATE_FLAG_STOP_ON_ERROR();
    }
    public static  MethodHandle CfCreatePlaceholders$MH() {
        return cfapi_h$constants$99.CfCreatePlaceholders$MH();
    }
    public static @C("HRESULT") int CfCreatePlaceholders (@C("LPCWSTR") Addressable BaseDirectoryPath, @C("CF_PLACEHOLDER_CREATE_INFO*") Addressable PlaceholderArray, @C("DWORD") int PlaceholderCount, @C("CF_CREATE_FLAGS") int CreateFlags, @C("PDWORD") Addressable EntriesProcessed) {
        try {
            return (int)cfapi_h$constants$99.CfCreatePlaceholders$MH().invokeExact(BaseDirectoryPath.address(), PlaceholderArray.address(), PlaceholderCount, CreateFlags, EntriesProcessed.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_OPEN_FILE_FLAG_NONE() {
        return cfapi_h$constants$99.CF_OPEN_FILE_FLAG_NONE();
    }
    public static @C("int") int CF_OPEN_FILE_FLAG_EXCLUSIVE() {
        return cfapi_h$constants$99.CF_OPEN_FILE_FLAG_EXCLUSIVE();
    }
    public static @C("int") int CF_OPEN_FILE_FLAG_WRITE_ACCESS() {
        return cfapi_h$constants$99.CF_OPEN_FILE_FLAG_WRITE_ACCESS();
    }
    public static @C("int") int CF_OPEN_FILE_FLAG_DELETE_ACCESS() {
        return cfapi_h$constants$99.CF_OPEN_FILE_FLAG_DELETE_ACCESS();
    }
    public static @C("int") int CF_OPEN_FILE_FLAG_FOREGROUND() {
        return cfapi_h$constants$99.CF_OPEN_FILE_FLAG_FOREGROUND();
    }
    public static  MethodHandle CfOpenFileWithOplock$MH() {
        return cfapi_h$constants$99.CfOpenFileWithOplock$MH();
    }
    public static @C("HRESULT") int CfOpenFileWithOplock (@C("LPCWSTR") Addressable FilePath, @C("CF_OPEN_FILE_FLAGS") int Flags, @C("PHANDLE") Addressable ProtectedHandle) {
        try {
            return (int)cfapi_h$constants$99.CfOpenFileWithOplock$MH().invokeExact(FilePath.address(), Flags, ProtectedHandle.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfReferenceProtectedHandle$MH() {
        return cfapi_h$constants$99.CfReferenceProtectedHandle$MH();
    }
    public static @C("BOOLEAN") byte CfReferenceProtectedHandle (@C("HANDLE") Addressable ProtectedHandle) {
        try {
            return (byte)cfapi_h$constants$99.CfReferenceProtectedHandle$MH().invokeExact(ProtectedHandle.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfGetWin32HandleFromProtectedHandle$MH() {
        return cfapi_h$constants$99.CfGetWin32HandleFromProtectedHandle$MH();
    }
    public static @C("HANDLE") MemoryAddress CfGetWin32HandleFromProtectedHandle (@C("HANDLE") Addressable ProtectedHandle) {
        try {
            return (jdk.incubator.foreign.MemoryAddress)cfapi_h$constants$99.CfGetWin32HandleFromProtectedHandle$MH().invokeExact(ProtectedHandle.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfReleaseProtectedHandle$MH() {
        return cfapi_h$constants$99.CfReleaseProtectedHandle$MH();
    }
    public static void CfReleaseProtectedHandle (@C("HANDLE") Addressable ProtectedHandle) {
        try {
            cfapi_h$constants$99.CfReleaseProtectedHandle$MH().invokeExact(ProtectedHandle.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfCloseHandle$MH() {
        return cfapi_h$constants$99.CfCloseHandle$MH();
    }
    public static void CfCloseHandle (@C("HANDLE") Addressable FileHandle) {
        try {
            cfapi_h$constants$99.CfCloseHandle$MH().invokeExact(FileHandle.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_CONVERT_FLAG_NONE() {
        return cfapi_h$constants$99.CF_CONVERT_FLAG_NONE();
    }
    public static @C("int") int CF_CONVERT_FLAG_MARK_IN_SYNC() {
        return cfapi_h$constants$99.CF_CONVERT_FLAG_MARK_IN_SYNC();
    }
    public static @C("int") int CF_CONVERT_FLAG_DEHYDRATE() {
        return cfapi_h$constants$99.CF_CONVERT_FLAG_DEHYDRATE();
    }
    public static @C("int") int CF_CONVERT_FLAG_ENABLE_ON_DEMAND_POPULATION() {
        return cfapi_h$constants$99.CF_CONVERT_FLAG_ENABLE_ON_DEMAND_POPULATION();
    }
    public static @C("int") int CF_CONVERT_FLAG_ALWAYS_FULL() {
        return cfapi_h$constants$99.CF_CONVERT_FLAG_ALWAYS_FULL();
    }
    public static  MethodHandle CfConvertToPlaceholder$MH() {
        return cfapi_h$constants$99.CfConvertToPlaceholder$MH();
    }
    public static @C("HRESULT") int CfConvertToPlaceholder (@C("HANDLE") Addressable FileHandle, @C("LPCVOID") Addressable FileIdentity, @C("DWORD") int FileIdentityLength, @C("CF_CONVERT_FLAGS") int ConvertFlags, @C("USN*") Addressable ConvertUsn, @C("LPOVERLAPPED") Addressable Overlapped) {
        try {
            return (int)cfapi_h$constants$99.CfConvertToPlaceholder$MH().invokeExact(FileHandle.address(), FileIdentity.address(), FileIdentityLength, ConvertFlags, ConvertUsn.address(), Overlapped.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_UPDATE_FLAG_NONE() {
        return cfapi_h$constants$99.CF_UPDATE_FLAG_NONE();
    }
    public static @C("int") int CF_UPDATE_FLAG_VERIFY_IN_SYNC() {
        return cfapi_h$constants$99.CF_UPDATE_FLAG_VERIFY_IN_SYNC();
    }
    public static @C("int") int CF_UPDATE_FLAG_MARK_IN_SYNC() {
        return cfapi_h$constants$99.CF_UPDATE_FLAG_MARK_IN_SYNC();
    }
    public static @C("int") int CF_UPDATE_FLAG_DEHYDRATE() {
        return cfapi_h$constants$99.CF_UPDATE_FLAG_DEHYDRATE();
    }
    public static @C("int") int CF_UPDATE_FLAG_ENABLE_ON_DEMAND_POPULATION() {
        return cfapi_h$constants$99.CF_UPDATE_FLAG_ENABLE_ON_DEMAND_POPULATION();
    }
    public static @C("int") int CF_UPDATE_FLAG_DISABLE_ON_DEMAND_POPULATION() {
        return cfapi_h$constants$99.CF_UPDATE_FLAG_DISABLE_ON_DEMAND_POPULATION();
    }
    public static @C("int") int CF_UPDATE_FLAG_REMOVE_FILE_IDENTITY() {
        return cfapi_h$constants$99.CF_UPDATE_FLAG_REMOVE_FILE_IDENTITY();
    }
    public static @C("int") int CF_UPDATE_FLAG_CLEAR_IN_SYNC() {
        return cfapi_h$constants$99.CF_UPDATE_FLAG_CLEAR_IN_SYNC();
    }
    public static @C("int") int CF_UPDATE_FLAG_REMOVE_PROPERTY() {
        return cfapi_h$constants$99.CF_UPDATE_FLAG_REMOVE_PROPERTY();
    }
    public static @C("int") int CF_UPDATE_FLAG_PASSTHROUGH_FS_METADATA() {
        return cfapi_h$constants$99.CF_UPDATE_FLAG_PASSTHROUGH_FS_METADATA();
    }
    public static @C("int") int CF_UPDATE_FLAG_ALWAYS_FULL() {
        return cfapi_h$constants$99.CF_UPDATE_FLAG_ALWAYS_FULL();
    }
    public static @C("int") int CF_UPDATE_FLAG_ALLOW_PARTIAL() {
        return cfapi_h$constants$99.CF_UPDATE_FLAG_ALLOW_PARTIAL();
    }
    public static  MethodHandle CfUpdatePlaceholder$MH() {
        return cfapi_h$constants$99.CfUpdatePlaceholder$MH();
    }
    public static @C("HRESULT") int CfUpdatePlaceholder (@C("HANDLE") Addressable FileHandle, @C("const CF_FS_METADATA*") Addressable FsMetadata, @C("LPCVOID") Addressable FileIdentity, @C("DWORD") int FileIdentityLength, @C("const CF_FILE_RANGE*") Addressable DehydrateRangeArray, @C("DWORD") int DehydrateRangeCount, @C("CF_UPDATE_FLAGS") int UpdateFlags, @C("USN*") Addressable UpdateUsn, @C("LPOVERLAPPED") Addressable Overlapped) {
        try {
            return (int)cfapi_h$constants$99.CfUpdatePlaceholder$MH().invokeExact(FileHandle.address(), FsMetadata.address(), FileIdentity.address(), FileIdentityLength, DehydrateRangeArray.address(), DehydrateRangeCount, UpdateFlags, UpdateUsn.address(), Overlapped.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_REVERT_FLAG_NONE() {
        return cfapi_h$constants$99.CF_REVERT_FLAG_NONE();
    }
    public static  MethodHandle CfRevertPlaceholder$MH() {
        return cfapi_h$constants$99.CfRevertPlaceholder$MH();
    }
    public static @C("HRESULT") int CfRevertPlaceholder (@C("HANDLE") Addressable FileHandle, @C("CF_REVERT_FLAGS") int RevertFlags, @C("LPOVERLAPPED") Addressable Overlapped) {
        try {
            return (int)cfapi_h$constants$99.CfRevertPlaceholder$MH().invokeExact(FileHandle.address(), RevertFlags, Overlapped.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_HYDRATE_FLAG_NONE() {
        return cfapi_h$constants$99.CF_HYDRATE_FLAG_NONE();
    }
    public static  MethodHandle CfHydratePlaceholder$MH() {
        return cfapi_h$constants$99.CfHydratePlaceholder$MH();
    }
    public static @C("HRESULT") int CfHydratePlaceholder (@C("HANDLE") Addressable FileHandle, @C("LARGE_INTEGER") MemorySegment StartingOffset, @C("LARGE_INTEGER") MemorySegment Length, @C("CF_HYDRATE_FLAGS") int HydrateFlags, @C("LPOVERLAPPED") Addressable Overlapped) {
        try {
            return (int)cfapi_h$constants$99.CfHydratePlaceholder$MH().invokeExact(FileHandle.address(), StartingOffset, Length, HydrateFlags, Overlapped.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_DEHYDRATE_FLAG_NONE() {
        return cfapi_h$constants$99.CF_DEHYDRATE_FLAG_NONE();
    }
    public static @C("int") int CF_DEHYDRATE_FLAG_BACKGROUND() {
        return cfapi_h$constants$99.CF_DEHYDRATE_FLAG_BACKGROUND();
    }
    public static  MethodHandle CfDehydratePlaceholder$MH() {
        return cfapi_h$constants$99.CfDehydratePlaceholder$MH();
    }
    public static @C("HRESULT") int CfDehydratePlaceholder (@C("HANDLE") Addressable FileHandle, @C("LARGE_INTEGER") MemorySegment StartingOffset, @C("LARGE_INTEGER") MemorySegment Length, @C("CF_DEHYDRATE_FLAGS") int DehydrateFlags, @C("LPOVERLAPPED") Addressable Overlapped) {
        try {
            return (int)cfapi_h$constants$99.CfDehydratePlaceholder$MH().invokeExact(FileHandle.address(), StartingOffset, Length, DehydrateFlags, Overlapped.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_PIN_STATE_UNSPECIFIED() {
        return cfapi_h$constants$99.CF_PIN_STATE_UNSPECIFIED();
    }
    public static @C("int") int CF_PIN_STATE_PINNED() {
        return cfapi_h$constants$99.CF_PIN_STATE_PINNED();
    }
    public static @C("int") int CF_PIN_STATE_UNPINNED() {
        return cfapi_h$constants$99.CF_PIN_STATE_UNPINNED();
    }
    public static @C("int") int CF_PIN_STATE_EXCLUDED() {
        return cfapi_h$constants$99.CF_PIN_STATE_EXCLUDED();
    }
    public static @C("int") int CF_PIN_STATE_INHERIT() {
        return cfapi_h$constants$99.CF_PIN_STATE_INHERIT();
    }
    public static @C("int") int CF_SET_PIN_FLAG_NONE() {
        return cfapi_h$constants$99.CF_SET_PIN_FLAG_NONE();
    }
    public static @C("int") int CF_SET_PIN_FLAG_RECURSE() {
        return cfapi_h$constants$99.CF_SET_PIN_FLAG_RECURSE();
    }
    public static @C("int") int CF_SET_PIN_FLAG_RECURSE_ONLY() {
        return cfapi_h$constants$99.CF_SET_PIN_FLAG_RECURSE_ONLY();
    }
    public static @C("int") int CF_SET_PIN_FLAG_RECURSE_STOP_ON_ERROR() {
        return cfapi_h$constants$99.CF_SET_PIN_FLAG_RECURSE_STOP_ON_ERROR();
    }
    public static  MethodHandle CfSetPinState$MH() {
        return cfapi_h$constants$99.CfSetPinState$MH();
    }
    public static @C("HRESULT") int CfSetPinState (@C("HANDLE") Addressable FileHandle, @C("CF_PIN_STATE") int PinState, @C("CF_SET_PIN_FLAGS") int PinFlags, @C("LPOVERLAPPED") Addressable Overlapped) {
        try {
            return (int)cfapi_h$constants$99.CfSetPinState$MH().invokeExact(FileHandle.address(), PinState, PinFlags, Overlapped.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_IN_SYNC_STATE_NOT_IN_SYNC() {
        return cfapi_h$constants$99.CF_IN_SYNC_STATE_NOT_IN_SYNC();
    }
    public static @C("int") int CF_IN_SYNC_STATE_IN_SYNC() {
        return cfapi_h$constants$99.CF_IN_SYNC_STATE_IN_SYNC();
    }
    public static @C("int") int CF_SET_IN_SYNC_FLAG_NONE() {
        return cfapi_h$constants$99.CF_SET_IN_SYNC_FLAG_NONE();
    }
    public static  MethodHandle CfSetInSyncState$MH() {
        return cfapi_h$constants$99.CfSetInSyncState$MH();
    }
    public static @C("HRESULT") int CfSetInSyncState (@C("HANDLE") Addressable FileHandle, @C("CF_IN_SYNC_STATE") int InSyncState, @C("CF_SET_IN_SYNC_FLAGS") int InSyncFlags, @C("USN*") Addressable InSyncUsn) {
        try {
            return (int)cfapi_h$constants$99.CfSetInSyncState$MH().invokeExact(FileHandle.address(), InSyncState, InSyncFlags, InSyncUsn.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfSetCorrelationVector$MH() {
        return cfapi_h$constants$99.CfSetCorrelationVector$MH();
    }
    public static @C("HRESULT") int CfSetCorrelationVector (@C("HANDLE") Addressable FileHandle, @C("const PCORRELATION_VECTOR") Addressable CorrelationVector) {
        try {
            return (int)cfapi_h$constants$99.CfSetCorrelationVector$MH().invokeExact(FileHandle.address(), CorrelationVector.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfGetCorrelationVector$MH() {
        return cfapi_h$constants$99.CfGetCorrelationVector$MH();
    }
    public static @C("HRESULT") int CfGetCorrelationVector (@C("HANDLE") Addressable FileHandle, @C("PCORRELATION_VECTOR") Addressable CorrelationVector) {
        try {
            return (int)cfapi_h$constants$99.CfGetCorrelationVector$MH().invokeExact(FileHandle.address(), CorrelationVector.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_PLACEHOLDER_STATE_NO_STATES() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_STATE_NO_STATES();
    }
    public static @C("int") int CF_PLACEHOLDER_STATE_PLACEHOLDER() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_STATE_PLACEHOLDER();
    }
    public static @C("int") int CF_PLACEHOLDER_STATE_SYNC_ROOT() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_STATE_SYNC_ROOT();
    }
    public static @C("int") int CF_PLACEHOLDER_STATE_ESSENTIAL_PROP_PRESENT() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_STATE_ESSENTIAL_PROP_PRESENT();
    }
    public static @C("int") int CF_PLACEHOLDER_STATE_IN_SYNC() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_STATE_IN_SYNC();
    }
    public static @C("int") int CF_PLACEHOLDER_STATE_PARTIAL() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_STATE_PARTIAL();
    }
    public static @C("int") int CF_PLACEHOLDER_STATE_PARTIALLY_ON_DISK() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_STATE_PARTIALLY_ON_DISK();
    }
    public static @C("int") int CF_PLACEHOLDER_STATE_INVALID() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_STATE_INVALID();
    }
    public static  MethodHandle CfGetPlaceholderStateFromAttributeTag$MH() {
        return cfapi_h$constants$99.CfGetPlaceholderStateFromAttributeTag$MH();
    }
    public static @C("CF_PLACEHOLDER_STATE") int CfGetPlaceholderStateFromAttributeTag (@C("DWORD") int FileAttributes, @C("DWORD") int ReparseTag) {
        try {
            return (int)cfapi_h$constants$99.CfGetPlaceholderStateFromAttributeTag$MH().invokeExact(FileAttributes, ReparseTag);
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfGetPlaceholderStateFromFileInfo$MH() {
        return cfapi_h$constants$99.CfGetPlaceholderStateFromFileInfo$MH();
    }
    public static @C("CF_PLACEHOLDER_STATE") int CfGetPlaceholderStateFromFileInfo (@C("LPCVOID") Addressable InfoBuffer, @C("FILE_INFO_BY_HANDLE_CLASS") int InfoClass) {
        try {
            return (int)cfapi_h$constants$99.CfGetPlaceholderStateFromFileInfo$MH().invokeExact(InfoBuffer.address(), InfoClass);
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfGetPlaceholderStateFromFindData$MH() {
        return cfapi_h$constants$99.CfGetPlaceholderStateFromFindData$MH();
    }
    public static @C("CF_PLACEHOLDER_STATE") int CfGetPlaceholderStateFromFindData (@C("const WIN32_FIND_DATA*") Addressable FindData) {
        try {
            return (int)cfapi_h$constants$99.CfGetPlaceholderStateFromFindData$MH().invokeExact(FindData.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_PLACEHOLDER_INFO_BASIC() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_INFO_BASIC();
    }
    public static @C("int") int CF_PLACEHOLDER_INFO_STANDARD() {
        return cfapi_h$constants$99.CF_PLACEHOLDER_INFO_STANDARD();
    }
    public static  MethodHandle CfGetPlaceholderInfo$MH() {
        return cfapi_h$constants$100.CfGetPlaceholderInfo$MH();
    }
    public static @C("HRESULT") int CfGetPlaceholderInfo (@C("HANDLE") Addressable FileHandle, @C("CF_PLACEHOLDER_INFO_CLASS") int InfoClass, @C("PVOID") Addressable InfoBuffer, @C("DWORD") int InfoBufferLength, @C("PDWORD") Addressable ReturnedLength) {
        try {
            return (int)cfapi_h$constants$100.CfGetPlaceholderInfo$MH().invokeExact(FileHandle.address(), InfoClass, InfoBuffer.address(), InfoBufferLength, ReturnedLength.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_SYNC_ROOT_INFO_BASIC() {
        return cfapi_h$constants$100.CF_SYNC_ROOT_INFO_BASIC();
    }
    public static @C("int") int CF_SYNC_ROOT_INFO_STANDARD() {
        return cfapi_h$constants$100.CF_SYNC_ROOT_INFO_STANDARD();
    }
    public static @C("int") int CF_SYNC_ROOT_INFO_PROVIDER() {
        return cfapi_h$constants$100.CF_SYNC_ROOT_INFO_PROVIDER();
    }
    public static  MethodHandle CfGetSyncRootInfoByPath$MH() {
        return cfapi_h$constants$100.CfGetSyncRootInfoByPath$MH();
    }
    public static @C("HRESULT") int CfGetSyncRootInfoByPath (@C("LPCWSTR") Addressable FilePath, @C("CF_SYNC_ROOT_INFO_CLASS") int InfoClass, @C("PVOID") Addressable InfoBuffer, @C("DWORD") int InfoBufferLength, @C("DWORD*") Addressable ReturnedLength) {
        try {
            return (int)cfapi_h$constants$100.CfGetSyncRootInfoByPath$MH().invokeExact(FilePath.address(), InfoClass, InfoBuffer.address(), InfoBufferLength, ReturnedLength.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfGetSyncRootInfoByHandle$MH() {
        return cfapi_h$constants$100.CfGetSyncRootInfoByHandle$MH();
    }
    public static @C("HRESULT") int CfGetSyncRootInfoByHandle (@C("HANDLE") Addressable FileHandle, @C("CF_SYNC_ROOT_INFO_CLASS") int InfoClass, @C("PVOID") Addressable InfoBuffer, @C("DWORD") int InfoBufferLength, @C("DWORD*") Addressable ReturnedLength) {
        try {
            return (int)cfapi_h$constants$100.CfGetSyncRootInfoByHandle$MH().invokeExact(FileHandle.address(), InfoClass, InfoBuffer.address(), InfoBufferLength, ReturnedLength.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static @C("int") int CF_PLACEHOLDER_RANGE_INFO_ONDISK() {
        return cfapi_h$constants$100.CF_PLACEHOLDER_RANGE_INFO_ONDISK();
    }
    public static @C("int") int CF_PLACEHOLDER_RANGE_INFO_VALIDATED() {
        return cfapi_h$constants$100.CF_PLACEHOLDER_RANGE_INFO_VALIDATED();
    }
    public static @C("int") int CF_PLACEHOLDER_RANGE_INFO_MODIFIED() {
        return cfapi_h$constants$100.CF_PLACEHOLDER_RANGE_INFO_MODIFIED();
    }
    public static  MethodHandle CfGetPlaceholderRangeInfo$MH() {
        return cfapi_h$constants$100.CfGetPlaceholderRangeInfo$MH();
    }
    public static @C("HRESULT") int CfGetPlaceholderRangeInfo (@C("HANDLE") Addressable FileHandle, @C("CF_PLACEHOLDER_RANGE_INFO_CLASS") int InfoClass, @C("LARGE_INTEGER") MemorySegment StartingOffset, @C("LARGE_INTEGER") MemorySegment Length, @C("PVOID") Addressable InfoBuffer, @C("DWORD") int InfoBufferLength, @C("PDWORD") Addressable ReturnedLength) {
        try {
            return (int)cfapi_h$constants$100.CfGetPlaceholderRangeInfo$MH().invokeExact(FileHandle.address(), InfoClass, StartingOffset, Length, InfoBuffer.address(), InfoBufferLength, ReturnedLength.address());
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfReportProviderProgress$MH() {
        return cfapi_h$constants$100.CfReportProviderProgress$MH();
    }
    public static @C("HRESULT") int CfReportProviderProgress (@C("CF_CONNECTION_KEY") MemorySegment ConnectionKey, @C("CF_TRANSFER_KEY") MemorySegment TransferKey, @C("LARGE_INTEGER") MemorySegment ProviderProgressTotal, @C("LARGE_INTEGER") MemorySegment ProviderProgressCompleted) {
        try {
            return (int)cfapi_h$constants$100.CfReportProviderProgress$MH().invokeExact(ConnectionKey, TransferKey, ProviderProgressTotal, ProviderProgressCompleted);
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
    public static  MethodHandle CfReportProviderProgress2$MH() {
        return cfapi_h$constants$100.CfReportProviderProgress2$MH();
    }
    public static @C("HRESULT") int CfReportProviderProgress2 (@C("CF_CONNECTION_KEY") MemorySegment ConnectionKey, @C("CF_TRANSFER_KEY") MemorySegment TransferKey, @C("CF_REQUEST_KEY") MemorySegment RequestKey, @C("LARGE_INTEGER") MemorySegment ProviderProgressTotal, @C("LARGE_INTEGER") MemorySegment ProviderProgressCompleted, @C("DWORD") int TargetSessionId) {
        try {
            return (int)cfapi_h$constants$100.CfReportProviderProgress2$MH().invokeExact(ConnectionKey, TransferKey, RequestKey, ProviderProgressTotal, ProviderProgressCompleted, TargetSessionId);
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
}
