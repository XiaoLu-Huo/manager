package com.huoxiaolu.manger.mangerbackend.api.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaolu.huo
 */
@Getter
@Setter
public class ReceiptListResponse {
    private Long   id;
    private String code;
    private String name;
    private String term;
    private BigDecimal amount;
    private String idCard;
    private LocalDateTime startTime;
    private LocalDateTime endTime;


}
