package com.example.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

@RequestMapping("use")
public class demo {
    @RequestMapping("login")
    public String sayHi(){
        return "hi man";
    }
    @RequestMapping("git")
    public String demo1(){
        return  "hi git";
    }
}
