class Solution {
    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : s1.split(" ")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : s2.split(" ")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int count = 0;
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                count++;
            }
        }
        String[] ans = new String[count];
        int i = 0;
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                ans[i++] = s;
            }
        }
        return ans;
    }
}