package com.shinra.kafkastreamprovider;

import com.shinra.kafkastreamprovider.message.MessageChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MessageChannel.class)
public class KafkaStreamProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaStreamProviderApplication.class, args);
    }

}
