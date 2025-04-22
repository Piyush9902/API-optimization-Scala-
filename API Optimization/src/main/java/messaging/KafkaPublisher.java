
package com.example.containerapi.messaging;

import org.springframework.stereotype.Component;

@Component
public class KafkaPublisher {
    public void publish(String message) {
        System.out.println("Kafka >> " + message); // Simulated Kafka publish
    }
}
