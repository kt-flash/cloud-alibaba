package com.flash.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: EurekaCenterApplication 服务注册中心配置
 * @Author: LiLiang
 * @Date: 2020/1/3 11:07
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class EurekaApplication7003 {

    /**
     * 注册中心启动项
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication7003.class, args);
    }



}
