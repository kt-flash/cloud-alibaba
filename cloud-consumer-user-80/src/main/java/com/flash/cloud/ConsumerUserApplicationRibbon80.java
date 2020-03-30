package com.flash.cloud;

import com.flash.rule.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: LiLiang
 * @Date: 2019/11/19 11:12
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient
//自定义负载均衡
@RibbonClient(name = "CLOUD-PROVIDER-USER",configuration = MyRuleConfig.class)
public class ConsumerUserApplicationRibbon80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApplicationRibbon80.class, args);
    }

}
