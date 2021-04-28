/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/28/2021
 *   Time: 11:46 AM
 *   File: Method2LevelLineByLine.java
 */

package Tree;

import java.util.Deque;
import java.util.LinkedList;

public class Method2LevelLineByLine {
    public static void traversal(Node root) {
        Deque<Node> object = new LinkedList<>();
        object.add(root);
        object.add(null);
        while (object.size() > 1) {
            Node current = object.poll();
            if (current == null) {
                System.out.println();
                object.add(null);
                continue;
            }
            System.out.print(current.data + " ");
            if (current.left != null) {
                object.add(current.left);
            }
            if (current.right != null) {
                object.add(current.right);
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
        traversal(obj);
    }
}
