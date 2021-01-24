/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 1/23/2021
 *   Time: 12:23 AM
 *   File: IntersecionOfArray.java
 */

package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class IntersecionOfArray {
    public static void intersection(ArrayList<Integer> arr1, ArrayList<Integer> array2) {
        int i = 0;
        int j = 0;
        while ((i < arr1.size()) && (j < array2.size())) {
            if (arr1.get(i) == array2.get(j)) {
                System.out.println(arr1.get(i));
                i++;
                j++;
            } else if (arr1.get(i) < array2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr1.add((int) (Math.random() * 10));
            array2.add((int) (Math.random() * 10));
        }
        Collections.sort(arr1);
        Collections.sort(array2);
        System.out.println(arr1);
        System.out.println(array2);
        intersection(arr1, array2);
    }

}
