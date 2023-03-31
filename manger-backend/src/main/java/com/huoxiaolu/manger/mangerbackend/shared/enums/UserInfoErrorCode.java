package com.huoxiaolu.manger.mangerbackend.shared.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author xiaolu.huo
 */

@Getter
@AllArgsConstructor
public enum UserInfoErrorCode {
    /**
     * 用户信息不存在
     */
    ERR_USER_INFO_NOT_EXIT("user info is not exit");
    private final String message;
}
