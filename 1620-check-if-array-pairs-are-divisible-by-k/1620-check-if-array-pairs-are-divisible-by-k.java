class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] ans = new int[k];
        for(int num : arr){
            num %= k;
            if(num < 0) num += k;
            ans[num]++;
        }
        if(ans[0]%2 != 0) return false;

        for(int i = 1; i <= k/2; i++)
            if(ans[i] != ans[k-i]) return false;

        return true;
    }
}