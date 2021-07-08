/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 7/8/2021
 *   Time: 8:22 PM
 *   File: DfsDisconnected.java
 */

package Graph;

import java.util.ArrayList;

public class DfsDisconnected {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(v);
    }

    public static void DfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.println(s);
        for (int a : adj.get(s)) {
            if (!visited[a]) {
                DfsRec(adj, a, visited);
            }
        }
    }

    public static void DfsTraverse(ArrayList<ArrayList<Integer>> adj, int v, int s) {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                DfsRec(adj, i, visited);
            }
        }

    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());


        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 3, 4);

        System.out.println("Following is Depth First Traversal: ");
        DfsTraverse(adj, V, 0);
    }
}
