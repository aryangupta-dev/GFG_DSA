/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/3/2021
 *   Time: 11:02 PM
 *   File: IsBalanced.java
 */

package Tree;

//Balance tree is checking of tree is it is balance or not if it os balanced (left right is equal or less than by one )
//print the height of the tree.
public class IsBalanced {
    public static int check(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = check(root.left);
        if (lh == -1)
            return -1;
        int rh = check(root.right);
        if (rh == -1)
            return -1;
        if (Math.abs(lh - rh) > 1) {
            return -1;
        } else
            return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(19);
        root.left = new Node(51);
        root.right = new Node(60);
        root.right.left = new Node(15);
        root.right.right = new Node(20);
        System.out.println(check(root));
    }
}
