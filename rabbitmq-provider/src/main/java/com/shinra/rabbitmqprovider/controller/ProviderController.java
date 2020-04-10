package com.shinra.rabbitmqprovider.controller;

import com.shinra.rabbitmqprovider.message.HelloBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class ProviderController {


    @Resource
    HelloBinding channel;

    @PostMapping("/send")
    public String send(String msg) {

        boolean success = channel.greeting().send(MessageBuilder.withPayload(msg).build());
        return success ? "发送成功" : "发送失败";
    }

}
