class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add all elements to the priority queue
        for (int num : nums) {
            pq.add(num);
        }

        // Increment smallest elements efficiently
        while (k-- > 0) {
            int smallest = pq.poll();
            smallest++;
            pq.add(smallest);
        }
        // Calculate the product of all elements in the priority queue
        long product = 1;
        int MOD = 1000000007;
        while (!pq.isEmpty()) {
            product = (product * pq.poll()) % MOD;
        }

        return (int) product;
    }
}