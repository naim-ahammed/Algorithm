package algoClass;
import java.util.*;
public class TopologicalSort {
    public List<Integer> topologicalSort(int numCourses, int[][] prerequisites) {
        List<Integer> result = new ArrayList<>();
        List<Integer>[] graph = new List[numCourses];
        int[] inDegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();}
        for (int[] prerequisite : prerequisites) {
            graph[prerequisite[1]].add(prerequisite[0]);
            inDegree[prerequisite[0]]++;}
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);}}
        while (!queue.isEmpty()) {
            int course = queue.poll();
            result.add(course);
            for (int neighbor : graph[course]) {
                if (--inDegree[neighbor] == 0) {
                    queue.offer(neighbor);}}}
        if (result.size() == numCourses) {
            return result;} else {
            return new ArrayList<>();}}
    public static void main(String[] args) {
        TopologicalSort solution = new TopologicalSort();
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        List<Integer> result = solution.topologicalSort(numCourses, prerequisites);
        if (result.isEmpty()) {
            System.out.println("Graph has a cycle");} else {
            System.out.println("Topological Order: " + result);}}}
