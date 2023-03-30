package com.huoxiaolu.manger.mangerbackend.domain.repository;

import com.huoxiaolu.manger.mangerbackend.domain.aggregate.UserInfo;

/**
 * @author xiaolu.huo
 */
public interface UserInfoDomainRepository {
    /**
     * 保存用户信息
     * @param userInfo userInfo
     * @return userInfo
     */
    UserInfo save(UserInfo userInfo);
}
