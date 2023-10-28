package org.example.practice;

public class Main {

    public static void main(String[] args) {

    }

   int knapsack(int[] wt, int n , int [] val, int W){
        // Base Condition
       if (wt.length==0 || W==0){
           return 0;
       }
       if (wt[n-1]<=W){
          return  Math.max(val[n-1] + knapsack(wt, n-1,val, W-wt[n-1] ), knapsack(wt, n-1, val, W));
       }else {
           return knapsack(wt, n-1, val, W);
       }
   }

}
