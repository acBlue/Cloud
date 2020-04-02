package com.shinra.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Value("${foo}")
    private String foo;
    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name") String name) {


        return serverPort + " :" + foo;
    }


}
