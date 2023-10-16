package org.example;

public class Diamond {


    public static void solidDiamond(int n) {
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void hollowDiamond(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else if (j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }
    }
}
