package org.example.sort;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = new int[]{34,32,78,3,5,6,6,90,45,123,45,88,97,23,8888,333,4445,5555,6666,777};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, 19);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    void quickSort(int[] arr, int low, int high ){
        if(arr.length == 0) return;
        if(low >= high) return;
        if (high>arr.length) return;
        // partition
      int p = partition(arr, low, high);
      quickSort(arr, low, p-1);
      quickSort(arr, p+1, high);
    }

    private int partition(int[] arr, int low, int high) {


        int i=low;
        int j= high;
        int pivot = arr[low];

        while(i<j){

            while(i<arr.length && arr[i]<=pivot)i++;
            while(arr[j]>pivot)j--;
            if (i<j){
                int t = arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }

        }
        int t = arr[low];
        arr[low]=arr[j];
        arr[j] = t;
        return j;
    }
}
