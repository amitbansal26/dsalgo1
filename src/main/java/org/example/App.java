package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
       //solidRectangle();
       //hollow(5,12);
      // halfPyramid(5);
      //  invertedHalfPyramid(6);
      //  numbeicHalfPyramid(6);
     //   invertedHalfNumericPyramid(6);
       // FullPyramid.fullPyramid(15);
        //FullPyramid.invertedFullPyramid(10);

       // Diamond.solidDiamond(10);
        Diamond.hollowDiamond(6);
    }
   public static void solidRectangle(){
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }

    static  void hollow(int row, int col){
        for (int i = 0; i < row; i++) {

            if (i==0 || i==row-1){
                for (int j = 0; j < col; j++) {
                    System.out.print("* ");
                }

            }else{
                System.out.print("* ");
                for (int j = 0; j < col-2; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }

    static void halfPyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static  void  invertedHalfPyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void numbeicHalfPyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j + 1);
            }
            System.out.print("\n");
        }
    }

    static void invertedHalfNumericPyramid(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print(j+1);
            }
            System.out.print("\n");
        }
    }

}
// Patterns and Logic Building

