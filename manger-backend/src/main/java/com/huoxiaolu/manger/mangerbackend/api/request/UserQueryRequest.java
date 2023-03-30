package com.huoxiaolu.manger.mangerbackend.api.request;

import com.huoxiaolu.manger.mangerbackend.common.PageQueryDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaolu.huo
 */
@Getter
@Setter
public class UserQueryRequest extends PageQueryDTO {
    private String name;
}
