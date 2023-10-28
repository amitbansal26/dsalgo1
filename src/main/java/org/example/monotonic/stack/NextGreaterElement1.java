package org.example.monotonic.stack;

import java.util.*;

public class NextGreaterElement1 {





    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer>  ngrList = new ArrayList<>();
        Map<Integer, Integer> ngrMap = new HashMap<>();
        final Deque<Integer> stack = new ArrayDeque<>();
        for (var num:nums2) {
            while(!stack.isEmpty() && stack.peek()<num){
                ngrMap.put(stack.pop(), num);
            }
            stack.push(num);

        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = ngrMap.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }

}
