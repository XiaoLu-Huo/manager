package com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command.converter;

import com.huoxiaolu.manger.mangerbackend.domain.aggregate.ReceiptInfo;
import com.huoxiaolu.manger.mangerbackend.domain.aggregate.UserInfo;
import com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist.ReceiptInfoDO;
import com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist.UserInfoDO;
import org.mapstruct.Mapper;

/**
 * @author xiaolu.huo
 */
@Mapper(componentModel = "spring")
public interface ReceiptInfoDOConverter {
    /**
     * domain与DO转化
     * @param receiptInfo receiptInfo
     * @return ReceiptInfoDO
     */
    ReceiptInfoDO domainToDataObject(ReceiptInfo receiptInfo);

    /**
     * domain与DO转化
     * @param receiptInfoDO receiptInfoDO
     * @return ReceiptInfo
     */
    ReceiptInfo dataObjectToDomain(ReceiptInfoDO receiptInfoDO);
}
