package com.flash.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: LiLiang
 * @Date: 2019/11/19 11:12
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.flash"})
@ComponentScan("com.flash")
public class ConsumerUserApplicationFeign80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApplicationFeign80.class, args);
    }

}
