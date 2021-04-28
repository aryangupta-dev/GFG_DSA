/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/28/2021
 *   Time: 12:09 PM
 *   File: Method3LineByLine.java
 */

package Tree;

import java.util.Deque;
import java.util.LinkedList;
//level traversal line by line

public class Method3LineByLine {
    public static void traversal(Node root) {
        Deque<Node> object = new LinkedList<>();
        object.add(root);
        while (!object.isEmpty()) {

            int count = object.size();
            for (int i = 0; i < count; i++) {
                Node current = object.poll();
                System.out.print(current.data + " ");
                if (current.left != null) {
                    object.add(current.left);
                }
                if (current.right != null) {
                    object.add(current.right);
                }
            }
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
        traversal(obj);
    }
}
