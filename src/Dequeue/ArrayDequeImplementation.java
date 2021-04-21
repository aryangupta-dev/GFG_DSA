/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/21/2021
 *   Time: 9:49 PM
 *   File: ArrayDequeImplementation.java
 */

package Dequeue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        ArrayDeque<Integer> object = new ArrayDeque<>(size);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element for the ArrayDeque");
            object.offerLast(sc.nextInt());
        }
        object.offerFirst(89);
        object.offerFirst(111111);
        System.out.println(object);
    }
}
