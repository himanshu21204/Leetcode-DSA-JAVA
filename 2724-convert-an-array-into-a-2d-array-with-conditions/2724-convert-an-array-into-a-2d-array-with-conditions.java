class Solution {
    public static List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            set.add(num);
        }

        List<List<Integer>> ans = new ArrayList<>();
        while (!map.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> toRemove = new ArrayList<>();
            for (int n : set) {
                if (map.get(n) > 0) {
                    temp.add(n);
                    map.put(n, map.get(n) - 1);
                }
                if (map.get(n) == 0) {
                    toRemove.add(n);
                }
            }
            for (int num : toRemove) {
                map.remove(num);
                set.remove(num);
            }

            ans.add(temp);
        }
        return ans;
    }
}