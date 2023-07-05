package com.huoxiaolu.manger.mangerbackend.shared.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author xiaolu.huo
 */

@Getter
@AllArgsConstructor
public enum ReceiptInfoErrorCode {
    /**
     * 存单信息不存在
     */
    ERR_RECEIPT_INFO_NOT_EXIT("receipt info is not exit");
    private final String message;
}
