
package com.example.containerapi.controller;

import com.example.containerapi.model.ContainerMove;
import com.example.containerapi.model.OptimizationRequest;
import com.example.containerapi.model.OptimizationResponse;
import com.example.containerapi.service.OptimizationService;
import com.example.containerapi.messaging.KafkaPublisher;
import com.example.containerapi.messaging.RabbitMQPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoutingController {

    @Autowired
    private OptimizationService service;

    @Autowired
    private KafkaPublisher kafkaPublisher;

    @Autowired
    private RabbitMQPublisher rabbitMQPublisher;

    @PostMapping("/optimize")
    public OptimizationResponse optimize(@RequestBody OptimizationRequest request) {
        OptimizationResponse response = service.optimize(request.getContainers());

        kafkaPublisher.publish("Optimization complete: " + response.getOptimizedPlan());
        rabbitMQPublisher.publish("Optimization complete: " + response.getOptimizedPlan());

        return response;
    }
}
