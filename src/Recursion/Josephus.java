/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/19/2020
 *   Time: 11:24 PM
 *   File: Josephus.java
 */

package Recursion;

public class Josephus {
    /*
     * circular program in which remove the kth person and make the array circular again
     * with kth +1 as first person.
     * */
    static int calculate(int n, int kill) {
        if (n == 1)//base case when there is only one person left
            return 0;
        //+ kill because after to rotate the persons and make the kth +1 at zero index.
        //%n bcz after adding a k it can be more than n .
        return (calculate(n - 1, kill) + kill) % n;
    }

    public static void main(String[] args) {
        System.out.println(calculate(5, 3));
    }
}