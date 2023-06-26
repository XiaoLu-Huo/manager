package com.huoxiaolu.manger.mangerbackend.application.controller;

import com.huoxiaolu.manger.mangerbackend.api.interfaces.ReceiptApi;
import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptResponse;
import com.huoxiaolu.manger.mangerbackend.application.service.ReceiptService;
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
}
