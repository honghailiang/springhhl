package com.jtt.hhl.controller;

import com.jtt.hhl.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: java类作用描述
 * @Author: Herman
 * @CreateDate: 2018/12/31 17:08
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @GetMapping("/ribbon-consumer")
    public String helloConsumer () {
        return helloService.helloService();
    }
}
