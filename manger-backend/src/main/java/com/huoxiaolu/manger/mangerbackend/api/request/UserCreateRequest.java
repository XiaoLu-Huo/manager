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
    @NotBlank
    private String name;

    private String phoneNumber;

    @NotBlank
    private String idCard;

    private String address;
}
