package com.huoxiaolu.manger.mangerbackend.infrastructure.repository.query;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.UserQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptListResponse;
import com.huoxiaolu.manger.mangerbackend.api.response.UserListResponse;
import com.huoxiaolu.manger.mangerbackend.application.repository.QueryReceiptRepository;
import com.huoxiaolu.manger.mangerbackend.application.repository.QueryUserRepository;
import com.huoxiaolu.manger.mangerbackend.infrastructure.repository.query.mapper.ReceiptMapper;
import com.huoxiaolu.manger.mangerbackend.infrastructure.repository.query.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.github.pagehelper.page.PageMethod.startPage;
import static com.huoxiaolu.manger.mangerbackend.common.PageUtils.warpPage;

/**
 * @author xiaolu.huo
 */
@Repository
@AllArgsConstructor
public class QueryReceiptRepositoryImpl implements QueryReceiptRepository {

    private final ReceiptMapper receiptMapper;

    @Override
    public PageInfo<ReceiptListResponse> queryReceiptList(ReceiptQueryRequest request) {
        Page<ReceiptListResponse> page = startPage(request.getPageNumber(), request.getPageSize())
            .doSelectPage(() -> receiptMapper.pageReceiptInfoList(request));
        return warpPage(page);
    }
}
