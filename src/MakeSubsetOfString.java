/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/16/2020
 *   Time: 11:43 PM
 *   File: MakeSubsetOfString.java
 */

public class MakeSubsetOfString {
    public static void main(String[] args) {
        String str = "abcde";//taing input of  the string.
        char[] ch = str.toCharArray();// converting it to character array to fetch char later.
        int n = str.length();//length of the string
        int totalSubset = (int) Math.pow(n, 2);
        for (int index = 0; index < totalSubset; index++) {
            System.out.print("{");
            for (int j = 0; j < n; j++) {
                if ((index & (1 << j)) > 0) {//assuming every string letter in the form og binary.
                    System.out.print(ch[j]);
                }
            }
            System.out.print("} ,");
        }
    }
}