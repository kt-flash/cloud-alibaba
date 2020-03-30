package com.flash.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡
 * @Author: LiLiang
 * @Date: 2020/1/7 9:48
 */
@Configuration
public class MyRuleConfig {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
