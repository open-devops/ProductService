package com.hpe.devops.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by chexiaok on 2016/8/15.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends ApiException {
    public NotFoundException(String code) {
        super(code);
    }

    public NotFoundException(String code, String msg) {
        super(code, msg);
    }
}
