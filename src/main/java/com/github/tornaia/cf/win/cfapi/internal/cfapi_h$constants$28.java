package com.github.tornaia.cf.win.cfapi.internal;

import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;

class cfapi_h$constants$28 extends cfapi_h$constants$12 {

    /* package-private */ cfapi_h$constants$28() {}

    static final MemoryLayout _FILE_BASIC_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("CreationTime"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("LastAccessTime"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("LastWriteTime"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("ChangeTime"),
            C_LONG.withName("FileAttributes"),
            MemoryLayout.ofPaddingBits(32)
    ).withName("_FILE_BASIC_INFO");
    static final jdk.incubator.foreign.MemoryLayout _FILE_BASIC_INFO$struct$LAYOUT() { return _FILE_BASIC_INFO$struct$LAYOUT_; }

    static final MemoryLayout _FILE_BASIC_INFO$FileAttributes$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout _FILE_BASIC_INFO$FileAttributes$LAYOUT() { return _FILE_BASIC_INFO$FileAttributes$LAYOUT_; }

    static final VarHandle _FILE_BASIC_INFO$FileAttributes$VH_ = _FILE_BASIC_INFO$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("FileAttributes"));
    static final java.lang.invoke.VarHandle _FILE_BASIC_INFO$FileAttributes$VH() { return _FILE_BASIC_INFO$FileAttributes$VH_; }

    static final MemoryLayout _FILE_STANDARD_INFO$struct$LAYOUT_ = MemoryLayout.ofStruct(
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("AllocationSize"),
            MemoryLayout.ofUnion(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart"),
                    MemoryLayout.ofStruct(
                            C_LONG.withName("LowPart"),
                            C_LONG.withName("HighPart")
                    ).withName("u"),
                    C_LONGLONG.withName("QuadPart")
            ).withName("EndOfFile"),
            C_LONG.withName("NumberOfLinks"),
            C_CHAR.withName("DeletePending"),
            C_CHAR.withName("Directory"),
            MemoryLayout.ofPaddingBits(16)
    ).withName("_FILE_STANDARD_INFO");
    static final jdk.incubator.foreign.MemoryLayout _FILE_STANDARD_INFO$struct$LAYOUT() { return _FILE_STANDARD_INFO$struct$LAYOUT_; }
}
