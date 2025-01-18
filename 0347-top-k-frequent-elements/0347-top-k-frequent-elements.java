class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for (int key : map.keySet()){
            pq.offer(new int[]{key,map.get(key)});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans = new int[k];
        while (k-->0){
            ans[k] = pq.poll()[0];
        }
        return ans;
    }
}