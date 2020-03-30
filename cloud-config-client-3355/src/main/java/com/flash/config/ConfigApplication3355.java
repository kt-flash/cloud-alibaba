package com.flash.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author: LiLiang
 * @Date: 2019/11/19 11:12
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ConfigApplication3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication3355.class, args);
    }

}
