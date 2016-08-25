package com.hpe.devops.exception;

/**
 * Created by chexiaok on 2016/8/15.
 */
public class ApiException extends Exception {
    private String code;

    public ApiException(String code) {
        super("");

        this.code = code;
    }

    public ApiException(String code, String msg) {
        super(msg);

        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
