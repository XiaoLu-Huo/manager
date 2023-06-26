package com.huoxiaolu.manger.mangerbackend.application.service.impl;

import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.ReceiptResponse;
import com.huoxiaolu.manger.mangerbackend.application.converter.ReceiptInfoConverter;
import com.huoxiaolu.manger.mangerbackend.application.service.ReceiptService;
import com.huoxiaolu.manger.mangerbackend.application.service.SerialNoService;
import com.huoxiaolu.manger.mangerbackend.domain.aggregate.ReceiptInfo;
import com.huoxiaolu.manger.mangerbackend.domain.repository.ReceiptDomainRepository;
import com.huoxiaolu.manger.mangerbackend.shared.enums.SerialNoType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author xiaolu.huo
 */
@Service
@AllArgsConstructor
public class ReceiptServiceImpl implements ReceiptService {

    private final SerialNoService serialNoService;
    private final ReceiptInfoConverter receiptInfoConverter;
    private final ReceiptDomainRepository receiptDomainRepository;

    @Override
    public ReceiptResponse createReceipt(ReceiptCreateRequest request) {
        String code = serialNoService.generate(SerialNoType.CK);
        ReceiptInfo receiptInfo = receiptInfoConverter.requestToReceiptInfo(request, code);
        receiptInfo.initInfo();
        ReceiptInfo savedReceiptInfo = receiptDomainRepository.save(receiptInfo);
        return ReceiptResponse.builder()
            .code(savedReceiptInfo.getCode())
            .build();
    }
}
