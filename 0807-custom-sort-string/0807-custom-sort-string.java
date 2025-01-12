class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : order.toCharArray()){
            int val = map.getOrDefault(ch, 0);
            while (val -- > 0){
                sb.append(ch);
            }
            map.remove(ch);
        }
        for(char ch : map.keySet()){
            int val = map.getOrDefault(ch, 0);
            while (val -- > 0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}