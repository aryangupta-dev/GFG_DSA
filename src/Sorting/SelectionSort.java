/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 1/18/2021
 *   Time: 8:31 PM
 *   File: SelectionSort.java
 */

package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {

    static void func(int[] arr) {
        ArrayList obj = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            int smallest = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int a = 0;
                if (smallest > arr[j]) {
                    a = arr[j];
                    arr[j] = smallest;
                    smallest = a;

                }
            }
            obj.add(smallest);
        }
        System.out.println("----After sorting----");
        System.out.println(obj);
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("---Before sorting---");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        func(arr);
    }
}
