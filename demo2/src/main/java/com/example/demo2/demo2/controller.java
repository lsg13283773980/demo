package com.example.demo2.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping("hello")
    public String test01(){

        return "hello";
    }
}
