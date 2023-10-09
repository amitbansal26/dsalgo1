package org.example.search;

import org.jetbrains.annotations.Contract;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KdiffPairs {

    record Pair(int p1,int p2){}
    public static void main(String[] args) {
        int k =2;
        int [] arr = new int[]{1,3,4,5,7,8};
        Arrays.sort(arr);
        Set<Pair> pairs = new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            if(bs(arr, i+1, arr[i] + k) > -1){
                pairs.add(new Pair(arr[i], arr[i] + k));
            }
        }
     pairs.forEach(System.out::println);
    }

    static int bs(int[] arr, int s, int target ){
        int e= arr.length -1;
        int mid = s+ (e-s)/2;
        while(s<=e){
            if(arr[mid]==target){
                return mid;
            } else if (target > arr[mid]) {
                s = mid + 1;
            }else {
                e = mid-1;
            }
            mid = s+ (e-s)/2;
        }
        return -1;
    }
}
