/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/24/2021
 *   Time: 2:16 PM
 *   File: CeilInBst.java
 */

package BinarySearchTree;

import java.util.Scanner;

import static BinarySearchTree.InsertInBinarytree.insert;

public class CeilInBst {
    static int res;

    public static int ceil(Node root, int data) {
        while (root != null) {
            if (root.data == data) {
                res = root.data;
            } else if (root.data > data) {
                res = root.data;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int noOfNodes = sc.nextInt();
        while (noOfNodes-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int data = sc.nextInt();
        System.out.println(ceil(root, data));
    }
}
