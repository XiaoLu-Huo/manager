package com.huoxiaolu.manger.mangerbackend.shared.enums.receipt;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author xiaolu.huo
 */
@Getter
@AllArgsConstructor
public enum ReceiptErrorCode {
    /**
     * 单据号不存在
     */
    RECEIPT_NO_NOT_EXIT("the receipt no is not exist");
    private final String desc;
}
