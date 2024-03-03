package leetcode.Arrays;

import java.util.Arrays;

public class maximum_subarray {
    public static int[] maxSubArray(int[] nums) {
        int sum =0;
        int max_sum =nums[0];

        for(int i=0; i<nums.length; i++){
            sum = sum+nums[i];
            if(sum>max_sum){
                max_sum =sum;
            }
            if(sum<0){
                sum= 0;
            }
        }
        return new int[]{max_sum};
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(maxSubArray(nums)));
    }
}
