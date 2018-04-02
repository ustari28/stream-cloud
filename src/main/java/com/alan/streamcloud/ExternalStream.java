package com.alan.streamcloud;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Alan Dávila<br>
 * 19 Sep. 2017 21:10
 */
public interface ExternalStream {

    String INPUT = "outTest";

    @Input(ExternalStream.INPUT)
    SubscribableChannel input();
}
