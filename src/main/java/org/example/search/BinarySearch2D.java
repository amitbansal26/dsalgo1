package org.example.search;

public class BinarySearch2D {

    public static void main(String[] args) {
        System.out.println(binarySearch2D(new int[][]{{1,2,3,4,5},{6,7,8,9,10}}, 2, 5, 5));
    }


    static boolean  binarySearch2D(int[][]arr, int rows, int cols, int target){
     int s = 0;
     int e = rows * cols -1;
     int mid = s+(e-s)/2;
     while(s<=e){
         int rowIndex = mid/cols;
         int colIndex = mid%cols;
         if (arr[rowIndex][colIndex] == target){
             return true;
         } else if (arr[rowIndex][colIndex] < target) {
             s = mid + 1;

         }else{
             e = mid -1;

         }
         mid = s+(e-s)/2;
     }
     return false;
    }
}
