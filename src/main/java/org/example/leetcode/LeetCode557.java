package org.example.leetcode;

public class LeetCode557 {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }


    static String reverseWords(String s) {
     char[] arr =  s.toCharArray();
     int l=0;
       for (int i = 0; i <arr.length ; i++) {
          if (arr[i]==' ' || i== arr.length-1){
              int templ=l, tempr=i-1;
              if (i==arr.length-1){
                  tempr = i;
              }
              while (templ<tempr){
                  char temch = arr[templ];
                  arr[templ]=arr[tempr];
                  arr[tempr]=temch;
                  templ++;
                  tempr--;
              }
              l = i +1;
          }
        }
    return new String(arr);
    }

}
