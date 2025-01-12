class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        int count = 0;

        for(int num : nums){
            max |= num;
        }
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int num : nums){
            int n = outer.size();

            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        for (List<Integer> list : outer){
            int or = 0;
            for(int num : list){
                or |= num;
            }
            if(or == max) count++;
        }
        return count;
    }
}