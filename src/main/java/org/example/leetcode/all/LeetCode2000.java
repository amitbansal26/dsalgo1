package org.example.leetcode.all;

public class LeetCode2000 {
    public static void main(String[] args) {
        LeetCode2000 leetCode2000 = new LeetCode2000();
        System.out.println(leetCode2000.reversePrefix("abcdefd", 'd'));
    }
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int l = 0;
        int r = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                r = i;
                break;
            }
        }
        if (r > 0) {
            while (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        return String.valueOf(arr);
    }
}
