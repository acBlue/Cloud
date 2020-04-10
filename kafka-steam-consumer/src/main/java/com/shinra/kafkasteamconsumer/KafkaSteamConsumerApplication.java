package com.shinra.kafkasteamconsumer;

import com.shinra.kafkasteamconsumer.message.MessageChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MessageChannel.class)
public class KafkaSteamConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSteamConsumerApplication.class, args);
    }

}
