package com.google.eurekaclient02.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
    @RequestMapping("/client01")
    public String home(){
        return "Hello,Tom";
    }
}
