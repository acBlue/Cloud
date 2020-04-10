package com.shinra.rabbitmqconsumer.listener;


import com.shinra.rabbitmqconsumer.binding.HelloBinding;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(HelloBinding.class)
public class HelloListener {

    @StreamListener(value = HelloBinding.input)
    public void exec(String msg) {
        System.out.println("收到消息");
        System.out.println(msg);
    }

}
