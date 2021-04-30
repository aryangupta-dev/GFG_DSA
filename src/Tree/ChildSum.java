/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/30/2021
 *   Time: 3:49 PM
 *   File: ChildSum.java
 */

package Tree;

public class ChildSum {
    public static boolean check(Node root) {
        if (root == null) {
            return true;
        }
        if ((root.left == null) && (root.right == null)) {
            return true;
        }
        int sum = 0;
        if (root.left != null) {
            sum += root.left.data;
        }
        if (root.right != null) {
            sum += root.right.data;
        }
        return (sum == root.data && check(root.left) && check(root.right));
    }

    public static void main(String[] args) {
        Node obj = new Node(60);
        obj.left = new Node(40);
        obj.left.left = new Node(10);
        obj.right = new Node(20);
        obj.left.right = new Node(30);
        obj.right.left = new Node(20);
        System.out.println(check(obj));
    }

}
