/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 10/29/2020
 *   Time: 3:24 PM
 *   File: Efficient.java
 */

package TrailingZeroes;

import java.util.Scanner;

public class Efficient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countZero(n));

    }
    public static int countZero(int n){
        int res=0;
        for (int i = 5;i<=n ; i=i*5) {
          res=res+n/i;
        }
        return res;
    }
}