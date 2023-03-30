package com.huoxiaolu.manger.mangerbackend.application.service.impl;

import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.request.UserCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.UserQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.UserListResponse;
import com.huoxiaolu.manger.mangerbackend.application.converter.UserInfoConverter;
import com.huoxiaolu.manger.mangerbackend.application.repository.QueryUserRepository;
import com.huoxiaolu.manger.mangerbackend.application.service.SerialNoService;
import com.huoxiaolu.manger.mangerbackend.application.service.UserService;
import com.huoxiaolu.manger.mangerbackend.domain.aggregate.UserInfo;
import com.huoxiaolu.manger.mangerbackend.domain.repository.UserInfoDomainRepository;
import com.huoxiaolu.manger.mangerbackend.shared.enums.SerialNoType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xiaolu.huo
 */
@Service
public class UserServiceImpl implements UserService {

    private final QueryUserRepository queryUserRepository;
    private final SerialNoService serialNoService;
    private final UserInfoConverter userInfoConverter;
    private final UserInfoDomainRepository userInfoDomainRepository;

    public UserServiceImpl(QueryUserRepository queryUserRepository, SerialNoService serialNoService, UserInfoConverter userInfoConverter, UserInfoDomainRepository userInfoDomainRepository) {
        this.queryUserRepository = queryUserRepository;
        this.serialNoService = serialNoService;
        this.userInfoConverter = userInfoConverter;
        this.userInfoDomainRepository = userInfoDomainRepository;
    }

    @Override
    public PageInfo<UserListResponse> queryUserList(UserQueryRequest request) {
        return queryUserRepository.queryUserList(request);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public String createUser(UserCreateRequest request) {
        String code = serialNoService.generate(SerialNoType.USER);
        UserInfo userInfo = userInfoConverter.requestToUserInfo(request, code);
        userInfo.initInfo();
        return userInfoDomainRepository.save(userInfo).getCode();
    }
}
