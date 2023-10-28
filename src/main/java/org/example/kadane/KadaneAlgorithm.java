package org.example.kadane;

public class KadaneAlgorithm {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1, 2,10, 5, -6, 12,-98,-97,-32,-45,-54,-23,12}));
    }

    public static int solution(int[] arr){
        int csum = arr[0];
        int osum = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if (csum >=0){
                csum+=arr[i];
            }else {
                csum=arr[i];
            }
          if (csum > osum){
              osum=csum;
          }
        }
      return osum;
    }


}
