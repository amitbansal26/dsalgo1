package org.example.recursion;

public class SubSequenceString {
    public static void main(String[] args) {
      StringBuilder str = new StringBuilder("abc");
      StringBuilder output = new StringBuilder("");
      int i = 0;
      printSubSeq(str, output, i);
    }

    private static void printSubSeq(StringBuilder str, StringBuilder output, int i) {
        // base case
        if(i>=str.length()){
            //System.out.println(output.toString());
            return;
        }
        //exclude
        printSubSeq(str, output, i+1);

        //include
        output.append(str.charAt(i));
        printSubSeq(str, output, i+1);
       // output = output.

    }
}
