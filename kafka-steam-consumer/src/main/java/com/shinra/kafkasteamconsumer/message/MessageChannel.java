package com.shinra.kafkasteamconsumer.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface MessageChannel {

    @Input(value = "consumer_input")
    SubscribableChannel recieveShopMessage();

    @Output(value = "consumer_output")
    org.springframework.messaging.MessageChannel sendMessage();

}
