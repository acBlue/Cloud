package com.shinra.feignclient.controller;

import com.shinra.feignclient.service.HiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    HiService hiService;

    @GetMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name) {


        return hiService.hi(name);
    }
}
