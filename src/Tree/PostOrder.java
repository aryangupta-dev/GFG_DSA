/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/25/2021
 *   Time: 9:36 PM
 *   File: PostOrder.java
 */

package Tree;

public class PostOrder {
    public static void traversal(Node root) {
        if (root != null) {
            traversal(root.left);
            traversal(root.right);
            System.out.print(root.data + " ");
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
