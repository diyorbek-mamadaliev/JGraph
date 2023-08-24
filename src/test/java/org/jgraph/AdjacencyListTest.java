package org.jgraph;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AdjacencyListTest {
    public static void main(String[] args) {
        AdjacencyList adjacencyList = new AdjacencyList();
        Vertex vertexA = new Vertex(0);
        Vertex vertexB = new Vertex(1);
        Edge edge = new Edge(vertexA, vertexB, 1);

        adjacencyList.addVertex(vertexA);
        adjacencyList.addVertex(vertexB);
        adjacencyList.addEdge(vertexA, vertexB, 1);

        List<Edge> adjacentEdges = adjacencyList.getAdjacentEdges(vertexA);
        for (Edge e : adjacentEdges) {
            System.out.println("Adjacent edge: " + e.getSource().getId() + " -> " +
                    e.getDestination().getId() + " Weight: " + e.getWeight());
        }
    }
}
