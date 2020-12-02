/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/2/2020
 *   Time: 11:49 AM
 *   File: Naive.java
 */

package Arrays.IsSorted;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Naive {
    static boolean isSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println("Is array sorted ??" + isSort(arr));
        for (int a :
                arr) {
            System.out.println(a);
        }
    }
}