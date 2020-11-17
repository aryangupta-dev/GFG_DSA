/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/17/2020
 *   Time: 11:57 PM
 *   File: SumOfDigits.java
 */

package Recursion;

public class SumOfDigits {
    static int sum(int n) {
        if (n < 10)
            return n;
        return n % 10 + sum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sum(253));
    }
}