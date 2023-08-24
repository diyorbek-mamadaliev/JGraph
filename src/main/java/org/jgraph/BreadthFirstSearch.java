package org.jgraph;

import java.util.*;

public class BreadthFirstSearch {
    public List<Vertex> bfs(AdjacencyList adjacencyList, Vertex startVertex) {
        List<Vertex> traversalOrder = new ArrayList<>();
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        queue.add(startVertex);
        visited.add(startVertex);

        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            traversalOrder.add(currentVertex);

            List<Edge> adjacentEdges = adjacencyList.getAdjacentEdges(currentVertex);
            for (Edge edge : adjacentEdges) {
                Vertex neighbor = edge.getDestination();
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return traversalOrder;
    }
}

