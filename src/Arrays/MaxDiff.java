/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/10/2020
 *   Time: 7:59 PM
 *   File: MaxDiff.java
 */

package Arrays;

public class MaxDiff {
    static int maxDiff(int[] arr, int n) {
        int res = arr[1] - arr[0], min = arr[0];
        for (int i = 2; i < arr.length; i++) {
            res = Math.max(res, arr[i] - arr[i - 1]);
            min = Math.min(min, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 8, 6, 1, 5};
        System.out.println(maxDiff(arr, arr.length));
    }
}