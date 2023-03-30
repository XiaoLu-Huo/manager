package com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command.converter;

import com.huoxiaolu.manger.mangerbackend.domain.aggregate.UserInfo;
import com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist.UserInfoDO;
import org.mapstruct.Mapper;

/**
 * @author xiaolu.huo
 */
@Mapper(componentModel = "spring")
public interface UserInfoDoConverter {
    /**
     * domain与DO转化
     * @param userInfo userInfo
     * @return UserInfoDO
     */
    UserInfoDO domainToDataObject(UserInfo userInfo);

    /**
     * domain与DO转化
     * @param userInfoDO userInfoDO
     * @return UserInfo
     */
    UserInfo dataObjectToDomain(UserInfoDO userInfoDO);
}
