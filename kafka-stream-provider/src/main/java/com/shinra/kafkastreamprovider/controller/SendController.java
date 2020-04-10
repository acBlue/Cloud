package com.shinra.kafkastreamprovider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/send")
@Slf4j
public class SendController {

    @Resource(name = "provider_output")
    private MessageChannel messageChannel;

    @GetMapping(value = "/{msg}")
    public String sendMessage(@PathVariable(value = "msg") String msg) {
        boolean isSend = messageChannel.send(MessageBuilder.withPayload(msg).build());


        return isSend ? "发送成功" : "发送失败";
    }

    @StreamListener(value = "provider_input")
    public void recevie(Message<String> message) {

        log.info("收到消息：{}", message.getPayload());
    }

}
