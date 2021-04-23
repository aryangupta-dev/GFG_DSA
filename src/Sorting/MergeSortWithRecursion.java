/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/23/2021
 *   Time: 12:34 PM
 *   File: MergeSortWithRecursion.java
 */

package Sorting;

import java.util.Scanner;

public class MergeSortWithRecursion {
    int[] arr1;

    public MergeSortWithRecursion(int size) {
        arr1 = new int[size];
    }

    public static void main(String[] args) {
        MergeSortWithRecursion object = new MergeSortWithRecursion(6);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("element");
            arr[i] = sc.nextInt();
        }
        object.mergeSort(arr, 0, size - 1);
        for (int d : arr) {
            System.out.print(d + " ");
        }
    }

    public void mergeSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = lb + (ub - lb) / 2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }

    public void merge(int[] arr, int lb, int mid, int ub) {
        int n1 = mid - lb + 1;
        int n2 = ub - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[i + lb];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[i + mid + 1];
        }
        int i = 0;
        int j = 0;
        int k = lb;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i];
                i++;
            } else {
                arr[k++] = right[j];
                j++;
            }

        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
