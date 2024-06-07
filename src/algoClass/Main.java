package algoClass;

import java.util.*;

class Node implements Comparable<Node> {
    int node;
    int cost;

    public Node(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        if (this.cost < o.cost) {
            return -1;
        } else if (this.cost > o.cost) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class Main {
    public static final int V = 5;

    public static void printShortestPath(int dist[], int n) {
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void dijkstra(int graph[][], int src) {
        int dist[] = new int[V];
        boolean sptSet[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = -1;
            for (int i = 0; i < V; i++) {
                if (!sptSet[i] && (u == -1 || dist[i] < dist[u])) {
                    u = i;
                }
            }

            sptSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printShortestPath(dist, V);
    }

    public static void main(String[] args) {
        int graph[][] = {
                {0, 16, 6, 7, 0, 0},
                {0, 0, 0, 0, 0, 9},
                {0, 0, 0, 2, 11, 0},
                {0, 8, 0, 0, 6, 0},
                {0, 5, 0, 0, 5, 0},
                {0, 0, 0, 0, 0, 0}
        };

        dijkstra(graph, 0);
    }
}