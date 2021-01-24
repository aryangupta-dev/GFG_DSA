/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 1/24/2021
 *   Time: 3:04 PM
 *   File: MergeSort.java
 */

package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int m = a.length;
        int n = b.length;
        while ((i < m) && (j < n)) {
            if (a[i] < b[j]) {
                System.out.println(a[i] + " ");
                i++;
            } else {
                System.out.println(b[j] + " ");
                j++;
            }
        }
        while (i < m) {
            System.out.println(a[i]);
            i++;
        }
        while (j < n) {
            System.out.println(b[j]);
            j++;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        int b[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100) + 1;
            b[i] = (int) (Math.random() * 10) + 1;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        merge(a, b);
    }
}
