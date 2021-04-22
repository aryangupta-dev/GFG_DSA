/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/22/2021
 *   Time: 8:59 PM
 *   File: MaximumSubarraySum.java
 */

package Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumSubarraySum {
    static void maxSum(int[] arr, int n, int k) {
        Deque<Integer> obj = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while ((!obj.isEmpty()) && (arr[i] >= arr[obj.peekLast()])) {
                obj.removeLast();
            }
            obj.add(i);
        }
        for (int i = k; i < n; i++) {
            System.out.println(arr[obj.peek()] + " ");

            while ((!obj.isEmpty()) && obj.peek() <= i - k)
                obj.removeFirst();


            while ((!obj.isEmpty()) && arr[i] >= arr[obj.peekLast()])
                obj.removeLast();


            obj.addLast(i);
        }
        System.out.println(arr[obj.peek()]);
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 7, 9, 4};
        maxSum(arr, arr.length, 3);
    }
}