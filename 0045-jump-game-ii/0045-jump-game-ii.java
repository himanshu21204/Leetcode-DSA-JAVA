class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int l = 0,r = 0;
        while (r < nums.length-1){
            int max = 0;
            for (int i = l; i <= r; i++) {
                max = Math.max(i + nums[i],max);
            }
            jump++;
            l = r + 1;
            r = max;
        }
        return jump;
    }
    public int jump1(int[] nums) {
       int cur = 0;
       int jump = 0;
       int max = 0;
       for(int i=0;i<nums.length-1;i++){
        max = Math.max(max,(i+nums[i]));

        if(i==cur){
            jump++;
            cur=max;
        }
       } 
       return jump;
    }
}