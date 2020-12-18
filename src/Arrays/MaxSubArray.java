/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/18/2020
 *   Time: 8:00 PM
 *   File: MaxSubArray.java
 */

package Arrays;

public class MaxSubArray {
    static int maxSum(int arr[], int n) {
        int res = arr[0];

        for (int i = 0; i < n; i++) {
            int curr = 0;

            for (int j = i; j < n; j++) {
                curr = curr + arr[j];

                res = Math.max(res, curr);
            }
        }

        return res;
    }


    public static void main(String args[]) {
        int arr[] = {1, -2, 3, -1, 2}, n = 5;

        System.out.println(maxSum(arr, n));

    }

}