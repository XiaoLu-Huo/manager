package com.huoxiaolu.manger.mangerbackend.api.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaolu.huo
 */
@Getter
@Setter
public class ReceiptCreateRequest {
    @NotBlank(message = "存款人姓名不能为空")
    @Schema(example = "xxx", description = "存款人")
    private String userName;

    @NotNull(message = "存款开始时间不能为空")
    @Schema(example = "2021/7/29 11:56:00", description = "存款时间")
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime startTime;

    @NotNull(message = "存款期限不能为空")
    @Schema(example = "6｜12｜24", description = "存款月份")
    private int term;

    @NotNull(message = "存款金额不能为空")
    @Min(value = 0, message = "存款金额最小为0")
    @Digits(integer = 13, fraction = 2, message = "金额整数部分最大13位，小数部分2位")
    @Schema(example = "10000", description = "存款金额")
    private BigDecimal amount;

    @NotBlank(message = "身份证号不能为空")
    @Pattern(regexp = "\\d{17}[0-9Xx]", message = "身份证号不符合规则")
    @Schema(example = "1424xxxxxxxxxxxx", description = "身份证号")
    private String idCard;
}
