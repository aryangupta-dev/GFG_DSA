/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/11/2020
 *   Time: 4:01 PM
 *   File: TrappingRainWater.java
 */

package Arrays;

public class TrappingRainWater {
    static int store(int[] arr, int n) {
        int res = 0;
        int[] rMax = new int[n];
        int[] lMax = new int[n];
        lMax[0] = arr[0];
        for (int i = 1; i < n - 1; i++) {
            lMax[i] = Math.max(lMax[i - 1], arr[i]);
        }
        rMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], arr[i]);
        }
        for (int i = 1; i < n - 1; i++) {
            res = res + Math.min(lMax[i], rMax[i]) - arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 0, 6, 2, 3};
        System.out.println(store(arr, arr.length));
    }
}