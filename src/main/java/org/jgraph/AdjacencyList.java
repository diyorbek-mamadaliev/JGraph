package org.jgraph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyList {
    private Map<Vertex, List<Edge>> adjacencyMap;

    public AdjacencyList() {
        adjacencyMap = new HashMap<>();
    }

    public void addVertex(Vertex vertex) {
        adjacencyMap.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex source, Vertex destination, int weight) {
        if (!adjacencyMap.containsKey(source)) {
            addVertex(source);
        }
        if (!adjacencyMap.containsKey(destination)) {
            addVertex(destination);
        }

        List<Edge> edges = adjacencyMap.get(source);
        edges.add(new Edge(source, destination, weight));
    }

    public List<Edge> getAdjacentEdges(Vertex vertex) {
        return adjacencyMap.get(vertex);
    }
}

