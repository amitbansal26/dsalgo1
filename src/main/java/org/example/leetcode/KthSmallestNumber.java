package org.example.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestNumber {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int[] arr = new int[]{10, 5, 20, 4, 15};
        int n = 5, k = 5;
        System.out.println(getKthSmallestNumber(arr, n, k, pq));
    }


    static int getKthSmallestNumber(int[] arr, int n, int k, PriorityQueue<Integer> pq) {
        for (int i = 0; i < k; i++) {
            pq.offer(arr[i]);
        }
        for (int i = k; i < n; i++) {
            if (arr[i] < pq.peek()) {
                pq.poll();
                pq.offer(arr[i]);
            }

        }
        return pq.peek();
    }
}
