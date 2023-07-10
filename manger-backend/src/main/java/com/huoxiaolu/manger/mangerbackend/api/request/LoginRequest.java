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
public class LoginRequest {

    @NotNull(message = "用户id不能为空")
    private Integer id;

    @NotBlank(message = "用户名不能为空")
    private String userName;

    @NotBlank(message = "密码不能为空")
    private String password;
}
