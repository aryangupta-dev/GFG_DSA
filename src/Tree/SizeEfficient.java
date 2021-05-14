/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/14/2021
 *   Time: 12:54 PM
 *   File: SizeEfficient.java
 */

package Tree;

public class SizeEfficient {
    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        Node current = root;
        int lh = 0;
        while (current != null) {
            lh++;
            current = current.left;
        }
        int rh = 0;
        while (current != null) {
            rh++;
            current = current.right;
        }
        if (lh == rh) {
            return (int) Math.pow(2, lh) - 1;
        } else {
            return 1 + size(root.left) + size(root.right);
        }
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println(size(root));
    }
}
