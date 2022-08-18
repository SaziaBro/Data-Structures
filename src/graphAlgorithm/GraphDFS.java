/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sasin
 */
class Edge {

    int source, dest;

    public Edge(int source, int dest) {
        this.source = source;
        this.dest = dest;
    }
}

public class GraphDFS {

    List<List<Integer>> adjList;

    GraphDFS(List<Edge> edges, int n) {
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (Edge edge : edges) {
            int src = edge.source;
            int dest = edge.dest;
            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }
}

class App {

    public static void DFS(GraphDFS graph, int v, boolean[] d) {
        d[v] = true;
        System.out.print(v + " ");
        for (int u : graph.adjList.get(v)) {
            if (!d[u]) {
                DFS(graph, u, d);
            }
        }
    }

    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
                new Edge(1, 2), new Edge(1, 5), new Edge(1, 6),
                new Edge(2, 4), new Edge(2, 8), new Edge(3, 9),
                new Edge(3, 2), new Edge(8, 5), new Edge(8, 9));
        final int n = 13;
        GraphDFS graph = new GraphDFS(edges, n);
        boolean[] discovered = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!discovered[i]) {
                DFS(graph, i, discovered);
            }
        }
        System.out.println();
    }
}
