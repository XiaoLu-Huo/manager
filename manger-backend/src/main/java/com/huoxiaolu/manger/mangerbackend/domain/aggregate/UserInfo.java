package com.huoxiaolu.manger.mangerbackend.domain.aggregate;

import com.huoxiaolu.manger.mangerbackend.api.request.UserUpdateRequest;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

import static com.huoxiaolu.manger.mangerbackend.shared.constant.Constants.SYSTEM;

/**
 * @author xiaolu.huo
 */
@Getter
@Setter
public class UserInfo {

    private Long id;
    private String code;
    private String name;
    private String phoneNumber;
    private String address;
    private String idCard;
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

    public void update(UserUpdateRequest userUpdateRequest) {
        this.name = userUpdateRequest.getName();
        this.address = userUpdateRequest.getAddress();
        this.idCard = userUpdateRequest.getIdCard();
        this.phoneNumber = userUpdateRequest.getPhoneNumber();
        this.updateBy = SYSTEM;
        this.updateTime = LocalDateTime.now();
    }
}
