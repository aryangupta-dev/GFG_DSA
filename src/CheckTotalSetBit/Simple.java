/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/5/2020
 *   Time: 11:25 PM
 *   File: Simple.java
 */

package CheckTotalSetBit;

public class Simple {
    public int totalSetBits(int n){
        int res=0;
        while(n>0){
            if((n&1)==1){
                res++;
            }
            n=n>>1;
        }
        return res;
    }
}