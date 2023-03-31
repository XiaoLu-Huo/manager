package com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command;

import com.huoxiaolu.manger.mangerbackend.domain.aggregate.UserInfo;
import com.huoxiaolu.manger.mangerbackend.domain.repository.UserInfoDomainRepository;
import com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist.UserInfoDO;
import com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command.converter.UserInfoDoConverter;
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
public class UserInfoDomainRepositoryImpl implements UserInfoDomainRepository {

    private final UserInfoDoConverter userInfoDOConverter;
    private final UserInfoRepository userInfoRepository;

    @Override
    public UserInfo save(UserInfo userInfo) {
        UserInfoDO userInfoDO = userInfoDOConverter.domainToDataObject(userInfo);
        UserInfoDO infoDO = userInfoRepository.save(userInfoDO);
        return userInfoDOConverter.dataObjectToDomain(infoDO);
    }

    @Override
    public UserInfo findUserInfoById(Long id) {
        UserInfoDO userInfoDO = userInfoRepository.findById(id)
                .orElseThrow(() -> new UserInfoBusinessException(UserInfoErrorCode.ERR_USER_INFO_NOT_EXIT));
        return userInfoDOConverter.dataObjectToDomain(userInfoDO);
    }
}
