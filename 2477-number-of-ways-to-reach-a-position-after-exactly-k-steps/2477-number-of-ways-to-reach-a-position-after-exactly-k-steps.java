class Solution {
    static int mod = 1000000007;
    public int numberOfWays(int startPos, int endPos, int k) {
        int[][] dp=new int[3000][k+1];
        for (int[] temp : dp) {
            Arrays.fill(temp, -1);
        }
        return helper(startPos,endPos,k,dp);
    }
    public int helper(int start,int end,int k,int[][] dp){
        if(start==end && k==0) return 1;
        if(k==0) return 0;
        if(dp[start+1000][k]!=-1) return dp[start+1000][k];
        int left=helper(start-1,end,k-1,dp);
        int right=helper(start+1,end,k-1,dp);
        dp[start+1000][k]=(left+right)%(mod);
        return dp[start+1000][k];
    }
}