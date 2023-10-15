package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

// PasCals Triangle
public class LeetCode118 {

    public static void main(String[] args) {
        generate(9);
    }
    static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> resulti = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0){
                    resulti.add(1);
                }else if (j==i){
                    resulti.add(1);
                }else {
                    resulti.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));

                }
            }
            result.add(resulti);
        }
        return result;
    }
}
