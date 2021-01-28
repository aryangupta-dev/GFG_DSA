/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 1/28/2021
 *   Time: 8:02 PM
 *   File: Lamuto.java
 */

package Sorting;

public class Lamuto {
    static void lamuto(int[] arr) {
        int pivot = arr[arr.length - 1];
        int l = 0;
        int i = l - 1;
        int last = 0;
        for (int j = l; j < arr.length; j++) {
            if (arr[j] < pivot) {
                i++;
                int c = 0;
                c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
            }
        }
        last = arr[i + 1];
        arr[i + 1] = pivot;
        arr[arr.length - 1] = last;

        for (int k : arr) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        int[] arr = {50, 80, 40, 10, 20, 90, 70};
        lamuto(arr);
    }
}
