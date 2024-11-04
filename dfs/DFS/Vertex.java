package DFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String label;
    private List<Vertex> neighbours;

    public Vertex(String label) {
        this.label = label;
        this.neighbours = new ArrayList<>();
    }

    public String getLabel() {
        return label;
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void addNeighbour(Vertex vertex) {
        if (!neighbours.contains(vertex)) {
            neighbours.add(vertex);
        }
    }
}
