package org.example.dp;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        LCS lcs = new LCS();
        final  String text1 = "kldgljlgjldfg";
        final String text2 = "gdfgldfkgldfk";
        int n=text1.length();
        int m=text2.length();
        int[][]dp = new int[n+1][m+1];
        Arrays.stream(dp).forEach(d->Arrays.fill(d ,-1));
        System.out.println(lcs.longestCommonSubsequence(text1, text2, dp));

    }

    public int longestCommonSubsequence(String text1, String text2) {

        if(text1.isBlank() || text2.isBlank())
            return 0;

        int n=text1.length();
        int m=text2.length();
        int[][]dp = new int[n+1][m+1];
        Arrays.stream(dp).forEach(d->Arrays.fill(d ,-1));

        for (int i = 0; i < n+1 ; i++) {
            for (int j = 0; j < m+1; j++) {
                if (i==0)
                    dp[i][j]=0;
                else if (j==0)
                    dp[i][j]=0;
                else if (text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else{
                    dp[i][j] =  Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }


    public int longestCommonSubsequence(String text1, String text2, int[][]dp) {

        if(text1.isBlank() || text2.isBlank())
            return 0;

        int n=text1.length();
        int m=text2.length();
        if (dp[n][m]!=-1){
            return dp[n][m];
        }
        if (text1.charAt(n-1)==text2.charAt(m-1)){
            return dp[n][m] = 1 + longestCommonSubsequence(text1.substring(0, n-1), text2.substring(0, m-1), dp);
        }else{
            return dp[n][m] = Math.max(longestCommonSubsequence(text1.substring(0, n), text2.substring(0, m-1), dp),
                    longestCommonSubsequence(text1.substring(0, n-1), text2.substring(0, m), dp));
        }

    }
}
