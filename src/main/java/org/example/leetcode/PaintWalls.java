package org.example.leetcode;

public class PaintWalls {
    public static void main(String[] args) {
        PaintWalls paintWalls = new PaintWalls();
        int[] cost = new int[]{1, 2, 3, 2};
        int[] time = new int[]{1, 2, 3, 2};
        System.out.println(paintWalls.paintWalls(cost, time));
    }

    public int paintWalls(int[] cost, int[] time) {

        return solve(cost, time, cost.length, 0);

    }

    int solve(int[] cost, int[] time, int W, int i) {

        if (W <= 0) {
            return 0;
        }
        if (i >= cost.length) {
            return 5000000;
        }

        int wallPainted = cost[i] + solve(cost, time, W - time[i] - 1, i + 1);
        int willNotPainted = solve(cost, time, W, i + 1);
        return Math.min(wallPainted, willNotPainted);
    }
}
