/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/24/2020
 *   Time: 1:41 PM
 *   File: TowerOfHanoi.java
 */

package Recursion;

public class TowerOfHanoi {
    public static int z = 0;

    static int towerOfHanoi(int n, char a, char b, char c, int z) {
        if (n == 1) {
            z++;
            return z;
        }
        z = towerOfHanoi(n - 1, a, c, b, z);
        z++;
        z = towerOfHanoi(n - 1, b, a, c, z);
        return z;
    }

    public static void main(String[] args) {
        int n = 4;
        z = towerOfHanoi(n, 'A', 'B', 'C', z);
        System.out.println(z);
    }
}