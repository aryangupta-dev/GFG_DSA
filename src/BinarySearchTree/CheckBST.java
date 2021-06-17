/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 6/10/2021
 *   Time: 2:33 PM
 *   File: CheckBST.java
 */

package BinarySearchTree;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckBST {
    static ArrayList<Integer> obj = new ArrayList<>();

    static void fill(Node root) {
        if (root != null) {
            fill(root.left);
            obj.add(root.data);
            fill(root.right);
        }
    }

    static boolean check(ArrayList<Integer> o) {
        for (int i = 1; i < o.size(); i++) {
            if (o.get(i - 1) > o.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(10);
        fill(root);
        System.out.println(check(obj));

    }
}
