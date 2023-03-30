package com.huoxiaolu.manger.mangerbackend.shared.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author xiaolu.huo
 */

@Getter
@AllArgsConstructor
public enum SerialNoType {
    /**
     * 用户编码
     */
    USER,
    /**
     * 存款编码
     */
    CK,
    /**
     * 取款编码
     */
    QK;
}
