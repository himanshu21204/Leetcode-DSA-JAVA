class Solution {
    public int minGroups(int[][] intervals) {
        int[] temp = new int[1000002];
        Arrays.fill(temp,0);

        int ans = Integer.MIN_VALUE;

        for (int[] row : intervals){
            int start = row[0];
            int end = row[1];

            temp[start] += 1;
            temp[end+1] += -1;
        }

        for (int i = 1; i < 1000002; i++) {
            temp[i] += temp[i-1];
            ans = Math.max(ans,temp[i-1]);
        }
        return ans;
    }
}