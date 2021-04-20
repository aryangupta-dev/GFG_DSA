/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/20/2021
 *   Time: 8:17 PM
 *   File: LoopFor.java
 */

package Sorting.TwoTypesOfElement;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoopFor object = new LoopFor();
        System.out.println("Enter the size of the array. ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element for the array.");
            arr[i] = sc.nextInt();
        }
        arr = object.implemented(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public int[] implemented(int[] arr) {
        int i = -1;
        int[] temp = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                i++;
                temp[i] = arr[j];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                i++;
                temp[i] = arr[j];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = temp[j];
        }
        return arr;
    }
}
