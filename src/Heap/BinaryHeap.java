/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 6/17/2021
 *   Time: 12:57 PM
 *   File: BinaryHeap.java
 */

package Heap;

public class BinaryHeap {
    public static void main(String[] args) {
        HeapFunction h = new HeapFunction(11);
        h.insert(3);
        h.insert(2);
        h.insert(15);
        h.insert(20);
        System.out.println(h.extractMin());
    }

    static class HeapFunction {
        int size;
        int capacity;
        int[] arr;

        public HeapFunction(int c) {
            size = 0;
            capacity = c;
            arr = new int[c];
        }

        public static int left(int i) {
            return (2 * i) + 1;
        }

        public static int right(int i) {
            return (2 * i) + 2;
        }

        public static int parent(int i) {
            return (i - 1) / 2;
        }

        public void insert(int x) {
            if (size == capacity) {
                return;

            }
            size++;
            arr[size - 1] = x;
            for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i]; ) {
                swap(arr[parent(i)], arr[i]);
                i = parent(i);
            }
        }

        public void heapify(int c) {
            int lt = left(c);
            int rt = right(c);
            int smallest = c;
            if (lt < size && arr[lt] < arr[c]) {
                smallest = lt;
            }
            if (rt < size && arr[smallest] > arr[rt]) {
                smallest = rt;
            }
            if (c != smallest) {
                swap(arr[smallest], arr[c]);
                heapify(smallest);
            }
        }

        public int extractMin() {
            if (size == 0) {
                return Integer.MAX_VALUE;
            } else if (size == 1) {
                size--;
                return arr[size];
            } else {
                int temp = arr[size - 1];
                arr[size - 1] = arr[0];
                arr[0] = temp;
                size--;
                heapify(0);
                return arr[size];
            }

        }

        public void swap(int a, int b) {
            int temp = a;
            a = b;
            b = temp;
        }
    }
}
