/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/18/2021
 *   Time: 10:37 PM
 *   File: CompleteNodes.java
 */

package Tree;

public class CompleteNodes {
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = 0;
        Node current = root;
        while (current != null) {
            current = current.left;
            lh++;
        }
        current = root;
        int rh = 0;
        while (current != null) {
            current = current.right;
            rh++;
        }
        if (lh == rh) {
            return (int) Math.pow(2, lh) - 1;
        }
        return 1 + count(root.left) + count(root.right);
    }

    public static void main(String[] args) {


        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println(count(root));
    }
}
