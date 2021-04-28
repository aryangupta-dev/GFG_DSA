/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/28/2021
 *   Time: 11:05 AM
 *   File: LevelOrder.java
 */

package Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
// simply printing of all the nodes in a single line
public class LevelOrder {
    public static void traversal(Node root) {
        Deque<Node> object = new LinkedList<>();
        object.add(root);
        while (!object.isEmpty()) {
            Node current = object.poll();
            System.out.println(current.data);
            if (current.left != null)
                object.add(current.left);
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
