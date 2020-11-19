/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/19/2020
 *   Time: 11:24 PM
 *   File: Josephus.java
 */

package Recursion;

public class Josephus {
    static int calculate(int n, int kill) {
        if (n == 1)
            return 0;
        return (calculate(n - 1, kill) + kill) % n;
    }

    public static void main(String[] args) {
        System.out.println(calculate(5, 3));
    }
}