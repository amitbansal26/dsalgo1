package org.example;

public class PivotElement {
    public static void main(String[] args) {

    }

    int binarySearch(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (s == e) {
                return s;
            }

            if (mid + 1 <= e && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid - 1 >= s && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
        }

        return -1;
    }
}
