/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/25/2021
 *   Time: 9:31 PM
 *   File: PreOrder.java
 */

package Tree;

public class PreOrder {
    public static void traversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            traversal(root.left);
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
