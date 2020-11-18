/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/18/2020
 *   Time: 11:29 PM
 *   File: CodingRod.java
 */

package Recursion;

public class CodingRod {
    static int maxcuts(int rodLen, int firstCut, int secondCut, int thirdCut) {
        if (rodLen == 0)
            return 0;
        if (rodLen <= -1)
            return -1;
        int res = Math.max(maxcuts(rodLen - firstCut, firstCut, secondCut, thirdCut),
                Math.max(maxcuts(rodLen - secondCut, firstCut, secondCut, thirdCut),
                        maxcuts(rodLen - thirdCut, firstCut, secondCut, thirdCut)));
        if (res == -1)
            return -1;
        return res + 1;
    }

    public static void main(String[] args) {
        System.out.println(maxcuts(5, 2, 5, 1));
    }
}