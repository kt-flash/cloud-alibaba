package com.flash.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiLiang
 * @Date: 2020/2/24 15:03
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service_url.defaultZone}")
    private String eurekaClientServiceUrlDefaultZone;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/config")
    public String getConfig(){
        System.out.println(applicationName);
        System.out.println(eurekaClientServiceUrlDefaultZone);
        System.out.println(serverPort);
        return applicationName +"\t" + eurekaClientServiceUrlDefaultZone +"\t" + serverPort;
    }
}
