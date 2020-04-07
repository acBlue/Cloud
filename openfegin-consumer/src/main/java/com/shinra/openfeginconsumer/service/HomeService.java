package com.shinra.openfeginconsumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import com.shinra.openfeginconsumer.service.impl.HomeServiceImpl;

@FeignClient(value = "openfeign-provider", fallback = HomeServiceImpl.class)
public interface HomeService {

    @GetMapping(value = "/home")
    String getHome();

}
