package com.huoxiaolu.manger.mangerbackend.shared.exceptions;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaolu.huo
 */
@Getter
@Setter
public class BaseException extends RuntimeException{
    private String errorCode;

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public BaseException(String message, Throwable cause, String errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }
}
