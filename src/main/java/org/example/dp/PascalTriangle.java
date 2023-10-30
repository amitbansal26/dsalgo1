package org.example.dp;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle tri = new PascalTriangle();
        tri.generate(8).forEach(list-> {
            list.forEach(System.out::print);
            System.out.println("");
        });
    }
    public List<Integer> getRow(int rowIndex) {
        int numRows=rowIndex+1;
        return generate(numRows).get(numRows-2);
    }
    public List<List<Integer>> generate(int numRows) {
      if (numRows==0)
          return new ArrayList<>();
      if (numRows==1){
          List<List<Integer>> list = new ArrayList<>();
          List<Integer> list2 = new ArrayList<>();
          list2.add(1);
          list.add(list2);
          return list;
      }
        List<List<Integer>> list3 = generate(numRows-1);
        List<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
         list4.add(1);
        }
        for (int i = 1; i < numRows-1 ; i++) {
            list4.set(i, list3.get(numRows-2).get(i-1) +
                    list3.get(numRows-2).get(i));
        }
        list3.add(list4);
        return list3;
    }
}