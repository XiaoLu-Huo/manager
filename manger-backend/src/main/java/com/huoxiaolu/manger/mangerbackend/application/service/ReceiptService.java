package com.huoxiaolu.manger.mangerbackend.application.service;

import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptListResponse;
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

  /**
   * 分页查询存款单据列表
   * @param request 查询参数
   * @return 列表返回结果
   */
  PageInfo<ReceiptListResponse> queryReceiptList(ReceiptQueryRequest request);
}
