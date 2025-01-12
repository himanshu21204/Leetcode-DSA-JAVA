class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int start = 0;int match = 0;HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()){
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        for (int end = 0; end < s2.length(); end++) {
            char endChar = s2.charAt(end);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0) {
                    match++;
                }
            }
            if (match == map.size()) {return true;}
            if (end >= s1.length() - 1) {
                char startChar = s2.charAt(start);
                start++;
                if (map.containsKey(startChar)) {
                    if (map.get(startChar) == 0) {
                        match--;
                    }
                    map.put(startChar, map.get(startChar) + 1);
                }
            }
        }
        return false;
    }
}