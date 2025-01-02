class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int count = 0; // This is Count Total incremovable Subarray
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if(isIncremovanle(nums,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
    boolean isIncremovanle(int[] nums,int start,int end){
        int len = nums.length;
        if(start > 0 && end < len - 1 && nums[start - 1] >= nums[end + 1]) return false;
        for (int i = 0; i < start - 1; i++) {
            if(nums[i] >= nums[i + 1]) return false;
        }
        for (int i = end+1; i < len - 1; i++) {
            if(nums[i] >= nums[i + 1]) return false;
        }
        return true;
    }
}