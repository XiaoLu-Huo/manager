package com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command;

import com.huoxiaolu.manger.mangerbackend.domain.aggregate.ReceiptInfo;
import com.huoxiaolu.manger.mangerbackend.domain.aggregate.UserInfo;
import com.huoxiaolu.manger.mangerbackend.domain.repository.ReceiptDomainRepository;
import com.huoxiaolu.manger.mangerbackend.domain.repository.UserInfoDomainRepository;
import com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist.ReceiptInfoDO;
import com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist.UserInfoDO;
import com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command.converter.ReceiptInfoDOConverter;
import com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command.converter.UserInfoDoConverter;
import com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command.jdbc.ReceiptInfoRepository;
import com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command.jdbc.UserInfoRepository;
import com.huoxiaolu.manger.mangerbackend.shared.enums.UserInfoErrorCode;
import com.huoxiaolu.manger.mangerbackend.shared.exceptions.UserInfoBusinessException;
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
}
