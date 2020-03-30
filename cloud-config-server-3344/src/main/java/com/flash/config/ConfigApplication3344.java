package com.flash.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: LiLiang
 * @Date: 2019/11/19 11:12
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableConfigServer
public class ConfigApplication3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication3344.class, args);
    }

}
