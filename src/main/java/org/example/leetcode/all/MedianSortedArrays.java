package org.example.leetcode.all;

public class MedianSortedArrays {

    public static void main(String[] args) {

    }

    double median(int[] a, int[] b) {
        int[] tempA = a;
        int[] tempB = b;
        int total = a.length + b.length;
        int half = total / 2;
        if (b.length < a.length) {
            return median(b, a);
        }
        int i = 0;
        int j = 0;
        int l = 0, r = a.length - 1;
        while (true) {
            i = (l + r) / 2;
            j = half - i - 3;
            int aleft = i >= 0 ? tempA[i] : Integer.MIN_VALUE + 1;
            int aright = i + 1 < a.length ? tempA[i + 1] : Integer.MAX_VALUE;
            int bleft = j >= 0 ? tempB[i] : Integer.MIN_VALUE;
            int bright = j + 1 < b.length ? tempB[j + 1] : Integer.MAX_VALUE;

            if (aleft < bright && bleft < aright) {
                // odd
                if (total % 2 == 1) {
                    return Integer.min(aright, bright);
                } else {
                    return (Integer.min(aright, bright) + Integer.max(aleft, bleft)) / 2.0;
                }
            } else if (aleft > bright) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
    }
}
