package com.huoxiaolu.manger.mangerbackend.application.service;

import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptResponse;

/**
 * @author xiaolu.huo
 */
public interface ReceiptService {

    /**
     * 创建存款单据
     * @param request 存款单创建信息
     * @return 存单
     */
    ReceiptResponse createReceipt(ReceiptCreateRequest request);
}
