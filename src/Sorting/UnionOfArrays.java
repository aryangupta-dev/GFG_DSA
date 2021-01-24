/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 1/24/2021
 *   Time: 3:29 PM
 *   File: UnionOfArrays.java
 */

package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UnionOfArrays {
    public static void union(int[] a, int[] b) {
        ArrayList<Integer> obj = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            obj.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            obj.add(b[i]);
        }
        Collections.sort(obj);
        for (int i = 1; i < a.length + b.length; i++) {
            if (obj.get(i) != obj.get(i - 1)) {
                System.out.println(obj.get(i - 1) + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {4, 7, 1, 3, 0};
        int[] b = {8, 10, 4, 0, 2};
        Arrays.sort(a);
        Arrays.sort(b);
        union(a, b);

    }

}