package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Repository {



    @GetMapping("/hello")
    public String getHello(){
        return "Hello from service 1";
    }



}
