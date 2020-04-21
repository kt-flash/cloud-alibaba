package com.flash;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: LiLiang
 * @Date: 2020/4/15 15:29
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.flash.mapper")
@EnableDiscoveryClient
public class UserProviderApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication9001.class, args);
    }

}
