package com.jtt.hhl.controller;

import com.jtt.hhl.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 服务消费接口
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
