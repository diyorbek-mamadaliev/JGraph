package org.jgraph;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BreadthFirstSearchTest {
    public static void main(String[] args) {
        AdjacencyList adjacencyList = new AdjacencyList();
        Vertex vertexA = new Vertex(0);
        Vertex vertexB = new Vertex(1);
        Vertex vertexC = new Vertex(2);
        Edge edgeAB = new Edge(vertexA, vertexB, 1);
        Edge edgeAC = new Edge(vertexA, vertexC, 1);

        adjacencyList.addVertex(vertexA);
        adjacencyList.addVertex(vertexB);
        adjacencyList.addVertex(vertexC);
        adjacencyList.addEdge(vertexA, vertexB, 1);
        adjacencyList.addEdge(vertexA, vertexC, 1);

        BreadthFirstSearch bfs = new BreadthFirstSearch();
        List<Vertex> traversalOrder = bfs.bfs(adjacencyList, vertexA);

        System.out.println("BFS Traversal Order: " + traversalOrder);
    }
}
