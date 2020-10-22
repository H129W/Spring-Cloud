package com.google.feign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("CLIENT01")         //eureka server     服务器端的访问名
public interface HelloService {
    @RequestMapping("/client01")    //eureka    客户端的访问名
    String hello();
}
