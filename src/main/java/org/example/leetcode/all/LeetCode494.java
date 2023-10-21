package org.example.leetcode.all;

public class LeetCode494 {

    public static void main(String[] args) {

    }

    public int findTargetSumWays(int[] nums, int target, int index, int total, int n) {
        if (index == n) {
            return target == total ? 1 : 0;
        }

        return findTargetSumWays(nums, target, index + 1, total + nums[index], n) +
                findTargetSumWays(nums, target, index + 1, total - nums[index], n);
    }


}
