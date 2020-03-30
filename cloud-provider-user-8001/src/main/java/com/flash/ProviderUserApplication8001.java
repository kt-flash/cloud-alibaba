package com.flash;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: LiLiang
 * @Date: 2019/11/19 11:12
 */
@SpringBootApplication(scanBasePackages={"com.flash"})
@EnableTransactionManagement
@MapperScan("com.flash.mapper")
@EnableDiscoveryClient
@EnableHystrix
public class ProviderUserApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication8001.class, args);
    }

}
