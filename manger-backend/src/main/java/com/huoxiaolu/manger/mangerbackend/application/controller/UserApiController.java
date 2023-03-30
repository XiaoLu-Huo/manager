package com.huoxiaolu.manger.mangerbackend.application.controller;

import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.interfaces.UserApi;
import com.huoxiaolu.manger.mangerbackend.api.request.UserCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.UserQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.UserListResponse;
import com.huoxiaolu.manger.mangerbackend.application.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaolu.huo
 */
@RestController
@RequiredArgsConstructor
@RequestMapping
public class UserApiController implements UserApi {

    private final UserService userService;

    @Override
    public String createUser(UserCreateRequest request) {
        return userService.createUser(request);
    }

    @Override
    public PageInfo<UserListResponse> queryUserList(UserQueryRequest request) {
        return userService.queryUserList(request);
    }
}
