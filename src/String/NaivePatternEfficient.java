/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/2/2021
 *   Time: 8:28 PM
 *   File: NaivePatternEfficient.java
 */

package String;

public class NaivePatternEfficient {
    public static void main(String[] args) {
        String text = "geeksforgeeks";
        String pattern = "eks";
        for (int i = 0; i <= text.length() - pattern.length(); ) {
            int j;
            for (j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == pattern.length()) {
                System.out.println(i);
            }
            if (j == 0) {
                i++;
            } else {
                i = i + j;
            }
        }
    }
}
