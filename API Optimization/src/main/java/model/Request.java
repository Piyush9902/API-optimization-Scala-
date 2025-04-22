
package com.example.containerapi.model;

import java.util.List;

public class Request {
    private List<ContainerMove> containers;

    public List<ContainerMove> getContainers() { return containers; }
    public void setContainers(List<ContainerMove> containers) { this.containers = containers; }
}
