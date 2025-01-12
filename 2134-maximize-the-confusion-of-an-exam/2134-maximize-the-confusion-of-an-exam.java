class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int ans = 0;
        int start = 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max = Math.max(max,map.get(ch));
            int change = (i-start+1) - max;
            if (change > k){
                ch = s.charAt(start);
                map.put(ch,map.getOrDefault(ch,0)-1);
                start++;
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }
            if(change <= k){
                ans = Math.max(ans, (i - start + 1));
            }
        }
        return ans;
    }
}