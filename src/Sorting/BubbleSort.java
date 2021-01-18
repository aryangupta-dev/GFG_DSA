/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 1/18/2021
 *   Time: 8:05 PM
 *   File: BubbleSort.java
 */

package Sorting;

public class BubbleSort {
    static void func(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int a = 0;
                if (arr[i] < arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        System.out.println("-------After sorting----------");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("----Before sorting---- ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        func(arr);
    }
}
