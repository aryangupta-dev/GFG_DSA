/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/17/2021
 *   Time: 11:19 PM
 *   File: ChocolateProblem.java
 */

package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Collections.sort;

public class ChocolateProblem {
    public int minDifference(ArrayList<Integer> arr, int n, int m) {
        if (m > n) {
            return -1;
        }
        sort(arr);
        int res = arr.get(m - 1) - arr.get(0);
        for (int i = 0; i < n - m - 1; i++) {
            int temp = arr.get(i + m - 1) - arr.get(i);
            res = Math.min(temp, res);
        }
        return res;
    }
}
