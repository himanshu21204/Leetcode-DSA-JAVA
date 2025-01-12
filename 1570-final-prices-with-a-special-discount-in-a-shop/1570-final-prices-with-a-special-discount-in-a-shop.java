class Solution {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            prices[i] = prices[i] - getMin(i,prices);
        }
        return prices;   
    }
    int getMin(int i,int[] nums){
        for (int j = i+1; j < nums.length; j++) {
            if(nums[i] >= nums[j]){
                return nums[j];
            }
        }
        return 0;
    }
}