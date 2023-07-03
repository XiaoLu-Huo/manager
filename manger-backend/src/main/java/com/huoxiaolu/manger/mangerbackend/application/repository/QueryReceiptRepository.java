package com.huoxiaolu.manger.mangerbackend.application.repository;

import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.UserQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptListResponse;
import com.huoxiaolu.manger.mangerbackend.api.response.UserListResponse;

/**
 * @author xiaolu.huo
 */
public interface QueryReceiptRepository {
    /**
     * 查询单据基本信息
     * @param request 查询参数
     * @return 返回结果集合
     */
    PageInfo<ReceiptListResponse> queryReceiptList(ReceiptQueryRequest request);

}
