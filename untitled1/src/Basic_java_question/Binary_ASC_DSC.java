package Basic_java_question;

public class Binary_ASC_DSC {
    public static int bns(int[]arr , int target){
        int start =0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end =mid-1;
                } else  {
                    start=mid+1;
                }
            }else{
                if(target<arr[mid]){
                    start =mid+1;
                } else  {
                   end = end-1;
                }
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int []arr = {78,56,45,22,21,20,18,17,14,11};
        int target =18;
        System.out.println(bns(arr,target));
    }
}
