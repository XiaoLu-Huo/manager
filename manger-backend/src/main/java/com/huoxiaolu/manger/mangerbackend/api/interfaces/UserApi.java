package com.huoxiaolu.manger.mangerbackend.api.interfaces;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.request.UserCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.UserQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.UserListResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
    String createUser(@Valid @RequestBody UserCreateRequest request);

    /**
     * 分页查询用户列表
     *
     * @param request 分页查询参数
     * @return 查询的结果
     */
    @GetMapping("/user/list")
    PageInfo<UserListResponse> queryUserList(@RequestBody UserQueryRequest request);
    // 更新用户信息
    // 删除用户信息
}
