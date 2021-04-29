/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/29/2021
 *   Time: 4:01 PM
 *   File: MaxNodeTree.java
 */

package Tree;

public class MaxNodeTree {
    public static int maxNode(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maxNode(root.left), maxNode(root.right)));
    }

    public static void main(String[] args) {
        Node obj = new Node(10);
        obj.left = new Node(20);
        obj.left.left = new Node(30);
        obj.right = new Node(40);
        obj.left.right = new Node(50);
        obj.right.left = new Node(60);
        System.out.println(maxNode(obj));
    }
}