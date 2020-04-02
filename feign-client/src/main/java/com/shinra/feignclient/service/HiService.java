package com.shinra.feignclient.service;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "config-client")
public interface HiService {

    @GetMapping(value = "/hi")
    String hi(@RequestParam(value = "name") String name);

}
