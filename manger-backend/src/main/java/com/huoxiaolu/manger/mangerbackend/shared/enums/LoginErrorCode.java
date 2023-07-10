package com.huoxiaolu.manger.mangerbackend.shared.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author xiaolu.huo
 */

@Getter
@AllArgsConstructor
public enum LoginErrorCode {
    /**
     * 存单信息不存在
     */
    TOKEN_ERROR("token 过期或者 token 不存在，请重新登陆");
    private final String message;
}
