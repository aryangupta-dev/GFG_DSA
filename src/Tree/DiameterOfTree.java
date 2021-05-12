/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/11/2021
 *   Time: 10:41 AM
 *   File: DiameterOfTree.java
 */

package Tree;

public class DiameterOfTree {
    static int max = 0;

    public static int diameter(Node root) {
        if (root == null)
            return 0;
        int lh = diameter(root.left);
        int rh = diameter(root.right);
        max = Math.max(max, 1 + rh + lh);
        return Math.max(lh, rh) + 1;

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(60);
        root.right.left.left = new Node(50);
        root.right.right.right = new Node(70);
        diameter(root);
        System.out.println(max);
    }
}
