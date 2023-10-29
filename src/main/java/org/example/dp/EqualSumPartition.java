package org.example.dp;

public class EqualSumPartition {

    public static void main(String[] args) {
        EqualSumPartition equalSumPartition = new EqualSumPartition();
        System.out.println(equalSumPartition.canPartition(new int[]{1,5,10,6}));
    }

    public boolean canPartition(int[] nums) {
      int n = nums.length;
      int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum +=nums[i];
        }
        if(sum%2!=0)
            return false;
        else
            return  isSubsetSum(nums,n, sum/2);
    }

    boolean isSubsetSum(int[] nums , int n , int sum){

        boolean [][] dp =new boolean[n+1][sum+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(i==0 && j==0){
                    dp[i][j] = true;
                }
                else if(i==0){
                    dp[i][j] = false;
                }
                else if(j==0){
                    dp[i][j] = true;
                }else if(nums[i-1]<=j) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j] ;
                }
            }
        }
        return dp[n][sum];
    }

}
