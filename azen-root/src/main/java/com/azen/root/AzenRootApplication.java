package com.azen.root;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.azen.root.dao")
@EnableTransactionManagement(proxyTargetClass = true)
public class AzenRootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzenRootApplication.class, args);
    }

}
