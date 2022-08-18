/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphAlgorithm;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author sasin
 */
public class GraphBFS {

    private int vertics;
    private LinkedList<Integer> adj[];

    GraphBFS(int v) {
        vertics = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[vertics];
        LinkedList<Integer> list = new LinkedList<>();
        visited[s] = true;
        list.add(s);
        while (!list.isEmpty()) {
            s = list.poll();
            System.out.print(s + " ");

            Iterator<Integer> iterator = adj[s].listIterator();
            while (iterator.hasNext()) {
                int n = iterator.next();
                if (!visited[n]) {
                    visited[n] = true;
                    list.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        GraphBFS g = new GraphBFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.BFS(2);
    }
}
