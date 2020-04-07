package com.shinra.openfeginconsumer.controller;


import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shinra.openfeginconsumer.service.HomeService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
@DefaultProperties(defaultFallback = "defaultFallBack")
public class HomeController {

    @Resource
    HomeService homeService;

    @GetMapping("/home")
    String home() {
        return homeService.getHome();
    }


    String defaultFallBack() {
        return "defaultFallBack";
    }
}
