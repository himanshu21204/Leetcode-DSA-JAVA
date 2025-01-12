class Solution {
    public int maxScore(int[] cp, int k) {
        int ans = 0;

        int lsum = 0,rsum = 0;
        for(int i=0;i<k;i++){
            lsum += cp[i];
        }
        ans = Math.max(lsum,ans);

        int temp = cp.length - 1;
        for(int i=k-1;i>=0;i--){
            lsum = lsum - cp[i];
            rsum = rsum + cp[temp--];
            ans = Math.max(ans,(lsum+rsum));
        }
        return ans;
    }
}