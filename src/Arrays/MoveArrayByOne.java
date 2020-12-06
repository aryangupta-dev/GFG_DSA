/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/6/2020
 *   Time: 5:32 PM
 *   File: MoveArrayByOne.java
 */

package Arrays;

public class MoveArrayByOne {
    static void Byone(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 0, 1, 2, 4};
        Byone(arr, arr.length);

    }
}