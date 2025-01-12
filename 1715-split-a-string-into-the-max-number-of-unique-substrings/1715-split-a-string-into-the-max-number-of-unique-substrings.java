class Solution {
    public int maxUniqueSplit(String s) {
        return brack(0,s,new HashSet<>());
    }
    int brack(int start, String s, HashSet<String> set){
        if (start == s.length()) {
            return 0;
        }

        int ans = 0;
        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (!set.contains(substring)) {
                set.add(substring);
                ans = Math.max(ans, 1 + brack(end, s, set));
                set.remove(substring);
            }
        }
        return ans;
    }
}