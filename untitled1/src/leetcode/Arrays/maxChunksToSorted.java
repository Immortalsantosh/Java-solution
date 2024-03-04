package leetcode.Arrays;

import java.util.Arrays;

class maxChunksToSorted {
    public static int[] maxChunk(int[]arr){
        int max = arr[0];
        int chunk =0;
        for (int i = 0; i < arr.length ; i++) {
            max = Math.max(arr[i] ,max);
            if(max==i){
                chunk++;
            }

        }
        return  new int[]{chunk};
    }

     public static void main(String[] args) {
         int [] arr ={1,0,2,3,4};
         System.out.println(Arrays.toString(maxChunk(arr)));
     }

}
