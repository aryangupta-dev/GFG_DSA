/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/4/2021
 *   Time: 10:08 PM
 *   File: TreeToDoublyLL.java
 */

package Tree;

public class TreeToDoublyLL {
    static DoublyNode previous = null;

    public static DoublyNode converter(DoublyNode root) {
        if (root == null) {
            return root;
        }
        DoublyNode head = converter(root.left);
        if (previous == null) {
            head = root;
        } else {
            root.left = previous;
            previous.right = root;
        }
        previous = root;
        converter(root.right);
        return head;
    }

    public static void main(String[] args) {
        DoublyNode object = new DoublyNode(10);
        object.left = new DoublyNode(20);
        object.right = new DoublyNode(30);
        object.right.left = new DoublyNode(40);
        object.right.right = new DoublyNode(50);
        DoublyNode head = converter(object);
        DoublyNode current = head;
        while (current.right != null) {
            System.out.println(current.data);
            current = current.right;
        }
        System.out.println(current.data);

    }
}
