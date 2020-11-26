/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/26/2020
 *   Time: 11:39 PM
 *   File: Insert.java
 */

package Arrays;

import java.util.Scanner;

public class Insert {
    static int insert(int[] arr, int n, int capabilitiy, int noToInsert, int pos) {
        if (capabilitiy == n) {
            return n;
        }
        int index = pos - 1;
        for (int i = n - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = noToInsert;
        return n + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size - 2; i++) {
            arr[i] = sc.nextInt();
        }
        int noToInsert = sc.nextInt();
        int pos = sc.nextInt();
        size = insert(arr, size - 2, size, noToInsert, pos);
        for (int a :
                arr) {
            System.out.println(a);
        }
    }

}