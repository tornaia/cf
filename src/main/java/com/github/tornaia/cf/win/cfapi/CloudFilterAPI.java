package com.github.tornaia.cf.win.cfapi;

import com.github.tornaia.cf.win.cfapi.api.ConnectSyncRootCommand;
import com.github.tornaia.cf.win.cfapi.api.ConnectSyncRootResult;
import com.github.tornaia.cf.win.cfapi.api.GetPlatformInfoResult;
import com.github.tornaia.cf.win.cfapi.api.RegisterSyncRootCommand;
import com.github.tornaia.cf.win.cfapi.api.RegisterSyncRootResult;
import com.github.tornaia.cf.win.cfapi.api.UnregisterSyncRootCommand;
import com.github.tornaia.cf.win.cfapi.api.UnregisterSyncRootResult;
import com.github.tornaia.cf.win.cfapi.internal.cfapi_h;
import com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_CALLBACK_REGISTRATION;
import com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_CONNECTION_KEY;
import com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_HYDRATION_POLICY;
import com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_PLATFORM_INFO;
import com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_POPULATION_POLICY;
import com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_SYNC_POLICIES;
import com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_SYNC_REGISTRATION;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;

import java.nio.charset.StandardCharsets;

import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_HARDLINK_POLICY_NONE;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_INSYNC_POLICY_NONE;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CfGetPlatformInfo;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_CALLBACK_TYPE_CANCEL_FETCH_DATA;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_CALLBACK_TYPE_FETCH_DATA;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_CALLBACK_TYPE_NONE;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_CONNECT_FLAG_REQUIRE_FULL_FILE_PATH;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_CONNECT_FLAG_REQUIRE_PROCESS_INFO;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_HYDRATION_POLICY_FULL;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_HYDRATION_POLICY_MODIFIER_NONE;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_PLACEHOLDER_MANAGEMENT_POLICY_DEFAULT;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_POPULATION_POLICY_ALWAYS_FULL;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_POPULATION_POLICY_MODIFIER_NONE;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CF_REGISTER_FLAG_MARK_IN_SYNC_ON_ROOT;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CfConnectSyncRoot;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CfRegisterSyncRoot;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h.CfUnregisterSyncRoot;

/**
 * Starting in Windows 10, version 1709, Windows provides the cloud files API.
 * This API consists of several native Win32 and WinRT APIs that formalize
 * support for cloud sync engines, and handles tasks such as creating and
 * managing placeholder files and directories. Users of this API are typically
 * sync providers and to some extent, Windows applications.
 * <p>
 * https://docs.microsoft.com/en-us/windows/win32/api/_cloudapi/
 */
public class CloudFilterAPI {

    static {
        try {
            System.loadLibrary("cldapi");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Returns information for the cloud files platform.
     * This is intended for sync providers running on multiple versions of Windows.
     *
     * @return the platform version information
     */
    public static GetPlatformInfoResult getPlatformInfo() {
        try (MemorySegment addressablePlatformVersion = CF_PLATFORM_INFO.allocatePointer()) {
            int result = CfGetPlatformInfo(addressablePlatformVersion);

            HResult hResult = HResult.parse(result);
            boolean ok = hResult == HResult.OK;
            if (!ok) {
                return GetPlatformInfoResult.error(hResult);
            }

            int buildNumber = CF_PLATFORM_INFO.BuildNumber$get(addressablePlatformVersion);
            int revisionNumber = CF_PLATFORM_INFO.RevisionNumber$get(addressablePlatformVersion);
            // TODO for unknown reason integration number call fails
            // int integrationNumber = cfapi_h.CF_PLATFORM_INFO.IntegrationNumber$get(addressablePlatformVersion);
            return GetPlatformInfoResult.ok(buildNumber, revisionNumber, -1);
        }
    }

    /**
     * Performs a one time sync root registration.
     */
    public static RegisterSyncRootResult registerSyncRoot(RegisterSyncRootCommand registerSyncRootCommand) {
        byte[] syncRootPath = registerSyncRootCommand.getSyncRootPath().toAbsolutePath().toString().getBytes(StandardCharsets.UTF_16LE);
        byte[] providerName = registerSyncRootCommand.getProviderName().getBytes(StandardCharsets.UTF_16LE);
        byte[] providerVersion = registerSyncRootCommand.getProviderVersion().getBytes(StandardCharsets.UTF_16LE);
        try (MemorySegment SyncRootPath = MemorySegment.allocateNative(syncRootPath.length);
             MemorySegment Registration = CF_SYNC_REGISTRATION.allocate();
             MemorySegment ProviderName = MemorySegment.allocateNative(providerName.length);
             MemorySegment ProviderVersion = MemorySegment.allocateNative(providerVersion.length);
             MemorySegment Policies = CF_SYNC_POLICIES.allocate()) {

            // SyncRootPath
            SyncRootPath.asByteBuffer().put(syncRootPath);

            // Registration
            ProviderName.asByteBuffer().put(providerName);
            ProviderVersion.asByteBuffer().put(providerVersion);
            CF_SYNC_REGISTRATION.StructSize$set(Registration, (int) CF_SYNC_REGISTRATION.sizeof());
            CF_SYNC_REGISTRATION.ProviderName$set(Registration, ProviderName.address());
            CF_SYNC_REGISTRATION.ProviderVersion$set(Registration, ProviderVersion.address());
            CF_SYNC_REGISTRATION.SyncRootIdentity$set(Registration, MemoryAddress.NULL);
            CF_SYNC_REGISTRATION.SyncRootIdentityLength$set(Registration, 0);
            CF_SYNC_REGISTRATION.FileIdentity$set(Registration, MemoryAddress.NULL);
            CF_SYNC_REGISTRATION.FileIdentityLength$set(Registration, 0);

            // Policies
            CF_SYNC_POLICIES.StructSize$set(Policies, (int) CF_SYNC_POLICIES.sizeof());
            CF_HYDRATION_POLICY.Primary$set(CF_SYNC_POLICIES.Hydration$slice(Policies), (short) CF_HYDRATION_POLICY_FULL());
            CF_HYDRATION_POLICY.Modifier$set(CF_SYNC_POLICIES.Hydration$slice(Policies), (short) CF_HYDRATION_POLICY_MODIFIER_NONE());
            CF_POPULATION_POLICY.Primary$set(CF_SYNC_POLICIES.Population$slice(Policies), (short) CF_POPULATION_POLICY_ALWAYS_FULL());
            CF_POPULATION_POLICY.Modifier$set(CF_SYNC_POLICIES.Population$slice(Policies), (short) CF_POPULATION_POLICY_MODIFIER_NONE());

            CF_SYNC_POLICIES.InSync$set(Policies, CF_INSYNC_POLICY_NONE());
            CF_SYNC_POLICIES.HardLink$set(Policies, CF_HARDLINK_POLICY_NONE());
            CF_SYNC_POLICIES.PlaceholderManagement$set(Policies, CF_PLACEHOLDER_MANAGEMENT_POLICY_DEFAULT());

            // Flags
            int RegisterFlags = CF_REGISTER_FLAG_MARK_IN_SYNC_ON_ROOT();

            int result = CfRegisterSyncRoot(SyncRootPath, Registration, Policies, RegisterFlags);

            HResult hResult = HResult.parse(result);
            boolean ok = hResult == HResult.OK;
            if (!ok) {
                return RegisterSyncRootResult.error(hResult);
            }

            return RegisterSyncRootResult.ok();
        }
    }

    /**
     * Initiates bi-directional communication between a sync provider and the sync filter API.
     *
     * @see <a href="https://docs.microsoft.com/en-us/windows/win32/api/cfapi/ns-cfapi-cf_callback_registration">CF_CALLBACK_REGISTRATION structure (cfapi.h)</a>
     */
    public static ConnectSyncRootResult connectSyncRoot(ConnectSyncRootCommand connectSyncRootCommand) {
        byte[] syncRootPath = connectSyncRootCommand.getSyncRootPath().toAbsolutePath().toString().getBytes(StandardCharsets.UTF_16LE);
        try (MemorySegment SyncRootPath = MemorySegment.allocateNative(syncRootPath.length);
             MemorySegment CallbackTable = CF_CALLBACK_REGISTRATION.allocateArray(3);
             MemorySegment ConnectionKey = CF_CONNECTION_KEY.allocate()) {

            // SyncRootPath
            SyncRootPath.asByteBuffer().put(syncRootPath);

            // CallbackTable
            CF_CALLBACK_REGISTRATION.Type$set(CallbackTable, 0, CF_CALLBACK_TYPE_FETCH_DATA());
            CF_CALLBACK_REGISTRATION.Callback$set(CallbackTable, 0, MemoryAddress.NULL);
            MemorySegment FetchDataCallback = CF_CALLBACK_REGISTRATION.allocatePointer();

            MemoryAddress callback = null;
            /*
            cfapi_h.callback
            callback = cfapi_h.CF_CALLBACK_REGISTRATION.allocatePointer()allocate((a, b) -> {
                return "";
            }
            })cosine_similarity$dot.allocate((a, b) -> {
                return (CVector.x$get(a.baseAddress()) * CVector.x$get(b.baseAddress())) +
                        (CVector.y$get(a.baseAddress()) * CVector.y$get(b.baseAddress()));
            cfapi_h.CF_CALLBACK_REGISTRATION.ca
            jdk.incubator.foreign. Callback
            */

            CF_CALLBACK_REGISTRATION.Type$set(CallbackTable, 1, CF_CALLBACK_TYPE_CANCEL_FETCH_DATA());
            CF_CALLBACK_REGISTRATION.Callback$set(CallbackTable, 1, MemoryAddress.NULL);

            // Note that the sync provider only needs to register implemented callbacks, and CF_CALLBACK_REGISTRATION should always end with CF_CALLBACK_REGISTRATION_END.
            // #define CF_CALLBACK_REGISTRATION_END {CF_CALLBACK_TYPE_NONE, NULL}
            CF_CALLBACK_REGISTRATION.Type$set(CallbackTable, 2, CF_CALLBACK_TYPE_NONE());
            CF_CALLBACK_REGISTRATION.Callback$set(CallbackTable, 2, MemoryAddress.NULL);

            // CallbackContext
            MemoryAddress CallbackContext = MemoryAddress.NULL;

            // Flags
            int ConnectFlags = CF_CONNECT_FLAG_REQUIRE_PROCESS_INFO() | CF_CONNECT_FLAG_REQUIRE_FULL_FILE_PATH();

            // ConnectionKey

            int result = CfConnectSyncRoot(SyncRootPath, CallbackTable, CallbackContext, ConnectFlags, ConnectionKey);

            HResult hResult = HResult.parse(result);
            boolean ok = hResult == HResult.OK;
            if (!ok) {
                return ConnectSyncRootResult.error(hResult);
            }

            return ConnectSyncRootResult.ok();
        }
    }

    /**
     * Unregisters a previously registered sync root.
     */
    public static UnregisterSyncRootResult unregisterSyncRoot(UnregisterSyncRootCommand unregisterSyncRootCommand) {
        byte[] syncRootPath = unregisterSyncRootCommand.getSyncRootPath().toAbsolutePath().toString().getBytes(StandardCharsets.UTF_16LE);
        try (MemorySegment SyncRootPath = MemorySegment.allocateNative(syncRootPath.length)) {

            // SyncRootPath
            SyncRootPath.asByteBuffer().put(syncRootPath);

            int result = CfUnregisterSyncRoot(SyncRootPath);

            HResult hResult = HResult.parse(result);
            boolean ok = hResult == HResult.OK;
            if (!ok) {
                return UnregisterSyncRootResult.error(hResult);
            }

            return UnregisterSyncRootResult.ok();
        }
    }
}
