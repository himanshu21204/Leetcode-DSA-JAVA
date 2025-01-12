class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int l = 0;
        int r = 0;
        int zero = 0;
        while(r < nums.length){
            if(nums[r] == 0){
                zero++;
            }
            if(zero<=1){
                ans = Math.max(ans,(r-l));
            }else{
                if(nums[l]==0){
                    zero--;
                }
                l++;
            }
            r++;
        }
        return ans;
    }
}