class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;

        int ans = -1;
        for(int num : nums){
            if(num==1){
                count++;
            }else{
                ans = Math.max(ans,count);
                count=0;
            }
        }
        return ans;
    }
}