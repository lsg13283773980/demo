package com.example.demo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test01 {

    @RequestMapping("hello")
    public String test(){
        return "hello";
    }

}
