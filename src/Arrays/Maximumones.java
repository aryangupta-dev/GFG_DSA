/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/18/2020
 *   Time: 7:40 PM
 *   File: Maximumones.java
 */

package Arrays;

public class Maximumones {
    static int consiOne(int[] arr, int n) {
        int res = 0, curr = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                curr = 0;
            else {
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 1, 1};
        System.out.println(consiOne(arr, arr.length));
    }
}