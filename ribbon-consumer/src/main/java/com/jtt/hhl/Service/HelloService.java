package com.jtt.hhl.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: java类作用描述
 * @Author: Herman
 * @CreateDate: 2019/1/1 0:14
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService(){
        return restTemplate.getForEntity("http://EUREKA-CLIENT/hello",
                String.class).getBody();
    }

    public String helloFallback(){
        return "error";
    }
}