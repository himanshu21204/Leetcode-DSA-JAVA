class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int ans = Integer.MIN_VALUE;
        int sum = 0;

        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp += (nums[i] * i);
            sum += nums[i];
        }
        dp[0] = temp;
        ans = Math.max(ans,dp[0]);
        for (int i = 1; i < n; i++) {
            dp[i] = (dp[i-1]+sum-(nums[n-i]*n));
            ans = Math.max(dp[i],ans);
        }
        return ans;
    }
}