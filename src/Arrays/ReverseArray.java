/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/28/2020
 *   Time: 2:57 PM
 *   File: ReverseArray.java
 */

package Arrays;

import java.util.Scanner;

public class ReverseArray {
    static void reverse(int[] arr) {
        int lowest = 0;
        int highest = arr.length - 1;
        while (lowest < highest) {
            int temp = arr[lowest];
            arr[lowest] = arr[highest];
            arr[highest] = temp;
            lowest++;
            highest--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        //actual array
        System.out.println("Actual array.");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        reverse(arr);
        System.out.println();
        System.out.println("Reversal array");
        //after reversal
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}