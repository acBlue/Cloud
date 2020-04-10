package com.shinra.kafkasteamconsumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/")
public class RecvierController {

    @Resource(name = "consumer_input")
    private MessageChannel messageChannel;

    @StreamListener(value = "consumer_input")
    public void recevie(Message<String> message) {

        log.info("收到消息：{}", message.getPayload());
    }

}
