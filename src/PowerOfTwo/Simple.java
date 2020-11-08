/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/8/2020
 *   Time: 6:34 PM
 *   File: Simple.java
 */

package PowerOfTwo;

import java.util.Scanner;

public class Simple {
    static boolean isPowerTwo(int n){
        if(n<=0)
            return false;
        while(n!=1){
            if(n%2!=0){
                return false;
            }n=n/2;
        }return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(isPowerTwo(sc.nextInt()));
    }
}