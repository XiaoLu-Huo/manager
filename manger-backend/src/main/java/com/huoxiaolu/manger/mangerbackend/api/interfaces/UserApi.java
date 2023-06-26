package com.huoxiaolu.manger.mangerbackend.api.interfaces;

import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.request.UserCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.UserQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.UserUpdateRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.UserInfoResponse;
import com.huoxiaolu.manger.mangerbackend.api.response.UserListResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author xiaolu.huo
 */
public interface UserApi {
    /**
     * 创建一个用户
     * @param request 创建用户的参数
     * @return 用户编码
     */
    @PostMapping("/user/create")
    UserInfoResponse createUser(@Valid @RequestBody UserCreateRequest request);

    /**
     * 分页查询用户列表
     * @param request 分页查询参数
     * @return 查询的结果
     */
    @GetMapping("/user/list")
    PageInfo<UserListResponse> queryUserList(@RequestBody UserQueryRequest request);

    /**
     * 更新用户信息
     * @param request 更新用户信息的参数
     * @return 用户信息
     */
    @PostMapping("/user/update")
    UserInfoResponse updateUserInfo(@Valid @RequestBody UserUpdateRequest request);

}
