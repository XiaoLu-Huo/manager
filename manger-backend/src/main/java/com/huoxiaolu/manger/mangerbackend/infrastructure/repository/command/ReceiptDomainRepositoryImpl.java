package com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command;

import com.huoxiaolu.manger.mangerbackend.domain.aggregate.ReceiptInfo;
import com.huoxiaolu.manger.mangerbackend.domain.repository.ReceiptDomainRepository;
import com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist.ReceiptInfoDO;
import com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command.converter.ReceiptInfoDOConverter;
import com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command.jdbc.ReceiptInfoRepository;
import com.huoxiaolu.manger.mangerbackend.shared.enums.ReceiptInfoErrorCode;
import com.huoxiaolu.manger.mangerbackend.shared.exceptions.ReceiptInfoBusinessException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @author xiaolu.huo
 */
@Repository
@AllArgsConstructor
public class ReceiptDomainRepositoryImpl implements ReceiptDomainRepository {

    private final ReceiptInfoDOConverter receiptInfoDOConverter;
    private final ReceiptInfoRepository receiptInfoRepository;

    @Override
    public ReceiptInfo save(ReceiptInfo receiptInfo) {
        ReceiptInfoDO receiptInfoDO =receiptInfoDOConverter.domainToDataObject(receiptInfo);
        ReceiptInfoDO infoDO = receiptInfoRepository.save(receiptInfoDO);
        return receiptInfoDOConverter.dataObjectToDomain(infoDO);
    }

    @Override
    public ReceiptInfo findReceiptInfoById(Long id) {
        ReceiptInfoDO receiptInfoDO = receiptInfoRepository.findById(id)
            .orElseThrow(() -> new ReceiptInfoBusinessException(ReceiptInfoErrorCode.ERR_RECEIPT_INFO_NOT_EXIT));
        return receiptInfoDOConverter.dataObjectToDomain(receiptInfoDO);
    }
}
