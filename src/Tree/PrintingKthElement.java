/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/27/2021
 *   Time: 9:46 AM
 *   File: PrintingKthElement.java
 */

package Tree;

public class PrintingKthElement {
    public static void print(Node root, int k) {
        if (root == null) {
            return;
        } else if (k == 0) {
            System.out.println(root.data);
        } else {
            print(root.left, k - 1);
            print(root.right, k - 1);
        }
    }

    public static void main(String[] args) {
        Node obj = new Node(10);
        obj.left = new Node(20);
        obj.left.left = new Node(30);
        obj.right = new Node(40);
        obj.left.right = new Node(50);
        obj.right.left = new Node(60);
        print(obj, 3);
    }
}
