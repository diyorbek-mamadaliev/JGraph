package org.jgraph;

import static org.junit.jupiter.api.Assertions.*;

public class EdgeTest {
    public static void main(String[] args) {
        Vertex vertexA = new Vertex(0);
        Vertex vertexB = new Vertex(1);
        Edge edgeAB = new Edge(vertexA, vertexB, 3);

        System.out.println("Edge Source: " + edgeAB.getSource().getId());
        System.out.println("Edge Destination: " + edgeAB.getDestination().getId());
        System.out.println("Edge Weight: " + edgeAB.getWeight());
    }
}
