
package com.example.containerapi.messaging;

import org.springframework.stereotype.Component;

@Component
public class RabbitMQPublisher {
    public void publish(String message) {
        System.out.println("RabbitMQ >> " + message); // Simulated RabbitMQ publish
    }
}
