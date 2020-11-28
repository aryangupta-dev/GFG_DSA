/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/28/2020
 *   Time: 2:57 PM
 *   File: ReverseArray.java
 */

package Arrays;

public class ReverseArray {
    static void reverse(int[] arr) {
        int lowest = 0;
        int highest = arr.length - 1;
        while (lowest < highest) {
            int temp = arr[lowest];
            arr[lowest] = arr[highest];
            arr[highest] = temp;
            lowest++;
            highest--;
        }
    }
}