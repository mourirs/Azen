package com.azen.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.azen.user.dao")
@EnableTransactionManagement(proxyTargetClass = true)
public class AzenUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzenUserApplication.class, args);
    }

}
