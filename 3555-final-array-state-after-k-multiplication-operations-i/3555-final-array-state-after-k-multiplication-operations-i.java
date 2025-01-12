class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] arr = new int[2];
        
        while (k-->0){
            arr = minNum(nums);
            nums[arr[1]] = arr[0] * multiplier;
        }
        return nums;
    }
    public int[] minNum(int[] nums){
        int min = Integer.MAX_VALUE;
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if(min > nums[i]){
                idx = i;
                min = nums[i];
            }
        }
        return new int[]{min,idx};
    }
}