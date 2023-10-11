package org.example.sort;

import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {

     int arr[] = new int[]{34,32,78,3,5,6,6,90,45,123,45,88,97,23,8888,333,4445,5555,6666,777};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr, arr.length-1, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    void mergeSort(int []arr , int hi, int lo ){
        if ( hi<=lo){
            return;
        }
      int mid = lo + (hi-lo)/2;
      // sort left array
      mergeSort(arr, mid, lo);
      // sort right arry
      mergeSort(arr, hi, mid + 1);

      merge(arr, hi, lo);
    }

    private void merge(int[] arr, int hi, int lo) {
     int mid = lo + (hi-lo)/2;
     int lengthFirst = mid-lo + 1;
     int lengthSecond = hi-mid;

     int[] firstArr = new int[lengthFirst];
     int[] secondArr =  new int[lengthSecond];
     // copy into respective arrays
     int k = lo;
        for (int i = 0; i <lengthFirst ; i++) {
            firstArr[i]=arr[k++];
        }
     k=mid+1;
        for (int i = 0; i < lengthSecond; i++) {
          secondArr[i] = arr[k++];
        }
     // merge the values into original array
        int li = 0;
        int ri = 0;
        int mi = lo;

        while(li<lengthFirst && ri<lengthSecond){
            if(firstArr[li] < secondArr[ri]){
                arr[mi++]=firstArr[li++];
            }else {
                arr[mi++]=secondArr[ri++];
            }
        }
        while(li<lengthFirst){
            arr[mi++]=firstArr[li++];
        }
        while(ri<lengthSecond){
            arr[mi++]=secondArr[ri++];
        }

    }

}
