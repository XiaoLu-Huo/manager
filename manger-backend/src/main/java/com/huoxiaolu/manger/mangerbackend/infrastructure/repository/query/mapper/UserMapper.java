package com.huoxiaolu.manger.mangerbackend.infrastructure.repository.query.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.request.UserQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.UserListResponse;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiaolu.huo
 */
public interface UserMapper {
    /**
     * 分页查询用户列表
     * @param request 查询参数
     * @return 查询结果
     */
    List<UserListResponse> pageUserInfoList(UserQueryRequest request);
}
