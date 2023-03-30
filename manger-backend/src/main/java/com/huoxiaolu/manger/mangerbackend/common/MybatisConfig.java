package com.huoxiaolu.manger.mangerbackend.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaolu.huo
 */
@Configuration
@MapperScan(value = {"com.huoxiaolu.manger.mangerbackend.infrastructure.repository.query.mapper"})
public class MybatisConfig {
}
