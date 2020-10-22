package com.google.eurekaclient01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
//启用eureka客户端
@SpringBootApplication
public class EurekaClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient01Application.class, args);
    }

}
