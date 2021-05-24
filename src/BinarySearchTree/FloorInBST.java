/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/24/2021
 *   Time: 1:21 PM
 *   File: FloorInBST.java
 */

package BinarySearchTree;

import java.util.Scanner;

public class FloorInBST extends InsertInBinarytree {
    static int res = 0;

    public static int floor(Node root, int data) {
        while (root != null) {
            if (root.data == data) {
                res = root.data;
            } else if (root.data > data) {
                root = root.left;
            } else {
                res = root.data;
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
        System.out.println(floor(root, data));
    }
}
