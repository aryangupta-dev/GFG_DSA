/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/14/2021
 *   Time: 3:03 PM
 *   File: QuickSort.java
 */

package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array. ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Enter the element of the array. ");
            arr[i] = sc.nextInt();
        }
        QuickSort obj = new QuickSort();
        System.out.println("Without sorting. ");
        obj.print(arr);
        obj.partition(arr, 0, size);
        System.out.println("After sorting.");
        obj.print(arr);
    }

    void partition(int[] arr, int low, int high) {
        if (low < high) {
            int p = quickSort(arr, low, high);
            partition(arr, low, p - 1);
            partition(arr, p + 1, high);

        }
    }

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
        arr[i + 1] = arr[arr.length - 1];
        arr[arr.length - 1] = last;
        return i + 1;
    }

    void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
