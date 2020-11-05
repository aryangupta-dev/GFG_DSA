/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/5/2020
 *   Time: 3:08 PM
 *   File: Naivemethod.java
 */

package CheckIthBit;

import java.util.Scanner;

public class Naivemethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LeftShift.checkIthBit(sc.nextInt(),sc.nextInt());
        RightShift object=new RightShift();
        object.checkKthBit(sc.nextInt(), sc.nextInt());

    }
}