package com.github.tornaia.cf.win.cfapi;

import com.github.tornaia.cf.win.cfapi.api.PlatformInfoResult;
import com.github.tornaia.cf.win.cfapi.internal.cfapi_h;
import jdk.incubator.foreign.MemorySegment;

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
    public static PlatformInfoResult getPlatformInfo() {
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
            return new PlatformInfoResult(buildNumber, revisionNumber, -1);
        }
    }
}
