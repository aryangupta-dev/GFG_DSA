/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/22/2021
 *   Time: 11:57 AM
 *   File: DeleteNode.java
 */

package BinarySearchTree;

public class DeleteNode extends InsertInBinarytree {
    public static Node deleteNode(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data > data) {
            root.left = deleteNode(root.left, data);
        } else if (root.data < data) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.right == null) {
                return root.left;
            }
            if (root.left == null) {
                return root.right;
            } else {
                Node sucess = getSucessor(root);
                root.data = sucess.data;
                root.right = deleteNode(root.right, sucess.data);
            }
        }
        return root;
    }

    public static Node getSucessor(Node root) {
        Node current = root;
        current = current.right;
        while (current != null && current.right != null) {
            current = current.left;
        }
        return current;
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        root = deleteNode(root, 18);
        traversal(root);
    }
}
