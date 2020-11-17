/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/17/2020
 *   Time: 11:27 PM
 *   File: PallindromeString.java
 */

package Recursion;


public class PallindromeString {
    static boolean pallindrome(String str, int start, int end) {
        if (start == end)
            //if both are at same index then
            // it will return true as it traverse from the whole string
            return true;
        //recursion and checking occuring.
        return (str.charAt(start) == str.charAt(end)) && pallindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "radar";
        String anotherString = "JINKS";
        System.out.println(pallindrome(str, 0, str.length() - 1));
        System.out.println(pallindrome(anotherString, 0, anotherString.length() - 1));
    }
}