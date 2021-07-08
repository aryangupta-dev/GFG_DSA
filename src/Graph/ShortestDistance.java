/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 7/8/2021
 *   Time: 8:42 PM
 *   File: ShortestDistance.java
 */

package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistance {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(v);
    }

    public static void shortDis(ArrayList<ArrayList<Integer>> adj, int v, int s, int[] distance) {
        boolean[] visited = new boolean[v];

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int a : adj.get(u)) {
                if (!visited[a]) {
                    visited[a] = true;
                    distance[a] = distance[u] + 1;
                    q.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[0] = 0;
        shortDis(adj, V, 0, dist);

        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
    }
}
