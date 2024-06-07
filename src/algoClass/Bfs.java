package algoClass;

import java.util.*;

class Bfs {

    static void printLevels(List<List<Integer>> graph, int V, int x) {
        int[] level = new int[V];
        boolean[] marked = new boolean[V];
        Queue<Integer> que = new LinkedList<>();
        que.add(x);
        level[x] = 0;
        marked[x] = true;

        while (!que.isEmpty()) {
            x = que.poll();
            for (int b : graph.get(x)) {
                if (!marked[b]) {
                    que.add(b);
                    level[b] = level[x] + 1;
                    marked[b] = true;
                }
            }
        }

        System.out.println("Nodes Level");
        for (int i = 0; i < V; i++)
            System.out.println(i + " ------ " + level[i]);
    }

    public static void main(String[] args) {
        int V = 8;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).addAll(Arrays.asList(1, 2));
        graph.get(1).addAll(Arrays.asList(3, 4, 5));
        graph.get(2).addAll(Arrays.asList(5, 6));
        graph.get(6).add(7);

        printLevels(graph, V, 0);
    }
}



