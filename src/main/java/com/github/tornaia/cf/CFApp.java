package com.github.tornaia.cf;

import com.github.tornaia.cf.win.cfapi.CloudFilterAPI;
import com.github.tornaia.cf.win.cfapi.HResult;
import com.github.tornaia.cf.win.cfapi.api.ConnectSyncRootCommand;
import com.github.tornaia.cf.win.cfapi.api.ConnectSyncRootResult;
import com.github.tornaia.cf.win.cfapi.api.CreatePlaceholderCommand;
import com.github.tornaia.cf.win.cfapi.api.CreatePlaceholderResult;
import com.github.tornaia.cf.win.cfapi.api.GetPlatformInfoResult;
import com.github.tornaia.cf.win.cfapi.api.RegisterSyncRootCommand;
import com.github.tornaia.cf.win.cfapi.api.RegisterSyncRootResult;
import com.github.tornaia.cf.win.cfapi.api.UnregisterSyncRootCommand;
import com.github.tornaia.cf.win.cfapi.api.UnregisterSyncRootResult;
import org.apache.commons.io.FileUtils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static com.github.tornaia.cf.win.cfapi.api.ConnectSyncRootCommand.FetchDataCallback;

public class CFApp {

    public static void main(String[] args) throws Exception {
        GetPlatformInfoResult getPlatformInfoResult = CloudFilterAPI.getPlatformInfo();
        if (getPlatformInfoResult.getHResult() != HResult.OK) {
            System.out.println(getPlatformInfoResult);
            return;
        }

        Path syncRootPath = Paths.get("C:\\temp\\mysyncroot");
        String providerName = "NiceProviderName";
        String providerVersion = "1.0";
        String filename = "cloud-file.txt";
        long fileSize = 27L;
        long creationTime = parseDateTime("2020-01-01 08:00:00");
        long modifiedTime = parseDateTime("2020-02-14 16:30:01");
        long lastAccessedTime = parseDateTime("2020-10-21 20:46:15");

        FileUtils.deleteDirectory(syncRootPath.toFile());
        Files.createDirectories(syncRootPath);

        RegisterSyncRootResult registerSyncRootResult = CloudFilterAPI.registerSyncRoot(new RegisterSyncRootCommand(syncRootPath, providerName, providerVersion));
        if (registerSyncRootResult.getHResult() != HResult.OK) {
            System.out.println(registerSyncRootResult);
            return;
        }

        FetchDataCallback fetchDataCallback = (callbackInfo, fetchDataCallbackParameters) -> {
            String fileAbsolutePath = callbackInfo.getVolumeDosName() + callbackInfo.getNormalizedPath();
            long offset = fetchDataCallbackParameters.getRequiredFileOffset();
            long length = fetchDataCallbackParameters.getRequiredLength();
            String processImagePath = callbackInfo.getProcessInfo().getImagePath();
            System.out.println(fileAbsolutePath + ", offset: " + offset + ", length: " + length + " (" + processImagePath + ")");
        };

        ConnectSyncRootResult connectSyncRootResult = CloudFilterAPI.connectSyncRoot(new ConnectSyncRootCommand(syncRootPath, fetchDataCallback));
        if (connectSyncRootResult.getHResult() != HResult.OK) {
            System.out.println(connectSyncRootResult);
            return;
        }

        CreatePlaceholderResult createPlaceholderResult = CloudFilterAPI.createPlaceholder(new CreatePlaceholderCommand(syncRootPath, filename, fileSize, creationTime, modifiedTime, lastAccessedTime));
        if (createPlaceholderResult.getHResult() != HResult.OK) {
            System.out.println(createPlaceholderResult);
            return;
        }

        int timeout = 20;
        for (int i = 0; i < timeout; i++) {
            if (i % 5 == 0) {
                System.out.println("Unregister within " + (timeout - i) + " second(s)...");
            }
            Thread.sleep(1000L);
        }

        UnregisterSyncRootResult unregisterSyncRootResult = CloudFilterAPI.unregisterSyncRoot(new UnregisterSyncRootCommand(syncRootPath));
        if (unregisterSyncRootResult.getHResult() != HResult.OK) {
            System.out.println(unregisterSyncRootResult);
            return;
        }
    }

    private static long parseDateTime(String dateTime) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateTime).getTime();
        } catch (ParseException e) {
            throw new IllegalStateException("Must not happen, dateTime: " + dateTime, e);
        }
    }
}