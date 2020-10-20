package com.github.tornaia.cf.win.cfapi.internal;

import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;

class cfapi_h$constants$12 extends cfapi_h$constants$0 {

    /* package-private */ cfapi_h$constants$12() {}

    static final int CF_PLACEHOLDER_MAX_FILE_IDENTITY_LENGTH() { return (int)4096L; }

    static final int CF_MAX_PRIORITY_HINT() { return (int)15L; }

    static final int CF_MAX_PROVIDER_NAME_LENGTH() { return (int)255L; }

    static final int CF_MAX_PROVIDER_VERSION_LENGTH() { return (int)255L; }

    static final MemoryLayout _FLOAT128$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONGLONG.withName("LowPart"),
            C_LONGLONG.withName("HighPart")
    ).withName("_FLOAT128");
    static final jdk.incubator.foreign.MemoryLayout _FLOAT128$struct$LAYOUT() { return _FLOAT128$struct$LAYOUT_; }

    static final MemoryLayout _FLOAT128$LowPart$LAYOUT_ = C_LONGLONG;
    static final jdk.incubator.foreign.MemoryLayout _FLOAT128$LowPart$LAYOUT() { return _FLOAT128$LowPart$LAYOUT_; }

    static final VarHandle _FLOAT128$LowPart$VH_ = _FLOAT128$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("LowPart"));
    static final java.lang.invoke.VarHandle _FLOAT128$LowPart$VH() { return _FLOAT128$LowPart$VH_; }

    static final MemoryLayout _FLOAT128$HighPart$LAYOUT_ = C_LONGLONG;
    static final jdk.incubator.foreign.MemoryLayout _FLOAT128$HighPart$LAYOUT() { return _FLOAT128$HighPart$LAYOUT_; }

    static final VarHandle _FLOAT128$HighPart$VH_ = _FLOAT128$struct$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("HighPart"));
    static final java.lang.invoke.VarHandle _FLOAT128$HighPart$VH() { return _FLOAT128$HighPart$VH_; }

    static final MemoryLayout _LARGE_INTEGER$union$LAYOUT_ = MemoryLayout.ofUnion(
            C_LONG.withName("LowPart"),
            C_LONG.withName("HighPart"),
            MemoryLayout.ofStruct(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONGLONG.withName("QuadPart")
    ).withName("_LARGE_INTEGER");
    static final jdk.incubator.foreign.MemoryLayout _LARGE_INTEGER$union$LAYOUT() { return _LARGE_INTEGER$union$LAYOUT_; }

    static final MemoryLayout _LARGE_INTEGER$LowPart$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout _LARGE_INTEGER$LowPart$LAYOUT() { return _LARGE_INTEGER$LowPart$LAYOUT_; }

    static final VarHandle _LARGE_INTEGER$LowPart$VH_ = _LARGE_INTEGER$union$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("LowPart"));
    static final java.lang.invoke.VarHandle _LARGE_INTEGER$LowPart$VH() { return _LARGE_INTEGER$LowPart$VH_; }

    static final MemoryLayout _LARGE_INTEGER$HighPart$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout _LARGE_INTEGER$HighPart$LAYOUT() { return _LARGE_INTEGER$HighPart$LAYOUT_; }

    static final VarHandle _LARGE_INTEGER$HighPart$VH_ = _LARGE_INTEGER$union$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("HighPart"));
    static final java.lang.invoke.VarHandle _LARGE_INTEGER$HighPart$VH() { return _LARGE_INTEGER$HighPart$VH_; }

    static final MemoryLayout _LARGE_INTEGER$u$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("LowPart"),
            C_LONG.withName("HighPart")
    );
    static final jdk.incubator.foreign.MemoryLayout _LARGE_INTEGER$u$struct$LAYOUT() { return _LARGE_INTEGER$u$struct$LAYOUT_; }

    static final MemoryLayout _LARGE_INTEGER$u$LowPart$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout _LARGE_INTEGER$u$LowPart$LAYOUT() { return _LARGE_INTEGER$u$LowPart$LAYOUT_; }

    static final VarHandle _LARGE_INTEGER$u$LowPart$VH_ = _LARGE_INTEGER$u$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("LowPart"));
    static final java.lang.invoke.VarHandle _LARGE_INTEGER$u$LowPart$VH() { return _LARGE_INTEGER$u$LowPart$VH_; }

    static final MemoryLayout _LARGE_INTEGER$u$HighPart$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout _LARGE_INTEGER$u$HighPart$LAYOUT() { return _LARGE_INTEGER$u$HighPart$LAYOUT_; }

    static final VarHandle _LARGE_INTEGER$u$HighPart$VH_ = _LARGE_INTEGER$u$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("HighPart"));
    static final java.lang.invoke.VarHandle _LARGE_INTEGER$u$HighPart$VH() { return _LARGE_INTEGER$u$HighPart$VH_; }

    static final MemoryLayout _LARGE_INTEGER$QuadPart$LAYOUT_ = C_LONGLONG;
    static final jdk.incubator.foreign.MemoryLayout _LARGE_INTEGER$QuadPart$LAYOUT() { return _LARGE_INTEGER$QuadPart$LAYOUT_; }

    static final VarHandle _LARGE_INTEGER$QuadPart$VH_ = _LARGE_INTEGER$union$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("QuadPart"));
    static final java.lang.invoke.VarHandle _LARGE_INTEGER$QuadPart$VH() { return _LARGE_INTEGER$QuadPart$VH_; }

    static final MemoryLayout _ULARGE_INTEGER$union$LAYOUT_ = MemoryLayout.ofUnion(
            C_LONG.withName("LowPart"),
            C_LONG.withName("HighPart"),
            MemoryLayout.ofStruct(
                    C_LONG.withName("LowPart"),
                    C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONGLONG.withName("QuadPart")
    ).withName("_ULARGE_INTEGER");
    static final jdk.incubator.foreign.MemoryLayout _ULARGE_INTEGER$union$LAYOUT() { return _ULARGE_INTEGER$union$LAYOUT_; }

    static final MemoryLayout _ULARGE_INTEGER$LowPart$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout _ULARGE_INTEGER$LowPart$LAYOUT() { return _ULARGE_INTEGER$LowPart$LAYOUT_; }

    static final VarHandle _ULARGE_INTEGER$LowPart$VH_ = _ULARGE_INTEGER$union$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("LowPart"));
    static final java.lang.invoke.VarHandle _ULARGE_INTEGER$LowPart$VH() { return _ULARGE_INTEGER$LowPart$VH_; }

    static final MemoryLayout _ULARGE_INTEGER$HighPart$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout _ULARGE_INTEGER$HighPart$LAYOUT() { return _ULARGE_INTEGER$HighPart$LAYOUT_; }

    static final VarHandle _ULARGE_INTEGER$HighPart$VH_ = _ULARGE_INTEGER$union$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("HighPart"));
    static final java.lang.invoke.VarHandle _ULARGE_INTEGER$HighPart$VH() { return _ULARGE_INTEGER$HighPart$VH_; }

    static final MemoryLayout _ULARGE_INTEGER$u$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("LowPart"),
            C_LONG.withName("HighPart")
    );
    static final jdk.incubator.foreign.MemoryLayout _ULARGE_INTEGER$u$struct$LAYOUT() { return _ULARGE_INTEGER$u$struct$LAYOUT_; }

    static final MemoryLayout _ULARGE_INTEGER$u$LowPart$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout _ULARGE_INTEGER$u$LowPart$LAYOUT() { return _ULARGE_INTEGER$u$LowPart$LAYOUT_; }

    static final VarHandle _ULARGE_INTEGER$u$LowPart$VH_ = _ULARGE_INTEGER$u$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("LowPart"));
    static final java.lang.invoke.VarHandle _ULARGE_INTEGER$u$LowPart$VH() { return _ULARGE_INTEGER$u$LowPart$VH_; }

    static final MemoryLayout _ULARGE_INTEGER$u$HighPart$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout _ULARGE_INTEGER$u$HighPart$LAYOUT() { return _ULARGE_INTEGER$u$HighPart$LAYOUT_; }

    static final VarHandle _ULARGE_INTEGER$u$HighPart$VH_ = _ULARGE_INTEGER$u$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("HighPart"));
    static final java.lang.invoke.VarHandle _ULARGE_INTEGER$u$HighPart$VH() { return _ULARGE_INTEGER$u$HighPart$VH_; }

    static final MemoryLayout _ULARGE_INTEGER$QuadPart$LAYOUT_ = C_LONGLONG;
    static final jdk.incubator.foreign.MemoryLayout _ULARGE_INTEGER$QuadPart$LAYOUT() { return _ULARGE_INTEGER$QuadPart$LAYOUT_; }

    static final VarHandle _ULARGE_INTEGER$QuadPart$VH_ = _ULARGE_INTEGER$union$LAYOUT_.varHandle(long.class, MemoryLayout.PathElement.groupElement("QuadPart"));
    static final java.lang.invoke.VarHandle _ULARGE_INTEGER$QuadPart$VH() { return _ULARGE_INTEGER$QuadPart$VH_; }

    static final MemoryLayout _LUID$struct$LAYOUT_ = MemoryLayout.ofStruct(
            C_LONG.withName("LowPart"),
            C_LONG.withName("HighPart")
    ).withName("_LUID");
    static final jdk.incubator.foreign.MemoryLayout _LUID$struct$LAYOUT() { return _LUID$struct$LAYOUT_; }

    static final MemoryLayout _LUID$LowPart$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout _LUID$LowPart$LAYOUT() { return _LUID$LowPart$LAYOUT_; }

    static final VarHandle _LUID$LowPart$VH_ = _LUID$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("LowPart"));
    static final java.lang.invoke.VarHandle _LUID$LowPart$VH() { return _LUID$LowPart$VH_; }

    static final MemoryLayout _LUID$HighPart$LAYOUT_ = C_LONG;
    static final jdk.incubator.foreign.MemoryLayout _LUID$HighPart$LAYOUT() { return _LUID$HighPart$LAYOUT_; }

    static final VarHandle _LUID$HighPart$VH_ = _LUID$struct$LAYOUT_.varHandle(int.class, MemoryLayout.PathElement.groupElement("HighPart"));
    static final java.lang.invoke.VarHandle _LUID$HighPart$VH() { return _LUID$HighPart$VH_; }
}
