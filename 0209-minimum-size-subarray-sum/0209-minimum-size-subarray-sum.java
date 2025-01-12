class Solution {
    public int minSubArrayLen(int k, int[] arr) {
        int l=0,r=0,sum=0,min_length=Integer.MAX_VALUE;
        while(r<arr.length){
            sum+=arr[r];
            if(sum>=k){
                min_length=Math.min(min_length,r-l+1);
            }
            while(sum>=k){
                min_length=Math.min(min_length,r-l+1);
                sum-=arr[l];
                l++;
            }
            r++;
        }
        if(min_length==Integer.MAX_VALUE) return 0;
        return min_length;
    }
}