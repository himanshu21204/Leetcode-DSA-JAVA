class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0; // Temporary variable to store the current sum of the subarray
        long ans = 0; // Variable to store the maximum sum of any valid subarray
        HashMap<Integer, Integer> map = new HashMap<>(); // Map to store the frequency of each element in the current
                                                         // subarray

        int i = 0; // Pointer to traverse the array
        int start = 0; // Pointer to mark the start of the current subarray

        while (i < nums.length) {
            sum += nums[i]; // Add the current element to the sum
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); // Update the frequency of the current element in the
                                                                // map

            if (i >= k - 1) { // Check if the window size has reached `k`
                if (map.size() == k) { // Check if the number of unique elements in the map is equal to `k`
                    ans = Math.max(ans, sum); // Update the maximum sum if the current sum is greater
                }
                // Adjust the window by removing the element at the start
                map.put(nums[start], map.getOrDefault(nums[start], 0) - 1); // Decrease the frequency of the element at
                                                                            // the start
                if (map.get(nums[start]) <= 0) { // If its frequency becomes 0, remove it from the map
                    map.remove(nums[start]);
                }
                sum -= nums[start]; // Subtract the value of the element at the start from the sum
                start++; // Move the start pointer to the next element
            }
            i++; // Move the end pointer to the next element
        }

        return ans; // Return the maximum sum of all valid subarrays

    }
}