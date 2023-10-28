package org.example.recursion;

// Steps Allowed

import java.util.Arrays;

// 1. Stair at a time
// 2. Stair at a time
// Find number of ways to reach destination stairs
public class ClimbStairs {
    public static void main(String[] args) {
        // f(n) = f(n-1) + f(n-2)
        int[] dp = new int[301];
        Arrays.fill(dp, -1);
        //System.out.println(climbStairs(30, dp));
        System.out.println(climbStairsWithK(13, new int[]{5,5,2,4,1,5,9,8,6,3,8,9,1}));
    }


    static int climbStairs(int n, int[] dp) {
        if (n == 0 || n == 1) {
            dp[n] = 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return climbStairs(n - 1, dp) + climbStairs(n - 2, dp);
    }
    static int climbStairsWithK(int n, int[] k ) {
       int[] dp = new int[n+1];
       dp[n]=1;
        for (int i = n-1; i >= 0; i--) {
            for (int j = 1; j <=k[i] && i+j<dp.length; j++) {
                dp[i] = dp[i] + dp[i + j];
            }
            System.out.println(dp[i]);
        }
        return dp[0];
    }
}
