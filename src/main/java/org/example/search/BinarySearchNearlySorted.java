package org.example.search;

public class BinarySearchNearlySorted {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{10,3,40,20,50,80,70}, 70));
    }

    static int binarySearch(int[] arr , int target){
        int s = 0;
        int e = arr.length -1;
        int mid = s + (e-s)/2;
        while(s<=e){
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid-1]==target){
                return mid-1;
            }
            if (arr[mid+1]==target){
                return mid+1;
            }

          if (target > arr[mid]){
              s = mid +2;
          }else{
              e = mid - 2;
          }

            mid = s + (e-s)/2;

        }
        return -1;
    }

}
