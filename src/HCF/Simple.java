/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/7/2020
 *   Time: 12:01 AM
 *   File: Simple.java
 */

package HCF;

public class Simple {
    public static int hcfNo(int a,int b){
        int lowerNo=Math.min(a,b);
        while(lowerNo>0){
            if(a%lowerNo==0&&b%lowerNo==0){
                break;
            }
            lowerNo--;
        }
        return lowerNo;
    }
}