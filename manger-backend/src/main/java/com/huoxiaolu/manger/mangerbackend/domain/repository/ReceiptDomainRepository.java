package com.huoxiaolu.manger.mangerbackend.domain.repository;

import com.huoxiaolu.manger.mangerbackend.domain.aggregate.ReceiptInfo;

/**
 * @author xiaolu.huo
 */
public interface ReceiptDomainRepository {
    /**
     * 保存存单信息
     * @param receiptInfo receiptInfo
     * @return userInfo
     */
    ReceiptInfo save(ReceiptInfo receiptInfo);

}
