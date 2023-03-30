package com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command.jdbc;

import com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist.UserInfoDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xiaolu.huo
 */
@Repository
public interface UserInfoRepository extends CrudRepository<UserInfoDO, Long> {
}
