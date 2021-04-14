package com.jtt.hhl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: springboot示例
 * @Author: Herman
 * @CreateDate: 2018/12/30 20:48
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }
}
