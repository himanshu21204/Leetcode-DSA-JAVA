class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int rem = (int)(sum % p);
        if (rem == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        long prefixSum = 0;
        int ans = nums.length;
        for (int i = 0; i < nums.length; ++i) {
            prefixSum += nums[i];
            int currentMod = (int)(prefixSum % p);
            int targetMod = (currentMod - rem + p) % p;
            if (map.containsKey(targetMod)) {
                ans = Math.min(ans, i - map.get(targetMod));
            }
            map.put(currentMod, i);
        }
        return ans == nums.length ? -1 : ans;
    }
}