package com.huoxiaolu.manger.mangerbackend.application.repository;

import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.request.UserQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.UserListResponse;

/**
 * @author xiaolu.huo
 */
public interface QueryUserRepository {
    /**
     * 查询用户基本信息
     * @param request 查询参数
     * @return 返回结果集合
     */
    PageInfo<UserListResponse> queryUserList(UserQueryRequest request);
}
