package com.flash;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: LiLiang
 * @Date: 2019/11/19 11:12
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.flash.mapper")
public class ProviderUserApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication8001.class, args);
    }

}
