package com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author xiaolu.huo
 */
@Getter
@Setter
@ToString
@Table("receipt")
public class ReceiptInfoDO {
    @Id
    private Long id;
    private String code;
    private String userName;
    private String idCard;
    private BigDecimal amount;
    private LocalDateTime startTime;
    private Integer term;
    private LocalDateTime endTime;
    private LocalDateTime createTime;
    private String createBy;
    private LocalDateTime updateTime;
    private String updateBy;
    private LocalDateTime deleteTime;
    private Boolean deleted;
}
