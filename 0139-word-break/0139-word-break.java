class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int [][]dp= new int [s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                dp[i][j]=-1;
            }
        }
        return find(0,0,s, new HashSet(wordDict), dp );
    }
    public boolean find(int start, int end, String s, Set<String> wd, int [][]dp) {
        if (start > end || end >= s.length()) {
            return false;
        }
        if (dp[start][end] != -1) {
            return dp[start][end] == 1;
        }
        if (wd.contains(s.substring(start, end + 1))) {
            if (end == s.length() - 1 || find(end + 1, end + 1, s, wd, dp)) {
                dp[start][end] = 1;
                return true;
            }
        }
        boolean ans = find(start, end + 1, s, wd, dp);
        dp[start][end] = ans ? 1 : 0;
        return ans;
    }
}