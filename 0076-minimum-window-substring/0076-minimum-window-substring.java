class Solution {
    public String minWindow(String s, String t) {
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int WinSt = 0;
        int count = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) >= 0) count++;
            }

            while (count == t.length()) {
                if (ans > i - start + 1) {
                    ans = i - start + 1;
                    WinSt = start;
                }

                ch = s.charAt(start);
                start++;
                if (map.containsKey(ch)) {
                    if (map.get(ch) == 0) count--;
                    map.put(ch, map.get(ch) + 1);
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(WinSt, WinSt + ans);
    }
}