/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/17/2021
 *   Time: 2:58 PM
 *   File: KthSmallestElement.java
 */

package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//Considering element of the arrays are distinct to each others.
public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element of the array.");
            int no = sc.nextInt();
            arr[i] = no;
        }
        KthSmallestElement object = new KthSmallestElement();
        System.out.println("Enter kth digit to find the smallest at that position.");
        int k = sc.nextInt();
        int result = object.kthSmallestNo(arr, size, k);
        System.out.println(arr[result]);
    }

    public int kthSmallestNo(int[] arr, int size, int k) {
        int high = size - 1;
        int low = 0;
        while (low <= high) {
            int pivot = partitionOfTheArray(arr, low, high);
            if (pivot == k - 1) {
                return pivot;
            } else if (pivot > k - 1) {
                high = pivot - 1;
            } else {
                low = pivot + 1;
            }
        }
        return -1;
    }

    public int partitionOfTheArray(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low - 1;
        for (int j = low; j < arr.length; j++) {
            if (pivot > arr[j]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int last = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = last;

        return i + 1;
    }
}
