/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/17/2021
 *   Time: 2:58 PM
 *   File: KthSmallestElement.java
 */

package Sorting;

import java.util.ArrayList;

//Considering element of the arrays are distinct to each others.
public class KthSmallestElement {
    public static void main(String[] args) {

    }

    public int kthSmallestNo(ArrayList<Integer> arr, int size, int k) {
        int high = size - 1;
        int low = 0;
        while (low <= high) {
            int pivot = partitionOfTheArray(arr, 0, high);
            if (pivot == k - 1) {
                return pivot;
            } else if (pivot > k) {
                low = pivot - 1;
            } else {
                low = pivot + 1;
            }
        }
        return -1;
    }

    public int partitionOfTheArray(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int last = 0;
        int i = low - 1;
        for (int j = 0; j < arr.size(); j++) {
            if (pivot > arr.get(j)) {
                i++;
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
            last = arr.get(high);
            arr.set(high, arr.get(i + 1));
            arr.set(i + 1, last);
        }
        return i + 1;
    }
}
