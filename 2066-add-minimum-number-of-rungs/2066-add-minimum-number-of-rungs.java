class Solution {
    public int addRungs(int[] rungs, int dist) {
        int ans = 0;
        int last = 0;

        int i = 0;
        while (i < rungs.length){
            int temp = rungs[i];
            int diff = (temp - last);
            if(diff > dist){
                last = temp;
                ans += (diff%dist==0)? diff/dist-1: diff/dist;;
            }
            else{
                last = temp;
            }
            i++; 
        }
        return ans;
    }
}