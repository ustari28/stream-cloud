package com.alan.streamcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableBinding({ProductoStream.class, ExternalStream.class})
@Slf4j
public class StreamCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamCloudApplication.class, args);
    }

    @StreamListener(ProductoStream.INPUT)
    @Output(ProductoStream.OUTPUT)
    public String processMessage(MessageDTO message) {
        log.info("processing {}", message.toString());
        return message.getText();
    }

    @StreamListener(ProductoStream.OUTPUT)
    public void outputMessage(String message) {
        log.info("processing product {}", message);
    }

    @StreamListener(ExternalStream.INPUT)
    public void subsInput(String message) {
        log.info("processing external {}", message);
    }
}
