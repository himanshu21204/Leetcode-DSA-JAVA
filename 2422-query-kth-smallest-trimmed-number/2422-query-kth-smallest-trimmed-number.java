class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
         int queryCount = queries.length;
        int[] ans = new int[queryCount];

        for (int i = 0; i < queryCount; i++) {
            int k = queries[i][0]; // kth smallest number to find
            int trim = queries[i][1]; // length to trim from the right

            // PriorityQueue with custom comparator
            PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> {
                    String strA = nums[a[1]].substring(nums[a[1]].length() - trim);
                    String strB = nums[b[1]].substring(nums[b[1]].length() - trim);
                    int cmp = strA.compareTo(strB);
                    return cmp == 0 ? a[1] - b[1] : cmp;
                }
            );

            for (int j = 0; j < nums.length; j++) {
                pq.offer(new int[]{j, j});
            }

            while (k-- > 1) {
                pq.poll(); // Remove smallest elements until k-th remains
            }

            ans[i] = pq.poll()[1]; // Store the index of the k-th smallest trimmed number
        }

        return ans;
    }
}