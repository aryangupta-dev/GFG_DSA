/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/6/2020
 *   Time: 5:40 PM
 *   File: MoveArrayByD.java
 */

package Arrays;

import java.util.Scanner;

public class MoveArrayByD {
    static void byD(int[] arr, int n, int d) {
        if (d > n) {
            d = d / n;
        }
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 6, 7, 1, 9, 3, 7, 6, 4, 9};
        int d = sc.nextInt();
        byD(arr, arr.length, d);

    }
}