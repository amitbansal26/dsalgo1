package org.example.search;

public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        // int result = binarySearch.binarySearch(new int[]{1,2,3,4,5,6,7,8}, 78);

        // int result = binarySearch.lastOccur(new int[]{1,5,6,7,7,7,7,23,56,78}, 7);
        int number = 10;
        double result = binarySearch.sqrtBinarySearch(number);
        int precision =8;
        double step = 0.1;
        for (int i = 0; i <precision ; i++) {
            for (double j = result; j * j <= number; j+=step) {
                result = j;
            }
            step = step/10;
        }
        System.out.println("The Result of Binary Search is " + result);
    }


    int binarySearch(int[] arr, int target){
      int start = 0;
      int end = arr.length - 1;
      int mid =  start  +  (end - start)/2;
      while(start <= end){
          if (arr[mid] ==target){
              return mid;
          } else if (target < arr[mid]) {
              end = mid -1;
          }else{
              start = mid + 1;
          }
          mid =  start  +  (end - start)/2;
      }
      return -1;
    }

    int firstOccurrence(int[] arr, int target){
      int s = 0;
      int e = arr.length -1 ;
      int mid = s+ (e-s)/2;
      int ans = -1;
      while(s<=e){
        if (arr[mid] == target){
         ans = mid;
         e = mid-1;
        } else if (target >arr[mid]) {
            s =  mid + 1;

        } else if (target < arr[mid]) {
            e = mid - 1;
        }
          mid = s+ (e-s)/2;
      }

      return ans;
    }

    int lastOccur(int[] arr, int target) {
        int s = 0;
        int e = arr.length -1 ;
        int mid = s+ (e-s)/2;
        int ans = -1;
        while(s<=e){
            if (arr[mid] == target){
                ans = mid;
                s = mid + 1;
            } else if (target >arr[mid]) {
                s =  mid + 1;

            } else if (target < arr[mid]) {
                e = mid - 1;
            }
            mid = s+ (e-s)/2;
        }

        return ans;
    }

    double sqrtBinarySearch(int number){
    int s = 0;
    int e = number;
    int mid = s + (e-s)/2;
    int ans = -1;
    while (s<=e){
        if (mid * mid == number){
            return mid;
        } else if(mid * mid > number ){
            e = mid -1;
        } else {
            ans = mid;
            s = mid + 1;
        }
        mid = s + (e-s)/2;
    }
    return ans;
    }
}