package org.example.leetcode;

public class LeetCode1768 {
    public static void main(String[] args) {
        LeetCode1768 leetCode1768 = new LeetCode1768();
        System.out.println(leetCode1768.mergeAlternately("ab", "pqrs"));
    }

    public String mergeAlternately(String word1, String word2) {
        char[] arrWord1 = word1.toCharArray();
        char[] arrWord2 = word2.toCharArray();
        char[] arrWord3 = new char[word1.length() + word2.length()];
        int i = 0;
        int k = 0;
        int l = 0;
        for (i = 0, k = 0; i < arrWord1.length && k < arrWord2.length; i++, k++) {
            arrWord3[l++] = arrWord1[i];
            arrWord3[l++] = arrWord2[k];
        }
        while (i < arrWord1.length && l < arrWord3.length) {
            arrWord3[l++] = arrWord1[i++];
        }
        while (k < arrWord2.length && l < arrWord3.length) {
            arrWord3[l++] = arrWord2[k++];
        }
        return String.valueOf(arrWord3);
    }
}