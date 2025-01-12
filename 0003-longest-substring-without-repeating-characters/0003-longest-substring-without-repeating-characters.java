class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return s.length();
        
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int st = 0; 
        int e = 0;
        while (e < s.length()) {
            char ch = s.charAt(e);
            if (map.containsKey(ch) && map.get(ch) >= st) {
                st = map.get(ch) + 1;
            }
            map.put(ch, e);
            ans = Math.max(ans, e - st + 1);
            
            e++;
        }
        
        return ans;
    }
}