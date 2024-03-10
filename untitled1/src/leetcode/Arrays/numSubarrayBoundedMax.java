package leetcode.Arrays;

import java.util.Arrays;

public class numSubarrayBoundedMax {
    public static  int[] numSubarrayBoundedMax1(int[] nums, int left, int right) {
        int count = 0,m = 0,i = 0,j = 0;

        while(j<nums.length){
            if(nums[j]>right){
                count = 0;
                i = j+1;
            }
            else if(nums[j]>=left && nums[j]<=right){
                count = j-i+1;
            }
            m += count;
            j++;
        }

        return  new int[] {m};
    }

    public static void main(String[] args) {
        int []nums= {2,1,4,3};
        System.out.println(Arrays.toString(numSubarrayBoundedMax1(nums,2,3)));
    }
}