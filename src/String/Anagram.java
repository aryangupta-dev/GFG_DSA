/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 3/31/2021
 *   Time: 11:36 AM
 *   File: Anagram.java
 */

package String;

public class Anagram {
    static int Chaar = 256;

    static boolean anagram(String s1, String s2) {
        int[] arr = new int[Chaar];
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(Anagram.anagram("AAbacy", "AAAbacy"));
    }
}
