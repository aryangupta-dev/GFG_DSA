/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 7/6/2021
 *   Time: 1:36 PM
 *   File: BFSTraversal.java
 */

package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFSTraversal {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(v);
    }

    public static void traversal(ArrayList<ArrayList<Integer>> adj, int v, int s) {
        boolean[] visited = new boolean[v];
        Queue<Integer> obj = new ArrayDeque<>();
        obj.add(s);
        visited[s] = true;
        while (!obj.isEmpty()) {
            int q = obj.poll();
            System.out.println(q + " ");
            for (int a : adj.get(q)) {
                if (!visited[a]) {
                    visited[a] = true;
                    obj.add(a);
                }
            }
        }

    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<Integer>());
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 1, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 2, 4);
        traversal(adj, 5, 0);
    }
}
