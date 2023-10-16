package org.example.dp;

import java.util.Arrays;

/**
 * Given N items where each item has some weight and profit associated with it
 * and also given a bag with capacity W, [i.e., the bag can hold at most W weight in it].
 * The task is to put the items into the bag such that the
 * sum of profits associated with them is the maximum possible.
 */
public class KnapSack01 {
    /**
     * wt[] --> 1 3 4 5
     * val[] -->1 4 5 7
     * W: 7  max profit
     */
    static int[] wt = new int[]{1, 3, 5, 7};
    static int[] val = new int[]{1, 4, 5, 7};
    static int W = 4;
    static int[][] t = new int[wt.length + 1][W + 1];

    static {
        Arrays.stream(t).forEach(a -> Arrays.fill(a, -1));
    }


    public static void main(String[] args) {

        System.out.println(knapSackTopDown(wt, val, W, wt.length));
    }

    static int knapSack(int[] wt, int[] val, int W, int n) {
        // Base Condition
        if (n == 0 || W == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            return Integer.max(val[n - 1] + knapSack(wt, val, W - wt[n - 1], n - 1), knapSack(wt, val, W, n - 1));
        } else {
            return knapSack(wt, val, W, n - 1);
        }
    }

    static int knapSackmem(int[] wt, int[] val, int W, int n) {
        // Base Condition
        if (n == 0 || W == 0) {
            return 0;
        }
        if (t[n][W] != -1) {
            return t[n][W];
        }
        if (wt[n - 1] <= W) {
            t[n][W] = Integer.max(val[n - 1] + knapSack(wt, val, W - wt[n - 1], n - 1), knapSack(wt, val, W, n - 1));
        } else {
            t[n][W] = knapSack(wt, val, W, n - 1);
        }
        return t[n][W];
    }

    static int knapSackTopDown(int[] wt, int[] val, int W, int n) {
        // Initialize the DP matrix
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = Integer.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][W];
    }
}