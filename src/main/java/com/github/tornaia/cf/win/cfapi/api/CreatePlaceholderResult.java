package com.github.tornaia.cf.win.cfapi.api;

import com.github.tornaia.cf.win.cfapi.HResult;

public class CreatePlaceholderResult {

    private final HResult hResult;

    private CreatePlaceholderResult(HResult hResult) {
        this.hResult = hResult;
    }

    public static CreatePlaceholderResult ok() {
        return new CreatePlaceholderResult(HResult.OK);
    }

    public static CreatePlaceholderResult error(HResult hResult) {
        return new CreatePlaceholderResult(hResult);
    }

    public HResult getHResult() {
        return hResult;
    }

    @Override
    public String toString() {
        return "CreatePlaceholderResult{" +
                "hResult=" + hResult +
                '}';
    }
}
