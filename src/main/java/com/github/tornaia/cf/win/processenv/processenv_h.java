package com.github.tornaia.cf.win.processenv;

import jdk.incubator.foreign.Addressable;

public final class processenv_h {

    public static @C("UINT") int GetWindowsDirectoryW(@C("LPWSTR") Addressable lpBuffer, @C("UINT") int uSize) {
        try {
            return (int) processenv_h$constants$0.GetWindowsDirectoryW$MH().invokeExact(lpBuffer.address(), uSize);
        } catch (Throwable ex) {
            throw new AssertionError(ex);
        }
    }
}


