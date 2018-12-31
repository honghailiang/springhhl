package com.jtt.hhl.controller;

import com.jtt.hhl.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: Herman
 * @CreateDate: 2019/1/1 1:11
 */
@RestController
public class ConsumerController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/feign-consumer")
    public String helloConsumer(){
        return helloService.hello();
    }
}
