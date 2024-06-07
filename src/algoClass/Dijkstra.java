package algoClass;

import java.util.Scanner;

public class Dijkstra {

    public static void dijkstra(int[][] graph, int source) {
        int count = graph.length;
        boolean[] visitedVertex = new boolean[count];
        int[] distance = new int[count];
        for (int i = 0; i < count; i++) {
            visitedVertex[i] = false;
            distance[i] = Integer.MAX_VALUE;
        }

        // Distance of self loop is zero
        distance[source] = 0;
        for (int i = 0; i < count; i++) {

            // Update the distance between neighbouring vertex and source vertex
            int u = findMinDistance(distance, visitedVertex);
            visitedVertex[u] = true;

            // Update all the neighbouring vertex distances
            for (int v = 0; v < count; v++) {
                if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < distance.length; i++) {
            System.out.println(String.format("Distance from %s to %s is %s", source, i, distance[i]));
        }
    }

    // Finding the minimum distance
    private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visitedVertex[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices in the graph: ");
        int vertices = scanner.nextInt();

        int graph[][] = new int[vertices][vertices];
        System.out.println("Enter the adjacency matrix for the graph:");

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the source vertex: ");
        int sourceVertex = scanner.nextInt();

        Dijkstra T = new Dijkstra();
        T.dijkstra(graph, sourceVertex);

        scanner.close();
    }
}



//public class Dijkstra {
//
//    public static void dijkstra(int[][] graph, int source) {
//        int count = graph.length;
//        boolean[] visitedVertex = new boolean[count];
//        int[] distance = new int[count];
//        for (int i = 0; i < count; i++) {
//            visitedVertex[i] = false;
//            distance[i] = Integer.MAX_VALUE;
//        }
//
//        // Distance of self loop is zero
//        distance[source] = 0;
//        for (int i = 0; i < count; i++) {
//
//            // Update the distance between neighbouring vertex and source vertex
//            int u = findMinDistance(distance, visitedVertex);
//            visitedVertex[u] = true;
//
//            // Update all the neighbouring vertex distances
//            for (int v = 0; v < count; v++) {
//                if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
//                    distance[v] = distance[u] + graph[u][v];
//                }
//            }
//        }
//        for (int i = 0; i < distance.length; i++) {
//            System.out.println(String.format("Distance from %s to %s is %s", source, i, distance[i]));
//        }
//
//    }
//
//    // Finding the minimum distance
//    private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
//        int minDistance = Integer.MAX_VALUE;
//        int minDistanceVertex = -1;
//        for (int i = 0; i < distance.length; i++) {
//            if (!visitedVertex[i] && distance[i] < minDistance) {
//                minDistance = distance[i];
//                minDistanceVertex = i;
//            }
//        }
//        return minDistanceVertex;
//    }
//
//    public static void main(String[] args) {
//        int graph[][] = new int[][] {
//                {0, 16, 6, 7, 0, 0},
//                {0, 0, 0, 0, 0, 9},
//                {0, 0, 0, 2, 11, 0},
//                {0, 8, 0, 0, 6, 0},
//                {0, 5, 0, 0, 5, 0},
//                {0, 0, 0, 0, 0, 0}
//        };
//        Dijkstra T = new Dijkstra();
//        T.dijkstra(graph, 0);
//    }
//}


//public class Dijkstra {
//
//    private static void dijkstra(int[][] adjacencyMatrix){
//        int v = adjacencyMatrix.length;
//        boolean visited[] = new boolean[v];
//        int distance[] = new int[v];
//        for (int i=1; i<v; i++){
//            distance[i] = Integer.MAX_VALUE;
//        }
//        for (int i=0; i<v-1; i++){
//            int minVertex = findMinVertex(distance, visited);
//            visited[minVertex] = true;
//            for (int j=0; j<v; j++){
//                if(adjacencyMatrix[minVertex][j] !=0 && !visited[j] && !visited[j] && distance[minVertex] != Integer.MAX_VALUE){
//                    int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j];
//                    if(newDist<distance[j]){
//                        distance[j]=newDist;
//                    }
//                }
//            }
//        }
//        System.out.println("");
//        for (int i=0; i<v; i++){
//
//            System.out.println(i+" -- "+distance[i]);
//
//        }
//    }
//    private static int findMinVertex(int [] distance, boolean visited[]){
//        int minVertex = -1;
//        for (int i=0; i<distance.length; i++){
//            if(!visited[i] && (minVertex == -1 || distance[i]<distance[minVertex])){
//                minVertex = i;
//            }
//        }
//        return minVertex;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Vertex & "+"edges");
//        int v = sc.nextInt();
//        int e = sc.nextInt();
//        int adjacencyMatrix[][]=new int[v][v];
//        for (int i=0; i<e; i++){
//            int v1 = sc.nextInt();
//            int v2 = sc.nextInt();
//            int weight = sc.nextInt();
//            adjacencyMatrix[v1][v2] = weight;
//            adjacencyMatrix[v2][v1] = weight;
//        }
//        dijkstra(adjacencyMatrix);
//    }
//
//}
//
//
//
//
























