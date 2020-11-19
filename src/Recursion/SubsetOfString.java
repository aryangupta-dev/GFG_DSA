/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/19/2020
 *   Time: 12:12 AM
 *   File: SubsetOfString.java
 */

package Recursion;

public class SubsetOfString {
    static void subset(String str, String curr, int index) {
        if (index == str.length()) {
            System.out.print(curr + "");
            return;
        }
        subset(str, curr, index++);
        subset(str, curr + str.charAt(index), index++);

    }

    public static void main(String[] args) {
        subset("abc", "", 0);
    }
}