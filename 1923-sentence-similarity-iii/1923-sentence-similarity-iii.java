class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        String[] S1 = s1.split("\\s");
        String[] S2 = s2.split("\\s");

        return S1.length<=S2.length? simi(S1,S2):simi(S2,S1);
    }
    boolean simi(String[] S1,String[] S2){
        int matchCount = 0;
        int len1 = S1.length; 
        int len2 = S2.length;
        int i = 0;
        while(i < len1 && S1[i].equals(S2[i])){
            i++;
            matchCount++;
        }
        while(i < len1 && S1[i].equals(S2[len2 - (len1 - i)])){
            i++;
            matchCount++;
        }

        return matchCount == len1;
    }
}