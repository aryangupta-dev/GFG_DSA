/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 10/29/2020
 *   Time: 3:01 PM
 *   File: SimpleCode.java
 */

package TrailingZeroes;

import java.util.Scanner;

public class SimpleCode {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int factNo=sc.nextInt();
        System.out.println(countZeros(factNo));
    }
    public static int countZeros(int factNo){
        int fact=1;
        for(int i=2;i<=factNo;i++){
            fact=fact*i;
    }
        int res=0;
        while(fact%10==0){
            res++;
            fact=fact/10;

        }
        return res;
}
}
