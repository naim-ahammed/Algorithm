package algoClass;

import java.util.ArrayList;
import java.util.Iterator;

public class GraphSearch {

    int v;
    ArrayList<Integer> adj[];
    GraphSearch(int noOfVertex){
        v = noOfVertex;
        adj = new ArrayList[noOfVertex];
        for (int i=0; i<noOfVertex; i++){
            adj[i]=new ArrayList<>();
        }
    }

    void edge(int x, int y){
        adj[x].add(y);
    }

    void bfs(int sourceVertex){
        boolean[] visited=new boolean[v];
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        visited[sourceVertex]=true;
        a1.add(sourceVertex);
        while (!a1.isEmpty()){
            sourceVertex = a1.remove(0);
            System.out.print(sourceVertex+" ");
            Iterator i = adj[sourceVertex].iterator();
            while (i.hasNext()){
                int n = (int) i. next();
                if (!visited[n]){
                    visited[n]=true;
                    a1.add(n);
                }
            }
        }
    }

    void dfs(int sourceVertex){
        boolean[] visited = new boolean[v];
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        visited[sourceVertex]=true;
        a1.add(sourceVertex);
        while (!a1.isEmpty()){
            sourceVertex =a1.remove(0);
            System.out.print(sourceVertex+" ");
            Iterator i = adj[sourceVertex].iterator();
            while (i.hasNext()){
                int n = (int) i.next();
                if (!visited[n]){
                    visited[n]=true;
                    a1.add(n);
                }
            }
        }
        }

    public static void main(String[] args) {

        GraphSearch graphSearch = new GraphSearch(6);
        graphSearch.edge(0,1);
        graphSearch.edge(0,2);
        graphSearch.edge(0,5);
        graphSearch.edge(1,0);
        graphSearch.edge(2,0);
        graphSearch.edge(2,1);
        graphSearch.edge(2,3);
        graphSearch.edge(2,4);
        graphSearch.edge(3,2);
        graphSearch.edge(4,2);
        graphSearch.edge(4,5);
        graphSearch.edge(5,0);
        graphSearch.edge(5,4);

        graphSearch.bfs(0);

        System.out.println(" ");

        graphSearch.dfs(0);


    }

}
