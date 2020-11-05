/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/5/2020
 *   Time: 11:42 PM
 *   File: BrainAlgorithim.java
 */

package CheckTotalSetBit;

public class BrainAlgorithim {
    int res=0;
    public int checkSetBit(int n){
        while(n>0){
            n=n&n-1;
            res++;
        }
        return res;
    }
}