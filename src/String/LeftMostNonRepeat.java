/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/1/2021
 *   Time: 8:48 PM
 *   File: LeftMostNonRepeat.java
 */

package String;

import java.util.Arrays;

public class LeftMostNonRepeat {
    public static void main(String[] args) {
        int[] arr = new int[256];
        Arrays.fill(arr, -1);
        String str = "abab";
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int fre = arr[str.charAt(i)];
            if (fre == -1) {
                arr[str.charAt(i)] = i;
            } else {
                arr[str.charAt(i)] = -2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                res = Math.min(res, arr[i]);
            }
        }
        if (res == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }
    }
}
