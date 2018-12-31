package com.jtt.hhl.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: java类作用描述
 * @Author: Herman
 * @CreateDate: 2019/1/1 1:08
 */

@FeignClient("eureka-client")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();
}
