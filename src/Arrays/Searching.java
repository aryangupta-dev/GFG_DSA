/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/26/2020
 *   Time: 11:34 PM
 *   File: Searching.java
 */

package Arrays;

import java.util.Scanner;

public class Searching {
    static boolean search(int[] arr, int noToFind) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == noToFind) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 5, 8, 977, 714};
        int noToFind = sc.nextInt();
        System.out.println(search(arr, noToFind));
    }
}