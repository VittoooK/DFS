package DFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {
    private String name;
    private List<Vertex> vertices;

    public Graph(String name) {
        this.name = name;
        this.vertices = new ArrayList<>();
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    public List<Vertex> depthFirstSearch() {
        List<Vertex> visitedOrder = new ArrayList<>();
        Set<Vertex> visited = new HashSet<>();

        if (!vertices.isEmpty()) {
            dfsHelper(vertices.get(0), visited, visitedOrder);
        }
        return visitedOrder;
    }

    private void dfsHelper(Vertex vertex, Set<Vertex> visited, List<Vertex> visitedOrder) {
        visited.add(vertex);
        visitedOrder.add(vertex);

        for (Vertex neighbour : vertex.getNeighbours()) {
            if (!visited.contains(neighbour)) {
                dfsHelper(neighbour, visited, visitedOrder);
            }
        }
    }
}
