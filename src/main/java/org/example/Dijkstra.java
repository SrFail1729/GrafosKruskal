package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Dijkstra {
    public static int[] shortestPath(Graph graph, int source){
        int V = graph.getVertices();
        int[] distances = new int[V];
        boolean[] visited = new boolean[V];

        //Priority Queue para elegir el nodo con menor peso
        PriorityQueue<Node> pq = new PriorityQueue<>();

        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        pq.add(new Node(source, 0));

        while (!pq.isEmpty()){
            Node current = pq.poll();

            if (visited[current.vertex]) continue;
            visited[current.vertex] = true;

            for (Edge edge : graph.getAdjacencyList().get(current.vertex)) {

                int neighbor = edge.destination;
                int newDist = distances[current.vertex] + edge.weight;

                if (!visited[neighbor] && newDist < distances[neighbor]){
                    distances[neighbor] = newDist;
                    pq.add(new Node(neighbor, newDist));
                }
            }
        }
        return distances;
    }


}
