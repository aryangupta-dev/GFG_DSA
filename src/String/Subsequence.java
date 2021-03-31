/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 3/31/2021
 *   Time: 11:09 AM
 *   File: Subsequence.java
 */

package String;

public class Subsequence {
    public static void main(String[] args) {
        Subsequence obj = new Subsequence();
        System.out.println(obj.checkSubsequence("abcde", "ace"));


    }

    boolean checkSubsequence(String str1, String str2) {
        int j = 0;
        for (int i = 0; i < str1.length() && j < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
        }
        return (j == str2.length());
    }
}
