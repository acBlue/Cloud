package com.shinra.kafkastreamprovider.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface MessageChannel {


    @Input(value = "provider_input")
    SubscribableChannel recieveShopMessage();

    @Output(value = "provider_output")
    org.springframework.messaging.MessageChannel sendMessage();


}
