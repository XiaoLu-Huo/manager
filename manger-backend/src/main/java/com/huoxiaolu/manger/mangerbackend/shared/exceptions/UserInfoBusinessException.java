package com.huoxiaolu.manger.mangerbackend.shared.exceptions;

import com.huoxiaolu.manger.mangerbackend.shared.enums.UserInfoErrorCode;

/**
 * @author xiaolu.huo
 */
public class UserInfoBusinessException extends BaseException {

    public UserInfoBusinessException(UserInfoErrorCode userInfoErrorCode) {
        super(userInfoErrorCode.name(), userInfoErrorCode.getMessage());
    }
}
