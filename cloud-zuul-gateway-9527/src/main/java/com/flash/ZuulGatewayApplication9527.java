package com.flash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: LiLiang
 * @Date: 2019/11/19 11:12
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayApplication9527 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication9527.class, args);
    }

}
