/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/21/2021
 *   Time: 9:38 PM
 *   File: InsertInBinarytree.java
 */

package BinarySearchTree;

import Tree.*;

import java.util.Scanner;

public class InsertInBinarytree extends PreOrder {
    public static Node insert(Node root, int data) {
        Node obj = new Node(data);
        if (root == null) {
            root = obj;
            return root;
        } else if (root.data < data) {
            root.right = insert(root.right, data);
        } else if (root.data > data) {
            root.left = insert(root.left, data);
        }
        return root;
    }

    public static void traversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            traversal(root.left);
            traversal(root.right);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNode = sc.nextInt();
        Node root = null;
        while (totalNode-- > 0) {
            int data = sc.nextInt();

            root = insert(root, data);
        }
        traversal(root);

    }
}
