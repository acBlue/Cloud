package com.shinra.openfeginconsumer.service.impl;

import org.springframework.stereotype.Service;
import com.shinra.openfeginconsumer.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public String getHome() {
        return "fall back";
    }
}
