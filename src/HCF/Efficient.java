/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/7/2020
 *   Time: 11:37 AM
 *   File: Efficient.java
 */

package HCF;

public class Efficient {
    public static int hcfNo(int a,int b) {
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
return a;
    }
}