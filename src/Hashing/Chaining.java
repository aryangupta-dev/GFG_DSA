/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/11/2021
 *   Time: 10:51 AM
 *   File: Chaining.java
 */

package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {
    int bucket = 9;
    ArrayList<LinkedList<Integer>> stack = new ArrayList<>();

    void insert(int key) {
        int res = key % bucket;
        stack.get(res).add(key);
        System.out.println("Inserted at index " + res);
    }

    void remove(int key) {
        int res = key % bucket;
        stack.get(res).remove((Integer) key);
        System.out.println("Deleted the key " + key);
    }
}
