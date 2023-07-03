package com.huoxiaolu.manger.mangerbackend.api.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.huoxiaolu.manger.mangerbackend.common.PageQueryDTO;
import jakarta.validation.constraints.Pattern;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaolu.huo
 */
@Getter
@Setter
public class ReceiptQueryRequest extends PageQueryDTO {

    @Pattern(regexp = "\\d{17}[0-9Xx]", message = "身份证号不符合规则")
    private String idCard;

    private String name;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime endTimeFrom;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime endTimeTo;

}
