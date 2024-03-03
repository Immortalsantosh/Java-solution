package leetcode.Arrays;

import java.util.Arrays;

public class squares_sorted_array {
    public static int[] sortedSquares(int[] num) {
        int[] arr = new int[num.length];
        for(int i=0; i< num.length; i++){
            num[i]= num[i]*num[i];
        }
        int start =0;
        int end = num.length-1;

        for(int pos =num.length-1; pos>=0;pos--){
            if(num[start]>num[end]){
                arr[pos]=num[start];
                start++;
            }else{
                arr[pos]=num[end];
                end--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] num ={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(num)));
    }
}
