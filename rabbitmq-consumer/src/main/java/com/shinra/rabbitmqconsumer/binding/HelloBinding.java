package com.shinra.rabbitmqconsumer.binding;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface HelloBinding {

    String input = "greetingChannel_input";

    String output = "greetingChannel_output";

    @Output(value = output)
    MessageChannel greeting();

    @Input(value = input)
    SubscribableChannel input();

}
