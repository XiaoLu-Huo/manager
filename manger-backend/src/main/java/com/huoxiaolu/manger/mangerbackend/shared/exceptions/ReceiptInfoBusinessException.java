package com.huoxiaolu.manger.mangerbackend.shared.exceptions;

import com.huoxiaolu.manger.mangerbackend.shared.enums.ReceiptInfoErrorCode;

/**
 * @author xiaolu.huo
 */
public class ReceiptInfoBusinessException extends BaseException {

    public ReceiptInfoBusinessException(ReceiptInfoErrorCode receiptInfoErrorCode) {
        super(receiptInfoErrorCode.name(), receiptInfoErrorCode.getMessage());
    }
}
