package org.example.leetcode;

public class LeetCode2108 {
    public static void main(String[] args) {
        LeetCode2108 leetCode2108 = new LeetCode2108();
        System.out.println(leetCode2108.firstPalindrome
                (new String[]{"abc", "car", "ada", "racecar", "cool"}));
    }

    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            char[] arr = words[i].toCharArray();
            int l = 0, r = arr.length - 1;
            String tempWord = words[i];
            while (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            if (tempWord.equals(String.valueOf(arr))) {
                return tempWord;
            }
        }
        return "";
    }
}
