/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 4/11/2021
 *   Time: 10:51 AM
 *   File: Chaining.java
 */

package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Chaining {
    int bucket;
    ArrayList<LinkedList<Integer>> stack;

    public Chaining(int size) {
        this.bucket = size;
        stack = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < bucket; i++)
            stack.add(new LinkedList<Integer>());
    }


    void insert(int key) {
        int res = key % bucket;
        stack.get(res).add(key);
        System.out.println("Inserted at index " + res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the headers in the hashing");
        int size = sc.nextInt();
        Chaining object = new Chaining(size);
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the key value ");
            object.insert(sc.nextInt());
        }
        System.out.println("Enter the element to delete");
        object.remove(sc.nextInt());
        System.out.println("Enter the element to search ");
        boolean res = object.search(sc.nextInt());
        if (res) {
            System.out.println("Entered element founded ");
        } else {
            System.out.println("Element not founded");
        }


    }

    boolean search(int key) {
        int res = key % bucket;
        return stack.get(res).contains((Integer) key);
    }

    void remove(int key) {
        int res = key % bucket;
        boolean result = stack.get(res).remove((Integer) key);
        if (result) {
            System.out.println("Deleted the key " + key);
        } else {
            System.out.println("Not find that ");
        }
    }


}
