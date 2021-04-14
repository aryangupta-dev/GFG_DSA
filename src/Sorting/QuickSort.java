/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/14/2021
 *   Time: 3:03 PM
 *   File: QuickSort.java
 */

package Sorting;

public class QuickSort {
    int quickSort(int[] arr, int low, int high) {
        int pivot = arr[arr.length - 1];
        int i = low - 1;
        int last = 0;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int v = arr[i];
                arr[i] = arr[j];
                arr[j] = v;
            }
        }
        last = arr[i + 1];
        arr[i + 1] = pivot;
        arr[arr.length - 1] = last;
        return i + 1;
    }

    void partition(int[] arr) {

    }
}
