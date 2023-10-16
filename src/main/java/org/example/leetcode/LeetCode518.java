package org.example.leetcode;

import java.util.Arrays;

public class LeetCode518 {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return change(amount, coins, 0, dp);
    }

    int change(int amount, int[] coins, int index, int[][] dp) {

        if (amount == 0) {
            return 1;
        }
        if (amount < 0 || index == coins.length) {
            return 0;

        }
        if (dp[index][amount] != -1) {
            return dp[index][amount];
        }
        dp[index][amount] = change(amount - coins[index], coins, index, dp) +
                change(amount, coins, index + 1, dp);

        return dp[index][amount];
    }
}
