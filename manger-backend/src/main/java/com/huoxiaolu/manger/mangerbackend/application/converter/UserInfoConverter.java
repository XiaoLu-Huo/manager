package com.huoxiaolu.manger.mangerbackend.application.converter;

import com.huoxiaolu.manger.mangerbackend.api.request.UserCreateRequest;
import com.huoxiaolu.manger.mangerbackend.api.response.UserInfoResponse;
import com.huoxiaolu.manger.mangerbackend.domain.aggregate.UserInfo;
import org.mapstruct.Mapper;

/**
 * @author xiaolu.huo
 */
@Mapper(componentModel = "spring")
public interface UserInfoConverter {
    /**
     * 将request请求参数转化为domain对象
     * @param request 请求参数
     * @param code 业务单号
     * @return domain对象
     */
    UserInfo requestToUserInfo(UserCreateRequest request, String code);

    /**
     * 将domain对象转化为response对象
     * @param savedUserInfo domain对象
     * @return UserInfoResponse
     */
    UserInfoResponse userInfoToResponse(UserInfo savedUserInfo);
}
