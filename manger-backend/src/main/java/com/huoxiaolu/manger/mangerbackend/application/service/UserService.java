package com.huoxiaolu.manger.mangerbackend.application.service;

import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.request.UserCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.UserQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.UserUpdateRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.UserInfoResponse;
import com.huoxiaolu.manger.mangerbackend.api.response.UserListResponse;

/**
 * @author xiaolu.huo
 */
public interface UserService {
    /**
     * 分页查询用户列表
     * @param request 查询参数
     * @return 查询结果
     */
    PageInfo<UserListResponse> queryUserList(UserQueryRequest request);

    /**
     * 创建用户信息
     * @param request 用户信息参数
     * @return 用户编码
     */
    UserInfoResponse createUser(UserCreateRequest request);

    /**
     * 更新用户信息
     * @param request 用户信息参数
     * @return 用户信息
     */
    UserInfoResponse updateUserInfo(UserUpdateRequest request);
}
