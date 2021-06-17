/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 6/17/2021
 *   Time: 12:57 PM
 *   File: BinaryHeap.java
 */

package Heap;

public class BinaryHeap {
    static class HeapFunction {
        int size;
        int capacity;
        int[] arr;

        public HeapFunction(int c) {
            size = 0;
            capacity = c;
            arr = new int[c];
        }

        public int left(int i) {
            return (2 * i) + 1;
        }

        public int right(int i) {
            return (2 * i) + 2;
        }

        public int parent(int i) {
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

        public void swap(int a, int b) {
            int temp = a;
            a = b;
            b = temp;
        }
    }
}
