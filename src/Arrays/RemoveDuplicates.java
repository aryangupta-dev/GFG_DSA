/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/28/2020
 *   Time: 3:18 PM
 *   File: RemoveDuplicates.java
 */

package Arrays;

import java.util.Scanner;

public class RemoveDuplicates {
    //it is an sorted array.
    //return no of elements remain in the array.
    static int remove(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[res - 1] != arr[i]) {
                arr[res - 1] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        int result = remove(arr);
        System.out.println(result);
    }

}