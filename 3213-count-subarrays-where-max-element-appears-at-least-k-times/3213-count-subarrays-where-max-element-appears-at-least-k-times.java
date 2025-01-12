class Solution {
    public long countSubarrays(int[] nums, int k) {
        int start = 0;
        int count = 0;
        long ans = 0;
        int max = -1;

        for (int num : nums){
            max = Math.max(max,num);
        }

        for (int i = 0; i < nums.length && (start<=i); i++) {
            if(nums[i] == max){
                count++;
            }

            while (count >= k){
                if(nums[start++] == max){
                    count--;
                }
                ans += (nums.length - i);
            }
        }
        return ans;
    }
}