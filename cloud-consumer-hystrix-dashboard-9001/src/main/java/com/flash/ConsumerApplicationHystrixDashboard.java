package com.flash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: LiLiang
 * @Date: 2019/11/19 11:12
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableHystrixDashboard
public class ConsumerApplicationHystrixDashboard {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicationHystrixDashboard.class, args);
    }

}
