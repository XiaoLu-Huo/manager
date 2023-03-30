package com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command.jdbc;

import com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist.SerialNoDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xiaolu.huo
 */
@Repository
public interface SerialNoRepository extends CrudRepository<SerialNoDO, Long> {

    /**
     * 根据年月和业务类型查找当前的业务单号
     * @param type 业务类型
     * @param month 月
     * @param year 年
     * @return 业务单号
     */
    SerialNoDO findByTypeAndMonthAndYear(String type, Integer month, Integer year);
}
