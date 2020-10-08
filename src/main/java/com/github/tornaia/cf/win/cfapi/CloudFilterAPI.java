package com.github.tornaia.cf.win.cfapi;

import com.github.tornaia.cf.win.cfapi.api.GetPlatformInfoResult;
import com.github.tornaia.cf.win.cfapi.api.RegisterSyncRootCommand;
import com.github.tornaia.cf.win.cfapi.api.RegisterSyncRootResult;
import com.github.tornaia.cf.win.cfapi.internal.cfapi_h;
import com.github.tornaia.cf.win.cfapi.internal.cfapi_h$28;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;

import java.nio.charset.StandardCharsets;

import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h$28.CF_HYDRATION_POLICY_FULL;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h$28.CF_HYDRATION_POLICY_MODIFIER_NONE;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h$28.CF_PLACEHOLDER_MANAGEMENT_POLICY_DEFAULT;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h$28.CF_POPULATION_POLICY_ALWAYS_FULL;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h$28.CF_POPULATION_POLICY_MODIFIER_NONE;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h$28.CF_REGISTER_FLAG_MARK_IN_SYNC_ON_ROOT;
import static com.github.tornaia.cf.win.cfapi.internal.cfapi_h$28.CfRegisterSyncRoot;

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

    private static final int S_OK = 0;

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
        try (MemorySegment addressablePlatformVersion = cfapi_h.CF_PLATFORM_INFO.allocatePointer()) {
            int result = cfapi_h.CfGetPlatformInfo(addressablePlatformVersion);
            boolean ok = result == S_OK;
            if (!ok) {
                throw new IllegalStateException("Failed to get PlatformInfo, unexpected result: " + result);
            }

            int buildNumber = cfapi_h.CF_PLATFORM_INFO.BuildNumber$get(addressablePlatformVersion);
            int revisionNumber = cfapi_h.CF_PLATFORM_INFO.RevisionNumber$get(addressablePlatformVersion);
            // for unknown reason this is not supported
            // int integrationNumber = cfapi_h.CF_PLATFORM_INFO.IntegrationNumber$get(addressablePlatformVersion);
            // System.out.println("integrationNumber: " + integrationNumber);
            return new GetPlatformInfoResult(buildNumber, revisionNumber, -1);
        }
    }

    public static RegisterSyncRootResult registerSyncRoot(RegisterSyncRootCommand registerSyncRootCommand) {
        byte[] syncRootPath = registerSyncRootCommand.getSyncRootPath().toAbsolutePath().toString().getBytes(StandardCharsets.UTF_16LE);
        byte[] providerName = registerSyncRootCommand.getProviderName().getBytes(StandardCharsets.UTF_16LE);
        byte[] providerVersion = registerSyncRootCommand.getProviderVersion().getBytes(StandardCharsets.UTF_16LE);
        try (MemorySegment SyncRootPath = MemorySegment.allocateNative(syncRootPath.length);
             MemorySegment Registration = cfapi_h.CF_SYNC_REGISTRATION.allocate();
             MemorySegment ProviderName = MemorySegment.allocateNative(providerName.length);
             MemorySegment ProviderVersion = MemorySegment.allocateNative(providerVersion.length);
             MemorySegment Policies = cfapi_h.CF_SYNC_POLICIES.allocate()) {

            // SyncRootPath
            SyncRootPath.asByteBuffer().put(syncRootPath);

            // Registration
            ProviderName.asByteBuffer().put(providerName);
            ProviderVersion.asByteBuffer().put(providerVersion);
            cfapi_h.CF_SYNC_REGISTRATION.StructSize$set(Registration, (int) cfapi_h.CF_SYNC_REGISTRATION.sizeof());
            cfapi_h.CF_SYNC_REGISTRATION.ProviderName$set(Registration, ProviderName.address());
            cfapi_h.CF_SYNC_REGISTRATION.ProviderVersion$set(Registration, ProviderVersion.address());
            cfapi_h.CF_SYNC_REGISTRATION.SyncRootIdentity$set(Registration, MemoryAddress.NULL);
            cfapi_h.CF_SYNC_REGISTRATION.SyncRootIdentityLength$set(Registration, 0);
            cfapi_h.CF_SYNC_REGISTRATION.FileIdentity$set(Registration, MemoryAddress.NULL);
            cfapi_h.CF_SYNC_REGISTRATION.FileIdentityLength$set(Registration, 0);

            // Policies
            cfapi_h.CF_SYNC_POLICIES.StructSize$set(Policies, (int) cfapi_h.CF_SYNC_POLICIES.sizeof());
            cfapi_h.CF_HYDRATION_POLICY.Primary$set(cfapi_h.CF_SYNC_POLICIES.Hydration$slice(Policies), (short) CF_HYDRATION_POLICY_FULL());
            cfapi_h.CF_HYDRATION_POLICY.Modifier$set(cfapi_h.CF_SYNC_POLICIES.Hydration$slice(Policies), (short) CF_HYDRATION_POLICY_MODIFIER_NONE());
            cfapi_h.CF_POPULATION_POLICY.Primary$set(cfapi_h.CF_SYNC_POLICIES.Population$slice(Policies), (short) CF_POPULATION_POLICY_ALWAYS_FULL());
            cfapi_h.CF_POPULATION_POLICY.Modifier$set(cfapi_h.CF_SYNC_POLICIES.Population$slice(Policies), (short) CF_POPULATION_POLICY_MODIFIER_NONE());

            cfapi_h.CF_SYNC_POLICIES.InSync$set(Policies, cfapi_h$28.CF_INSYNC_POLICY_NONE());
            cfapi_h.CF_SYNC_POLICIES.HardLink$set(Policies, cfapi_h$28.CF_HARDLINK_POLICY_NONE());
            cfapi_h.CF_SYNC_POLICIES.PlaceholderManagement$set(Policies, CF_PLACEHOLDER_MANAGEMENT_POLICY_DEFAULT());

            // Flags
            int RegisterFlags = CF_REGISTER_FLAG_MARK_IN_SYNC_ON_ROOT();

            int result = CfRegisterSyncRoot(SyncRootPath, Registration, Policies, RegisterFlags);
            // https://docs.microsoft.com/en-us/windows/win32/wpd_sdk/error-constants
            // https://www.rapidtables.com/convert/number/decimal-to-hex.html
            // decimal: -2147024809, ERROR_INVALID_PARAMETER, Hex signed 2's complement: 0x80070057, One or more arguments are not valid
            // decimal: -2147024894, ERROR_FILE_NOT_FOUND, Hex signed 2's complement: 0x80070002, The system cannot find the file specified
            // decimal: -2147024773, ERROR_INVALID_NAME, Hex signed 2's complement: 0x8007007B, The filename, directory name, or volume label syntax is incorrect.
            System.out.println("result: " + result);
        }

        return null;
    }
}
