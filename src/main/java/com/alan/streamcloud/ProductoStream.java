package com.alan.streamcloud;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Alan Dávila<br>
 * 04 Sep. 2017 22:26
 */
public interface ProductoStream {
    String INPUT = "inTest";
    String OUTPUT = "outTest";

    @Input(ProductoStream.INPUT)
    SubscribableChannel input();

    @Output(ProductoStream.OUTPUT)
    SubscribableChannel ouput();
}
