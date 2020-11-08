/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/8/2020
 *   Time: 7:14 PM
 *   File: Efficient.java
 */

package PowerOfTwo;

import java.util.Scanner;

public class Efficient {
    public static boolean isPow2(int n) {
        return ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPow2(sc.nextInt()));
    }
}