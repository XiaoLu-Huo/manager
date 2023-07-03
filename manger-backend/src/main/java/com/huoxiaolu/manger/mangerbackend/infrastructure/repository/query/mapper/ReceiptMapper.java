package com.huoxiaolu.manger.mangerbackend.infrastructure.repository.query.mapper;

import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.UserQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptListResponse;
import com.huoxiaolu.manger.mangerbackend.api.response.UserListResponse;
import java.util.List;

/**
 * @author xiaolu.huo
 */
public interface ReceiptMapper {
    /**
     * 分页查询用户列表
     * @param request 查询参数
     * @return 查询结果
     */
    List<ReceiptListResponse> pageReceiptInfoList(ReceiptQueryRequest request);

}
