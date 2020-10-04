package com.github.tornaia.cf;

import com.github.tornaia.cf.win.sysinfoapi.sysinfoapi_h;

public class CFApp {

    public static void main(String[] args) {
        int i = sysinfoapi_h.GetVersion();
        System.out.println("version: " + i);
    }
}
