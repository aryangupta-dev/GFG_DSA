/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/11/2020
 *   Time: 11:05 PM
 *   File: Log2nByRecursion.java
 */

package Recursion;

public class Log2nByRecursion {
    static int find(int n) {
        if (n == 1)//here if you want with base 2 make it (n<3). :/
            return 0;
        else
            return 1 + find(n / 2);
    }

    public static void main(String[] args) {
        /*
         * this is a program of log which have base 2
         * if you want to find it with other bases, just change the condition of line 12 */
        System.out.println(find(32));
    }
}