/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/11/2020
 *   Time: 3:24 PM
 *   File: StockBuySell.java
 */

package Arrays;

public class StockBuySell {
    static int profit(int[] arr, int n) {
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] > 0) {
                profit = arr[i] - arr[i - 1] + profit;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 12};
        System.out.println(profit(arr, arr.length));
    }
}