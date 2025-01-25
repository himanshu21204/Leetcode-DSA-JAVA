class Solution {
    public int maxProfit(int K, int[] prices) {
        int cap = K;
        int n = prices.length;
        int[][] after = new int[2][cap + 1];
        int[][] curr = new int[2][cap + 1];
        for (int idx = n - 1; idx >= 0; idx--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int k = 1; k <= cap; k++) {
                    if (buy == 1) {
                        curr[buy][k] = Math.max(-prices[idx] + after[0][k], after[1][k]);
                    } else {
                        curr[buy][k] = Math.max(prices[idx] + after[1][k - 1], after[0][k]);
                    }
                }
            }
            after = curr;
        }
        return after[1][cap];
    }
}