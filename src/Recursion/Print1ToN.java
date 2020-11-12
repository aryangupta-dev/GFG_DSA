/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/12/2020
 *   Time: 11:28 PM
 *   File: Print1ToN.java
 */

package Recursion;

public class Print1ToN {
    static void gprint(int n, int k) {
        // this is a program by tail reecursion which is more effective in time complexity.
        if (n > 0) {
            System.out.println(k);
            gprint(n - 1, k + 1);
        }
    }

    public static void main(String[] args) {
        gprint(5, 1);
    }
}