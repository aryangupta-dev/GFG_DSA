/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/6/2020
 *   Time: 6:02 PM
 *   File: Leaders.java
 */

package Arrays;

public class Leaders {
    static void leaders(int arr[], int n) {
        System.out.println(arr[n - 1]);
        int curr = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > curr) {
                System.out.println(arr[i]);
                curr = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 4, 6, 2, 3};
        leaders(arr, arr.length);
    }
}