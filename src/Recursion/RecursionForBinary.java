/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/11/2020
 *   Time: 11:31 PM
 *   File: RecursionForBinary.java
 */

package Recursion;

public class RecursionForBinary {
    static void binaryNO(int n) {
        if (n >= 1) {
            binaryNO(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        /*
         * program to print the binary of the number.*/
        binaryNO(9);
    }
}