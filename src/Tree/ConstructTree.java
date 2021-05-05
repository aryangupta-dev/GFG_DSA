/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/5/2021
 *   Time: 11:13 PM
 *   File: ConstructTree.java
 */

package Tree;

public class ConstructTree {
    static int preOrder = 0;

    public static Node construct(int[] in, int[] pre, int s, int e) {
        if (s > e) {
            return null;
        }
        Node root = new Node(pre[preOrder++]);
        int index = s;
        for (int i = s; i <= e; i++) {
            if (in[i] == root.data) {
                index = i;
                break;
            }
        }
        root.left = construct(in, pre, s, index - 1);
        root.right = construct(in, pre, index + 1, e);
        return root;
    }

    public static void main(String[] args) {
        int[] in = {20, 10, 40, 30, 50};
        int[] pre = {10, 20, 30, 40, 50};
        Node result = construct(in, pre, 0, in.length - 1);
        inOrder(result);

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
}
