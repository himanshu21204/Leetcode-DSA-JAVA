class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int num : nums){
            sum += num;
            if(min > num) min=num;
        }

        return sum - (min*nums.length);
    }
}