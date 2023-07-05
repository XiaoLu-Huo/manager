package com.huoxiaolu.manger.mangerbackend.application.controller;

import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.interfaces.ReceiptApi;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptUpdateRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptListResponse;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptResponse;
import com.huoxiaolu.manger.mangerbackend.application.service.ReceiptService;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaolu.huo
 */
@RestController
@RequiredArgsConstructor
@RequestMapping
public class ReceiptApiController implements ReceiptApi {

    private final ReceiptService receiptService;

    @Override
    public ReceiptResponse createReceipt(ReceiptCreateRequest request) {
        return receiptService.createReceipt(request);
    }

    @Override
    public PageInfo<ReceiptListResponse> queryReceiptList(ReceiptQueryRequest request) {
        return receiptService.queryReceiptList(request);
    }

    @Override
    public ReceiptResponse updateReceipt(ReceiptUpdateRequest request) {
        return receiptService.updateReceipt(request);
    }

}
