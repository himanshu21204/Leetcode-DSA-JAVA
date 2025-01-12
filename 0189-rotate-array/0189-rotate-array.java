class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        //First Reverse Last K Element
        //Eg. nums = [1,2,3,4,5,6,7], k = 3
        //output nums = [1,2,3,4,7,6,5]
        rotate(nums,n-k,n-1);
        //Then Reverse 0 To n-k Element
        //Eg. nums = [1,2,3,4,5,6,7], k = 3
        //output nums = [4,3,2,1,7,6,5]
        rotate(nums,0,n-1-k);
        //Then Reverse The Whole Array
        //Eg. nums = [1,2,3,4,5,6,7], k = 3
        //output nums = [5,6,7,1,2,3,4]
        rotate(nums,0,n-1);
    }
    void rotate(int[] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}