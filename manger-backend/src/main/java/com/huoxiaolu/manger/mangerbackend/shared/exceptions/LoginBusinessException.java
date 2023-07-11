package com.huoxiaolu.manger.mangerbackend.shared.exceptions;


import com.huoxiaolu.manger.mangerbackend.shared.enums.LoginErrorCode;

/**
 * @author xiaolu.huo
 */
public class LoginBusinessException extends BaseException {

    public LoginBusinessException(LoginErrorCode loginErrorCode) {
        super(loginErrorCode.name(), loginErrorCode.getMessage());
    }
}
