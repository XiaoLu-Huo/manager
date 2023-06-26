package com.huoxiaolu.manger.mangerbackend.api.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaolu.huo
 */
@Getter
@Setter
public class UserUpdateRequest {

    @NotNull(message = "id 不能为空")
    private Long id;

    @NotBlank(message = "姓名不能为空")
    private String name;

    private String phoneNumber;

    @NotBlank(message = "身份证号不能为空")
    @Pattern(regexp = "\\d{17}[0-9Xx]", message = "身份证号不符合规则")
    private String idCard;

    private String address;
}
