package com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist;

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
@Table("user_info")
public class UserInfoDO {
    @Id
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


}
