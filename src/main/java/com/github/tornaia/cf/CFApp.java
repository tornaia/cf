package com.github.tornaia.cf;

import com.github.tornaia.cf.win.cfapi.cfapi_h;
import com.github.tornaia.cf.win.processenv.processenv_h;

import java.lang.invoke.MethodHandle;

public class CFApp {

    public static void main(String[] args) throws Throwable {
        MethodHandle methodHandle1 = processenv_h.GetCurrentDirectoryW$MH();
        Object[] objects = (Object[]) methodHandle1.invoke();
        MethodHandle methodHandle = cfapi_h.GetSystemWindowsDirectoryW$MH();
        Object invoke = methodHandle.invoke();

        int majorVersion = cfapi_h.VER_MAJORVERSION();
        int minorVersion = cfapi_h.VER_MINORVERSION();

        System.out.println("majorVersion: " + majorVersion);
        System.out.println("minorVersion: " + minorVersion);

        int i1 = cfapi_h.VER_BUILDNUMBER();
    }
}
