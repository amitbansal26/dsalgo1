package org.example.leetcode.all;

public class LeetCode983 {
    public static void main(String[] args) {

    }

    public int mincostTickets(int[] days, int[] costs, int d, int[] dp) {
        if (d >= days.length) {
            return 0;
        }
        if (dp[d] != -1) {
            return dp[d];
        }
        // 1 day pass
        int onedayPass = mincostTickets(days, costs, d + 1, dp) + costs[0];
        int i;
        for (i = d; i < days.length; i++) {
            if (days[i] >= days[d] + 7)
                break;
        }
        int sevenDayPass = mincostTickets(days, costs, i, dp) + costs[1];
        for (i = d; i < days.length; i++) {
            if (days[i] >= days[d] + 30)
                break;
        }
        int thirtyDayPass = mincostTickets(days, costs, i, dp) + costs[2];
        dp[d] = Math.min(onedayPass, Math.min(sevenDayPass, thirtyDayPass));
        return dp[d];
    }
}
