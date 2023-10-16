package org.example.leetcode;

public class LeetCode942 {

    public int[] diStringMatch(String s) {
      int arr[] = new int[s.length() + 1];
      int l=0,r=s.length();
        for (int i = 0; i <s.length() ; i++) {
            arr[i] = s.charAt(i) == 'I' ? l++: r--;
        }
        arr[s.length()] = l;
        return arr;
    }
}
