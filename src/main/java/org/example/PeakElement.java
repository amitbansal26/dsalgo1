package org.example;

public class PeakElement {
    public static void main(String[] args) {
      int result = peakelementIndex(new int[]{0,10,5,2});
        System.out.println("The Result is " + result);
    }
   static  int peakelementIndex(int[] arr){
     int s = 0;
     int e = arr.length -1;
     int mid = s + (e-s)/2;
     while(s<e){
        if (arr[mid]<arr[mid + 1]){
            s = mid + 1;
        }else{
            e = mid;
        }
         mid = s + (e-s)/2;
     }

        return s;
    }
}
