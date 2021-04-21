/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/21/2021
 *   Time: 9:28 PM
 *   File: DequeImplementation.java
 */

package Dequeue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> object = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the element for the dequeue");
            object.add(sc.nextInt());
        }
        object.offerFirst(5);
        object.removeLast();
        System.out.println(object);
    }
}
