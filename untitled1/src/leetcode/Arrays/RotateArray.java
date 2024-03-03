package leetcode.Arrays;

import java.util.Arrays;

public class RotateArray {
    public static int[]rotate(int []num , int k){
        k %= num.length;
        int n = num.length;
        reverse(num , 0 ,n-1);
        reverse(num ,0 , k-1);
        reverse(num , k , n-1);
        return num;
    }

    static void reverse(int[]num , int start , int end) {
        while(start<end){
            int temp =num[start];
            num[start] = num[end];
            num[end] =temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int[] num ={1,2,3,4,5,6,7};
        int k= 3;
        System.out.println(Arrays.toString(rotate(num,k)));
    }
}
