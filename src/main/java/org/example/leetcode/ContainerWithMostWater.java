package org.example.leetcode;

public class ContainerWithMostWater {

    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {

        int leftPtr = 0;
        int res =0;
        int rightPtr = height.length -1;
        while(leftPtr<rightPtr){
            int area = (rightPtr -leftPtr) * Math.min(height[leftPtr], height[rightPtr]);
            res = Math.max(area, res);
            if (height[leftPtr] <height[rightPtr]){
                leftPtr++;
            }else {
                rightPtr--;
            }
        }
        return res;
    }
}
