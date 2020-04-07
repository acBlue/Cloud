package com.shinra.openfeignprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/home")
    String index() {
        return "Index" + UUID.randomUUID();
    }

}
