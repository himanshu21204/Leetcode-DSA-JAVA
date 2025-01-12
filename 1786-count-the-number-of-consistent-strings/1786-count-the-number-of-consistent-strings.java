class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }
        int count = 0;
        boolean temp = false;
        for(String s : words){
            temp = false;
            for (char ch : s.toCharArray()){
                if(!set.contains(ch)){
                    temp = true;
                }
            }
            if(!temp){
                count++;
            }
        }
        return count;
    }
}