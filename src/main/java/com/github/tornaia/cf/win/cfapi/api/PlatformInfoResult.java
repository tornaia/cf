package com.github.tornaia.cf.win.cfapi.api;

/**
 * https://docs.microsoft.com/en-us/windows/win32/api/cfapi/ns-cfapi-cf_platform_info
 */
public class PlatformInfoResult {

    private final int buildNumber;
    private final int revisionNumber;
    private final int integrationNumber;

    public PlatformInfoResult(int buildNumber, int revisionNumber, int integrationNumber) {
        this.buildNumber = buildNumber;
        this.revisionNumber = revisionNumber;
        this.integrationNumber = integrationNumber;
    }

    /**
     * The build number of the Windows platform version. Changes when the platform is serviced by a Windows update.
     */
    public int getBuildNumber() {
        return buildNumber;
    }

    /**
     * The revision number of the Windows platform version. Changes when the platform is serviced by a Windows update.
     */
    public int getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * The integration number of the Windows platform version. This is indicative of the platform capabilities, both in terms of API contracts and availability of bug fixes.
     */
    public int getIntegrationNumber() {
        return integrationNumber;
    }

    @Override
    public String toString() {
        return "PlatformInfoResult{" +
                "buildNumber=" + buildNumber +
                ", revisionNumber=" + revisionNumber +
                ", integrationNumber=" + integrationNumber +
                '}';
    }
}
