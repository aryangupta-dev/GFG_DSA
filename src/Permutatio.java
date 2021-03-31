/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 2/9/2021
 *   Time: 8:47 PM
 *   File: Permutatio.java
 */

class Permutatio {
    public static void main(String[] args) {
        int[] str = {1, 2, 3};
        int n = str.length;
        Permutatio permutation = new Permutatio();
        permutation.permute(str, 0, n - 1);
    }

    public void permute(int[] str, int l, int r) {
        if (l == r) {
            for (int a : str) {
                System.out.print(a + " ");
            }
            System.out.println();
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public int[] swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}

