package org.example;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1, 9);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(0, 4, 3);
        graph.addEdge(2, 1, 2);
        graph.addEdge(2, 3, 4);

        int[] distances = Dijkstra.shortestPath(graph, 0);

        System.out.println("Distancias desde el nodo 0:");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Nodo " + i + ": " + distances[i]);
        }
    }
}