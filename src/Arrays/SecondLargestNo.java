/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/27/2020
 *   Time: 9:16 PM
 *   File: SecondLargestNo.java
 */

package Arrays;

public class SecondLargestNo {
    static int secondLargest(int arr[]) {
        int largest = greatest(arr);
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (largest != arr[i]) {
                if (res < arr[i]) {
                    res = arr[i];
                }
            }
        }
        return res;
    }

    static int greatest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }
}