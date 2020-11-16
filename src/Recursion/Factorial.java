/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/13/2020
 *   Time: 11:42 PM
 *   File: Factorial.java
 */

package Recursion;

import java.util.Scanner;

public class Factorial {
    static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}