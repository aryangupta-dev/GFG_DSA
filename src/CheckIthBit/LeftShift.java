/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/5/2020
 *   Time: 3:12 PM
 *   File: LeftShift.java
 */

package CheckIthBit;

public class LeftShift {
    public static void checkIthBit(int n,int k){
        if(((1<<(k-1))&n)!=0){
            System.out.println("It's "+k+"kth bit is set");
        }
        else
            System.out.println("It's "+k+"kth bit is not set");
    }
}