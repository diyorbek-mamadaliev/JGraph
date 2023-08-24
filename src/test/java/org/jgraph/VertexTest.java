package org.jgraph;

import static org.junit.jupiter.api.Assertions.*;

public class VertexTest {
    public static void main(String[] args) {
        Vertex vertexA = new Vertex(0);
        Vertex vertexB = new Vertex(1);

        System.out.println("Vertex A ID: " + vertexA.getId());
        System.out.println("Vertex B ID: " + vertexB.getId());
    }
}
