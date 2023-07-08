package com.huoxiaolu.manger.mangerbackend.infrastructure.repository.query;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.huoxiaolu.manger.mangerbackend.api.request.UserQueryRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.UserListResponse;
import com.huoxiaolu.manger.mangerbackend.application.repository.QueryUserRepository;
import com.huoxiaolu.manger.mangerbackend.infrastructure.repository.query.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.github.pagehelper.page.PageMethod.startPage;
import static com.huoxiaolu.manger.mangerbackend.common.PageUtils.warpPage;

/**
 * @author xiaolu.huo
 */
@Repository
@AllArgsConstructor
public class QueryUserRepositoryImpl implements QueryUserRepository {

    private final UserMapper userMapper;

    @Override
    public PageInfo<UserListResponse> queryUserList(UserQueryRequest request) {
        Page<UserListResponse> page = startPage(request.getPageNumber(), request.getPageSize())
                .setOrderBy("code desc")
                .doSelectPage(() -> userMapper.pageUserInfoList(request));
       return warpPage(page);
    }
}
