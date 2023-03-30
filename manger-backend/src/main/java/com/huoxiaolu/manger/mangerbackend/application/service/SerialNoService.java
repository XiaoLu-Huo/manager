package com.huoxiaolu.manger.mangerbackend.application.service;

import com.huoxiaolu.manger.mangerbackend.shared.enums.SerialNoType;

/**
 * @author xiaolu.huo
 */
public interface SerialNoService {
    /**
     * 根据业务类型生成单号
     * @param serialNoType 业务类型
     * @return 单号
     */
    String generate(SerialNoType serialNoType);
}
