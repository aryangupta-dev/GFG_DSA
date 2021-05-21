/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/20/2021
 *   Time: 10:46 AM
 *   File: SearchInBinaryTree.java
 */

package BinarySearchTree;


public class SearchInBinaryTree {
    public static boolean search(Node root, int no) {
        if (root == null) {
            return false;
        }
        if (root.data == no) {
            return true;
        } else if (no < root.data) {
            return search(root.left, no);
        } else {
            return search(root.right, no);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int no = 11;
        if (search(root, no)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
