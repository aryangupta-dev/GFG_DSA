/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/5/2020
 *   Time: 11:33 PM
 *   File: Main.java
 */

package CheckTotalSetBit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Simple obj=new Simple();
        System.out.println(obj.totalSetBits(sc.nextInt()));
    }
}