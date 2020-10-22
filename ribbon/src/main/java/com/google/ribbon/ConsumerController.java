package com.google.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbon")
    //启动断路器
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloConsumer(){
        return restTemplate.getForEntity("http://CLIENT01",String.class).getBody();
    }

    //断路器隔开后的提醒
    public String helloFallback(){
        return "error";
    }





}
