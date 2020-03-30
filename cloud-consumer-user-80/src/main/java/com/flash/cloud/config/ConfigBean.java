package com.flash.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: LiLiang
 * @Date: 2020/1/2 16:15
 */
@Configuration
public class ConfigBean {

    @Bean
    //Ribbon负载均衡
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
