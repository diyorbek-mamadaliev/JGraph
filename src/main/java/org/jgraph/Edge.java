package org.jgraph;

public class Edge {
    private final Vertex source;
    private final Vertex destination;
    private final int weight; // Weight of the edge

    public Edge(Vertex source, Vertex destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex getSource() {
        return source;
    }

    public Vertex getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    // Add getter and setter methods for other properties
}

