/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/23/2021
 *   Time: 11:01 PM
 *   File: FirstCircularTour.java
 */

package Dequeue;

import java.util.Scanner;

public class FirstCircularTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] petrol = new int[n];
        int[] distance = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("petrol from the petrol pump");
            petrol[i] = sc.nextInt();
            System.out.println("distance to the next petrol pump");
            distance[i] = sc.nextInt();
        }
        FirstCircularTour object = new FirstCircularTour();
        System.out.println(object.check(petrol, distance));


    }

    public int check(int[] petrol, int[] distance) {
        for (int i = 0; i < petrol.length; i++) {
            int end = i;
            int currentPetrol = 0;
            while (true) {
                currentPetrol += petrol[end] - distance[end];
                if (currentPetrol < 0) {
                    break;
                } else {
                    end = (end + 1) % petrol.length;
                    if (end == i) {
                        return i + 1;
                    }
                }
            }
        }
        return -1;
    }
}
