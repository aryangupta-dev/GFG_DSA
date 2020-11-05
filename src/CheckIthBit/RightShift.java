/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/5/2020
 *   Time: 3:27 PM
 *   File: RightShift.java
 */

package CheckIthBit;

public class RightShift {
    public void checkKthBit(int n,int k ){
        if(((n>>(k-1))&1)==1){
            System.out.println("It's "+k+"bit is set.");
        }
        else{
            System.out.println("It's "+k+"bit is not set");
        }
    }
}