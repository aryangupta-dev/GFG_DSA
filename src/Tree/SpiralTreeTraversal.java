/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/7/2021
 *   Time: 11:48 AM
 *   File: SpiralTreeTraversal.java
 */

package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpiralTreeTraversal {
    public static void spiralTraversal(Node root) {
        Queue<Node> object = new LinkedList<>();
        Stack<Integer> res = new Stack<>();
        boolean reverse = false;
        object.add(root);
        while (!object.isEmpty()) {
            int count = object.size();
            ;
            for (int i = 0; i < count; i++) {
                Node current = object.poll();
                if (reverse) {
                    res.push(current.data);
                } else {
                    System.out.print(current.data + " ");
                }
                if (current.left != null) {
                    object.add(current.left);
                }
                if (current.right != null) {
                    object.add(current.right);
                }
            }

            if (reverse) {
                while (!res.isEmpty()) {
                    System.out.print(res.pop() + " ");
                }
            }
            reverse = !reverse;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node obj = new Node(10);
        obj.left = new Node(20);
        obj.left.left = new Node(30);
        obj.right = new Node(40);
        obj.left.right = new Node(50);
        obj.right.left = new Node(60);
        spiralTraversal(obj);
    }
}
