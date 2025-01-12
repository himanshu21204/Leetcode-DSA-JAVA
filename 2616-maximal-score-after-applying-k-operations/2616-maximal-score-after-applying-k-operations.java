class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        long ans = 0;

        for (int num : nums){
            pq.add(num);
        }

        while (k-- > 0){
            int temp = pq.poll();
            ans += temp;
            pq.add((int) (Math.ceil(temp/3.0)));
        }
        return ans;
    }
}