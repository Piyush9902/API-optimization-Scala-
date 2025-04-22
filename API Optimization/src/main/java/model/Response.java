
package com.example.containerapi.model;

import java.util.List;

public class Response {
    private List<ContainerMove> optimizedPlan;
    private int totalDistance;
    private long latencyMs;

    public Response(List<ContainerMove> optimizedPlan, int totalDistance, long latencyMs) {
        this.optimizedPlan = optimizedPlan;
        this.totalDistance = totalDistance;
        this.latencyMs = latencyMs;
    }

    public List<ContainerMove> getOptimizedPlan() { return optimizedPlan; }
    public int getTotalDistance() { return totalDistance; }
    public long getLatencyMs() { return latencyMs; }
}
