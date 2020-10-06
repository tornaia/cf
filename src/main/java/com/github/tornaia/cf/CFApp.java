package com.github.tornaia.cf;

import com.github.tornaia.cf.win.cfapi.CloudFilterAPI;
import com.github.tornaia.cf.win.cfapi.api.PlatformInfoResult;

public class CFApp {

    public static void main(String[] args) {
        PlatformInfoResult platformInfo = CloudFilterAPI.getPlatformInfo();
        System.out.println("PlatformInfo: " + platformInfo);
    }
}