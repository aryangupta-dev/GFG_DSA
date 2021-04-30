/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/30/2021
 *   Time: 3:24 PM
 *   File: LeftSideOfTree.java
 */

package Tree;

import java.util.Deque;
import java.util.LinkedList;

public class LeftSideOfTree {
    public static void leftSide(Node root) {
        Deque<Node> object = new LinkedList<>();
        object.add(root);
        while (!object.isEmpty()) {
            int count = object.size();
            for (int i = 0; i < count; i++) {
                Node current = object.poll();
                if (i == 0) {
                    System.out.print(current.data + " ");
                }
                if (current.left != null) {
                    object.add(current.left);
                }
                if (current.right != null) {
                    object.add(current.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node obj = new Node(10);
        obj.left = new Node(20);
        obj.left.left = new Node(30);
        obj.right = new Node(40);
        obj.left.right = new Node(50);
        obj.right.left = new Node(60);
        leftSide(obj);
    }
}
