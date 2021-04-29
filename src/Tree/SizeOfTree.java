/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/29/2021
 *   Time: 2:59 PM
 *   File: SizeOfTree.java
 */

package Tree;

public class SizeOfTree {
    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    public static void main(String[] args) {
        Node obj = new Node(10);
        obj.left = new Node(20);
        obj.left.left = new Node(30);
        obj.right = new Node(40);
        obj.left.right = new Node(50);
        obj.right.left = new Node(60);
        System.out.println(size(obj));
    }
}
