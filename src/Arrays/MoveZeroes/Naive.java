/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/3/2020
 *   Time: 4:08 PM
 *   File: Naive.java
 */

package Arrays.MoveZeroes;

import java.sql.SQLOutput;

public class Naive {
    static int[] moveToEnd(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 6, 0, 7, 0};
        arr = moveToEnd(arr, arr.length);
        for (int a :
                arr) {
            System.out.println(a);
        }
    }
}