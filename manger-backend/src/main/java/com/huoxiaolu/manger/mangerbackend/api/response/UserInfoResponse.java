package com.huoxiaolu.manger.mangerbackend.api.response;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaolu.huo
 */
@Getter
@Setter
public class UserInfoResponse {
    private Long id;
    private String code;
    private String name;
    private String phoneNumber;
    private String idCard;
}
