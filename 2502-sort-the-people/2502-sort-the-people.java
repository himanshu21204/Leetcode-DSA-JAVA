class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        
        List<Integer> temp = new ArrayList<>(map.keySet());
        Collections.sort(temp, Collections.reverseOrder());  
        String[] ans = new String[names.length];
        for (int i = 0; i < temp.size(); i++) {
            ans[i] = map.get(temp.get(i));
        }
        
        return ans;
    }
}