/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/25/2021
 *   Time: 9:22 PM
 *   File: Inorder.java
 */

package Tree;

public class Inorder {
    public static void traversal(Node root) {
        if (root != null) {
            traversal(root.left);
            System.out.print(root.data + " ");
            traversal(root.right);
        }
    }

    public static void main(String[] args) {
        Node obj = new Node(10);
        obj.left = new Node(20);
        obj.left.left = new Node(30);
        obj.right = new Node(40);
        obj.left.right = new Node(50);
        obj.right.left = new Node(60);
    }
}
