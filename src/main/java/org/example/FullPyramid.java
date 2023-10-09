package org.example;

public class FullPyramid {
    
    public static void fullPyramid(int n){
        for (int i = 0; i < n ; i++) {
        // print space 
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
        // print star
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void invertedFullPyramid(int n){
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
