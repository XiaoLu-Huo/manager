package com.huoxiaolu.manger.mangerbackend.shared.exceptions;

/**
 * @author xiaolu.huo
 */
public class ExceptionResponse {

    private String errorCode;
    private String message;

    public ExceptionResponse() {
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ExceptionResponse(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }
}
