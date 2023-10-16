package org.example.leetcode;

import java.util.Arrays;

public class LeetCode70 {

    public static void main(String[] args) {
        System.out.println(climbStairs(9));
    }

    static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);


        return climbdp(n, dp);
    }

    static int climbdp(int n, int[] dp) {

        if (n <= 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = climbdp(n - 1, dp) + climbdp(n - 2, dp);
        return dp[n];
    }
}
