class Solution {
    public int[] sortedSquares(int[] num) {
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
}