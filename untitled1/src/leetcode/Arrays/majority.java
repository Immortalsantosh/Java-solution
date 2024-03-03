package leetcode.Arrays;

import java.util.Arrays;

public class majority {
    public  static int[] majorityElement(int[] nums) {
        int majority = nums[0];
        int votes = 1;
        
        for(int i=1; i<nums.length;i++){
            if(majority==nums[i]){
                votes++;
            }else if(votes ==0){
                votes++;
                majority = nums[i];
            }else{
                votes--;
            }
        }
        return new int[]{majority};
    }

    public static void main(String[] args) {
        int[] nums = {6,5,5};
        System.out.println(Arrays.toString(majorityElement(nums)));
    }
}

