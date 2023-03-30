package com.huoxiaolu.manger.mangerbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiaolu.huo
 */
@SpringBootApplication(scanBasePackages = "com.huoxiaolu.manger.mangerbackend")
public class MangerBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangerBackendApplication.class, args);
    }

}
