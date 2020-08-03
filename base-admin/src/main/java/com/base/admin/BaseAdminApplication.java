package com.base.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动入口
 */
@SpringBootApplication(scanBasePackages = "com.base")
@MapperScan(value = {"com.base.mbg.mapper","com.base.admin.dao"})
public class BaseAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseAdminApplication.class, args);
    }
}
