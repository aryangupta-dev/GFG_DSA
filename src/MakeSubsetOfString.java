/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/16/2020
 *   Time: 11:43 PM
 *   File: MakeSubsetOfString.java
 */

public class MakeSubsetOfString {
    public static void main(String[] args) {
        String str = "abcd";
        char[] ch = str.toCharArray();
        int n = str.length();
        int totalSubset = (int) Math.pow(n, 2);
        for (int index = 0; index < totalSubset; index++) {
            for (int j = 0; j < n; j++) {
                if ((index & (1 << j)) > 0) {
                    System.out.print(ch[j]);
                }
            }
            System.out.println();
        }
    }
}