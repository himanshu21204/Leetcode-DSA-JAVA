class Solution {
    public int trap(int[] height) {
        // int sum = 0;
        // int[] pri = prifix(height);
        // int[] suf = suffix(height);

        // for (int i = 0; i < height.length; i++) {
        //     if (height[i] < pri[i] && height[i] < suf[i]) {
        //         sum += Math.min(pri[i], suf[i]) - height[i];
        //     }
        // }
        // return sum;
        int lMax = Integer.MIN_VALUE; 
        int rMax = Integer.MIN_VALUE; 
        int l = 0; 
        int r = height.length - 1; 
        int res = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                lMax = Math.max(lMax, height[l]);
                res += (lMax - height[l]);
                l++;
            } else {
                rMax = Math.max(rMax, height[r]);
                res += (rMax - height[r]);
                r--;
            }
        }

        return res;
    }

    private int[] prifix(int[] arr) {
        int[] pri = new int[arr.length];
        int n = arr.length;
        pri[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pri[i] = Math.max(arr[i], pri[i - 1]);
        }
        return pri;
    }

    private int[] suffix(int[] arr) {
        int[] suf = new int[arr.length];
        int n = arr.length;
        suf[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suf[i] = Math.max(arr[i], suf[i + 1]);
        }
        return suf;
    }
}
