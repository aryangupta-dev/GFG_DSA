/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/18/2021
 *   Time: 9:51 PM
 *   File: LowestCommonAncestor.java
 */

package Tree;

import java.util.ArrayList;

public class LowestCommonAncestor {
    public static boolean findpath(Node root, ArrayList<Node> arr, int v) {
        if (root == null) {
            return false;
        }
        arr.add(root);
        if (root.data == v) {
            return true;
        }
        if (findpath(root.left, arr, v) || findpath(root.right, arr, v)) {
            return true;
        }
        arr.remove(arr.size() - 1);
        return false;

    }

    public static Node lowestCommonAncestors(Node root, int v1, int v2) {
        if (root == null) {
            return null;

        }
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();
        if (!(!findpath(root, p1, v1) || findpath(root, p2, v2))) {
            return null;
        }
        for (int i = 0; i < p1.size() - 1 && i < p2.size() - 1; i++) {
            if (p1.get(i + 1) != p2.get(i)) {
                return p1.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        int n1 = 20, n2 = 50;
        System.out.println(lowestCommonAncestors(root, n1, n2).data);
    }
}
