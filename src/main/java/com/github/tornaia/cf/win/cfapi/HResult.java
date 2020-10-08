package com.github.tornaia.cf.win.cfapi;

import java.util.Arrays;

/**
 * HRESULT is a data type used in Windows operating systems, and the earlier IBM/Microsoft OS/2
 * operating system, to represent error conditions, and warning conditions.
 *
 * @see <a href="https://en.wikipedia.org/wiki/HRESULT">HRESULT</a>
 * @see <a href="https://docs.microsoft.com/en-us/windows/win32/wpd_sdk/error-constants">Error constants</a>
 * @see <a href="https://www.rapidtables.com/convert/number/decimal-to-hex.html">Decimal to hex</a>
 */
public enum HResult {

    OK(0, "OK"),
    ERROR_INVALID_PARAMETER(-2147024809, "One or more arguments are not valid"),
    ERROR_FILE_NOT_FOUND(-2147024894, "The system cannot find the file specified"),
    ERROR_INVALID_NAME(-2147024773, "The filename, directory name, or volume label syntax is incorrect");

    private final int code;
    private final String message;

    HResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HResult parse(int code) {
        return Arrays.stream(HResult.values())
                .filter(e -> e.code == code)
                .findFirst()
                .orElseThrow();
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Error{" +
                "code=" + code +
                ", hex='0x" + Integer.toHexString(code) + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
