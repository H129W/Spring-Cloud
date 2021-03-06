package com.google.feign.controller;


import com.google.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/feign")
    public String helloConsumer(){
        return helloService.hello();
    }
}
