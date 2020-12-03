/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/3/2020
 *   Time: 4:16 PM
 *   File: Efficient.java
 */

package Arrays.MoveZeroes;

public class Efficient {
    static int[] moveToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 0, 7, 9, 0};
        arr = moveToEnd(arr);
        for (int a :
                arr) {
            System.out.println(a);
        }
    }
}