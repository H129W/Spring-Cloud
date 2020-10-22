package com.google.eurekaclient01.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/client01")
    public String home(){
        return "Hello,LiMing";
    }
}
