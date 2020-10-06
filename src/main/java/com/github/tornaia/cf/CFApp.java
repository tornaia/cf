package com.github.tornaia.cf;

import com.github.tornaia.cf.win.processenv.C;
import com.github.tornaia.cf.win.processenv.processenv_h;
import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemorySegment;

public class CFApp {

    public static void main(String[] args) {
        try (MemorySegment memorySegment = MemorySegment.allocateNative(256)) {
            @C("LPWSTR") Addressable a = memorySegment.address();
            int retval = processenv_h.GetWindowsDirectoryW(a, 260);
            String getWindowsDirectoryW = new String(memorySegment.toByteArray());
            System.out.println("GetWindowsDirectoryW: " + getWindowsDirectoryW);
        }
    }
}