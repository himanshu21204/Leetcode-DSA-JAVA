class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1)return nums[0];
        int l=0,r=k-1;
        double sum =0 ;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        l=0;
        double max_avg = sum / k;
        while(r<nums.length-1){
            sum-=nums[l];
            l++;
            r++;
            sum+=nums[r];
            max_avg=Math.max(sum/k,max_avg);
        }
        return max_avg;
    }
}