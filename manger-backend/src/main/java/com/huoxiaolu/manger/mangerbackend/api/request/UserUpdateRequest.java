package com.huoxiaolu.manger.mangerbackend.api.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaolu.huo
 */
@Getter
@Setter
public class UserUpdateRequest {

    @NotNull(message = "id can not be null")
    private Long id;

    @NotBlank(message = "name can not be null")
    private String name;

    private String phoneNumber;

    @NotBlank(message = "idCard can not be null")
    private String idCard;

    private String address;
}
