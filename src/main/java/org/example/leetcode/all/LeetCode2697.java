package org.example.leetcode.all;

public class LeetCode2697 {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {
            if (arr[left] == arr[right]) {
            } else {
                if (arr[left] < arr[right]) {
                    arr[right] = arr[left];
                } else {
                    arr[left] = arr[right];
                }
            }
            left++;
            right--;
        }
        return String.valueOf(arr);
    }
}
