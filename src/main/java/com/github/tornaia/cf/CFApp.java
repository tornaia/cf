package com.github.tornaia.cf;

import com.github.tornaia.cf.win.cfapi.CloudFilterAPI;
import com.github.tornaia.cf.win.cfapi.api.GetPlatformInfoResult;
import com.github.tornaia.cf.win.cfapi.api.RegisterSyncRootCommand;
import com.github.tornaia.cf.win.cfapi.api.RegisterSyncRootResult;
import com.github.tornaia.cf.win.cfapi.api.UnregisterSyncRootCommand;
import com.github.tornaia.cf.win.cfapi.api.UnregisterSyncRootResult;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CFApp {

    public static void main(String[] args) throws Exception {
        GetPlatformInfoResult getPlatformInfoResult = CloudFilterAPI.getPlatformInfo();
        System.out.println(getPlatformInfoResult);

        Path syncRootPath = Paths.get("C:\\temp\\mysyncroot");
        String providerName = "NiceProviderName";
        String providerVersion = "1.0";

        Files.deleteIfExists(syncRootPath);
        Files.createDirectories(syncRootPath);

        RegisterSyncRootResult registerSyncRootResult = CloudFilterAPI.registerSyncRoot(new RegisterSyncRootCommand(syncRootPath, providerName, providerVersion));
        System.out.println(registerSyncRootResult);
        UnregisterSyncRootResult unregisterSyncRootResult = CloudFilterAPI.unregisterSyncRoot(new UnregisterSyncRootCommand(syncRootPath));
        System.out.println(unregisterSyncRootResult);
    }
}