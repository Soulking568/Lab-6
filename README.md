# Lab-6
# Graph Algorithms with Weighted Graphs

This project implements breadth-first search (BFS) and Dijkstra's algorithm for a weighted graph using vertices.

## Project Structure

The project consists of the following classes:

- `Vertex`: Represents a vertex in a weighted graph.
- `WeightedGraph`: Represents a weighted graph with vertices.
- `Search`: An interface for graph search algorithms.
- `BreadthFirstSearch`: Implements BFS for a weighted graph.
- `DijkstraSearch`: Implements Dijkstra's algorithm for a weighted graph.
- `Main`: Contains an example usage of the implemented algorithms.

## Usage

1. Clone the project from the GitHub repository.
2. Open the project in IntelliJ IDEA.
3. Run the `Main` class to see the example usage of BFS and Dijkstra's algorithm on a weighted graph.
4. Modify the code in `Main` or other classes to suit your specific requirements.

## Additional Notes

- The `Vertex` class represents a vertex in a weighted graph and stores its associated data. It also maintains a map of adjacent vertices with their weights.
- The `WeightedGraph` class represents a weighted graph and provides methods to add vertices, add edges with weights, and retrieve adjacent vertices.
- The `BreadthFirstSearch` class implements BFS for a weighted graph. It performs a breadth-first traversal starting from a given vertex.
- The `DijkstraSearch` class implements Dijkstra's algorithm for a weighted graph. It finds the shortest path from a given vertex to all other vertices.
- The `Main` class demonstrates the usage of the implemented algorithms on a sample weighted graph.

Feel free to explore and modify the code to suit your specific needs.

