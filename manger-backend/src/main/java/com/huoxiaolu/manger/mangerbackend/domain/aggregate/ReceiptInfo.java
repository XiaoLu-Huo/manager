package com.huoxiaolu.manger.mangerbackend.domain.aggregate;

import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptUpdateRequest;
import com.huoxiaolu.manger.mangerbackend.api.request.UserUpdateRequest;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

import static com.huoxiaolu.manger.mangerbackend.shared.constant.Constants.SYSTEM;

/**
 * @author xiaolu.huo
 */
@Getter
@Setter
public class ReceiptInfo {

    private Long id;
    private String code;
    private String userName;
    private String idCard;
    private BigDecimal amount;
    private LocalDateTime startTime;
    private int term;
    private LocalDateTime endTime;
    private LocalDateTime createTime;
    private String createBy;
    private LocalDateTime updateTime;
    private String updateBy;
    private LocalDateTime deleteTime;
    private boolean deleted;

    public void initInfo() {
        LocalDateTime now = LocalDateTime.now();
        this.createBy = SYSTEM;
        this.updateBy = SYSTEM;
        this.createTime = now;
        this.updateTime = now;
    }

    public void update(ReceiptUpdateRequest request) {
        this.idCard = request.getIdCard();
        this.userName = request.getName();
        this.amount = request.getAmount();
        this.startTime = request.getStartTime();
        this.term = request.getTerm();
        this.endTime = request.getStartTime().plusMonths(request.getTerm()).toLocalDate().atTime(23,59,59);
        this.updateTime = LocalDateTime.now();
    }
}
