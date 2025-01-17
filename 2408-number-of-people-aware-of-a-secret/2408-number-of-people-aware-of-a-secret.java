class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp = new long[n + 1];
        long mod = 1000000007;
        dp[1] = 1;
        long noOfPeopleKnow = 0;
        long ans = 0;
        for (int i = 2; i <= n; i++) {
            if(i-delay > 0){
                noOfPeopleKnow += dp[i-delay];
            }
            if(i-forget > 0){
                noOfPeopleKnow -= dp[i-forget];
            }
            dp[i] = (noOfPeopleKnow % mod);
        }
        for (int i = n-forget+1; i <=n ; i++) {
            ans += dp[i];
        }
        return (int) (ans % mod);
    }
}