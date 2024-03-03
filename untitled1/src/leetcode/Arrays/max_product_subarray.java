package leetcode.Arrays;

import java.util.Arrays;

public class max_product_subarray {
    public  static int[] maxProduct(int[] nums) {
        int n=  nums.length;
        int leftproduct =1;
        int rightproduct =1;
        int ans = nums[0];

        for(int i=0;i<n; i++){
            //if leftproduct and right product become 0 it update to 1;
            leftproduct =leftproduct==0 ? 1 : leftproduct;
            rightproduct =rightproduct==0 ? 1: rightproduct;

            // prefix product
            leftproduct = leftproduct*nums[i];
//            suffix product
            rightproduct = rightproduct*nums[n-1-i];

            ans = Math.max(ans, Math.max(leftproduct, rightproduct));
        }
        return new int[]{ans};
    }

    public static void main(String[] args) {
        int[] nums ={2,3,-2,4};
        System.out.println(Arrays.toString(maxProduct(nums)));
    }
}


