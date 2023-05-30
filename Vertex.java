import java.util.HashMap;
import java.util.Map;


/**
 * Represents a vertex in a weighted graph.
 *
 * @param <V> the type of data stored in the vertex.
 */

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    /**
     * Creates a new vertex with the specified data.
     *
     * @param data the data associated with the vertex.
     */

    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }

    /**
     * Returns the data associated with the vertex.
     *
     * @return the data of the vertex.
     */

    public V getData() {
        return data;
    }

    /**
     * Adds an adjacent vertex with the specified weight.
     *
     * @param destination the adjacent vertex.
     * @param weight      the weight of the edge connecting the vertices.
     */

    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    /**
     * Returns a map of adjacent vertices and their weights.
     *
     * @return the map of adjacent vertices and their weights.
     */

    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }

    /**
     * Returns a string representation of the vertex.
     *
     * @return the string representation of the vertex.
     */

    @Override
    public String toString() {
        return data.toString();
    }
}
