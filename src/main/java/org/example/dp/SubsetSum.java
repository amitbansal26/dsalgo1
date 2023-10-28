package org.example.dp;

// if subset is present or not

import java.util.Arrays;

/**
 * Given a set of non-negative integers and a value sum,
 * the task is to check if there is a subset of the given set whose sum is equal to the given sum.
 * Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
 * Output: True
 * Explanation: There is a subset (4, 5) with sum 9.
 * <p>
 * Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 30
 * Output: False
 * Explanation: There is no subset that add up to 30.
 */
public class SubsetSum {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(subSetSumRecursive(arr, sum, arr.length));
        int [][] dp = new int[arr.length+1][sum+1];

        Arrays.stream(dp).forEach(i -> Arrays.fill(i, -1));
        subSetSumMemo(arr, sum, arr.length, dp);

    }


    static boolean subSetSumRecursive(int[] arr, int sum, int n) {
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }

        if ((arr[n - 1] <= sum)) {
            return (subSetSumRecursive(arr, sum - arr[n - 1], n - 1) ||
                    subSetSumRecursive(arr, sum, n - 1));
        } else {
            return subSetSumRecursive(arr, sum, n - 1);
        }
    }

    static boolean subSetSumMemo(int[] arr, int sum, int n, int[][]dp) {
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }



        if ((arr[n - 1] <= sum)) {
            return (subSetSumRecursive(arr, sum - arr[n - 1], n - 1) ||
                    subSetSumRecursive(arr, sum, n - 1));
        } else {
            return subSetSumRecursive(arr, sum, n - 1);
        }
    }
}
