
package com.example.containerapi.service;

import com.example.containerapi.model.ContainerMove;
import com.example.containerapi.model.OptimizationResponse;
import scala.jdk.javaapi.CollectionConverters;
import com.example.containerapi.scala.OptimizationEngine$;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutingService {
    public OptimizationResponse optimize(List<ContainerMove> moves) {
        long start = System.currentTimeMillis();

        var scalaList = CollectionConverters.asScala(moves).toList();
        var plan = OptimizationEngine$.MODULE$.optimize(scalaList);
        int totalDistance = OptimizationEngine$.MODULE$.totalDistance(scalaList);

        long end = System.currentTimeMillis();
        long latency = end - start;

        return new OptimizationResponse(CollectionConverters.asJava(plan), totalDistance, latency);
    }
}
