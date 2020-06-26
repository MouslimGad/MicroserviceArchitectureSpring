package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-1")
public interface FeignInterface {

    @GetMapping("/hello")
    public String getHelloFromService1();
}
