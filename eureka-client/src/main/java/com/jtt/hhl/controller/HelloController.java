package com.jtt.hhl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: Herman
 * @CreateDate: 2018/12/30 20:48
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String ip;

    @RequestMapping("/hello")
    public String index(){
        String services = "Services: " + discoveryClient.getServices()+" ip :" + ip;
        logger.info(services);
        return "Hello World";
    }
}
