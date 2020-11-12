/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/12/2020
 *   Time: 11:47 PM
 *   File: PrintNto1.java
 */

package Recursion;

public class PrintNto1 {
    static void gprint(int n) {
        if (n > 0) {
            System.out.println(n);
            gprint(n - 1);
        }
    }

    public static void main(String[] args) {
        gprint(5);
    }
}