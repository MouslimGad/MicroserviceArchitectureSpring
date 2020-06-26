package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Repository2 {


    @Autowired
    FeignInterface feignInterface;

    @GetMapping("/hello")
    public String getHello(){
        return "Hello from service 3";
    }


    @GetMapping("/helloFromService1")
    public String getHelloFromService1(){
        return feignInterface.getHelloFromService1();
    }

}
