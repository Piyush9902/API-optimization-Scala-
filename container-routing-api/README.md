# Container Routing Optimization API

## Overview
This project implements a container routing optimization API using Java Spring Boot and Scala for mathematical optimization.

## Endpoint

**POST** `/api/optimize`

**Request:**
```json
{
  "containers": [
    {"id": "C1", "from": 0, "to": 3},
    {"id": "C2", "from": 2, "to": 1}
  ]
}
```

**Response:**
```json
{
  "optimizedPlan": [
    {"id": "C2", "from": 2, "to": 1},
    {"id": "C1", "from": 0, "to": 3}
  ],
  "totalDistance": 4,
  "latencyMs": 2
}
```

## Build and Run
```bash
mvn spring-boot:run
```
