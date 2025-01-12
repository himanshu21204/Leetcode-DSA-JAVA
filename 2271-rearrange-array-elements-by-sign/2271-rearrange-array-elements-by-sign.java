class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int k = 0;
        // int i = 0;
        // int j = 0;
        // int n = nums.length;
        // int[] ans = new int[n];
        // while (k<n){
        //     while(nums[i] < 0){
        //         i++;
        //     }
        //     ans[k++] = nums[i++];
        //     while(nums[j] > 0){
        //         j++;
        //     }
        //     ans[k++] = nums[j++];
        // }
        // return ans;
        int n =nums.length;
        int[] ans = new int[n];
        int pos=0;int neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            }else{
                 ans[neg]=nums[i];
                neg+=2;

            }
        }
        return ans;
    }
}