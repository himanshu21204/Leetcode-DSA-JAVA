class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> store = new HashSet<>(); // Store is used to Store SubString that length is exactly 10
        Set<String> ans = new HashSet<>(); // this is Store That Substring that already store in Store Set[Repeated String DNA]
        for (int i = 0; i < s.length() - 9; i++) {
            String temp = s.substring(i,i+10); // Give Substring of length 10
            if(store.contains(temp)){
                ans.add(temp); // Check if Substring Already accrued in 'store that means that substring Repeated DNA And Store in 'ans' Set[Use Set BCZ Not Store Duplicate substring]
            }
            store.add(temp); // Add Every SubString
        }
        // Return the repeated substrings as a list.
//        List<String> list = new ArrayList<>(ans);
        return new ArrayList<>(ans);
    }
}