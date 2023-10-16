package org.example.leetcode;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(trap(height));

    }

    static int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int lm = height[left];
        int rm = height[right];
        int res = 0;
        while (left < right) {
            if (lm < rm) {
                left++;
                lm = Math.max(lm, height[left]);
                res = res + lm - height[left];
            } else {
                right--;
                rm = Math.max(rm, height[right]);
                res = res + rm - height[right];

            }
        }
        return res;
    }
}
