package com.huoxiaolu.manger.mangerbackend.domain.repository;

/**
 * @author xiaolu.huo
 */
public interface SerialNoDomainRepository {

    /**
     *  生成连续的业务单号
     * @param name 业务类型
     * @return 业务单号
     */
    String generate(String name);
}
