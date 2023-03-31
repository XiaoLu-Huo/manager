package com.huoxiaolu.manger.mangerbackend.api.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaolu.huo
 */
@Getter
@Setter
public class UserCreateRequest {
    @NotBlank(message = "name can not be null")
    private String name;

    private String phoneNumber;

    @NotBlank(message = "idCard can not be null")
    private String idCard;

    private String address;
}
