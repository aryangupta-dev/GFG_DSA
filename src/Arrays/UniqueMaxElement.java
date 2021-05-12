/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 5/12/2021
 *   Time: 11:14 PM
 *   File: UniqueMaxElement.java
 */

package Arrays;

import java.util.*;

public class UniqueMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int n = sc.nextInt();
        int m = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            deque.add(c);
            set.add(c);
            if (deque.size() == m) {
                if (set.size() > max) {
                    max = set.size();
                }
                int first = deque.remove();
                if (!deque.contains(first)) {
                    set.remove(first);
                }
            }

        }


        System.out.println(max);


    }
}
