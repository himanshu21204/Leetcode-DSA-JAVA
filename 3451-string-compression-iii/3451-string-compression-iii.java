class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < word.length()){
            int count=1;
            char ch = word.charAt(i);
            while(i < word.length()-1 && ch==word.charAt(i+1) && count!=9 ){
                i++;
                count++;
            }
            sb.append(count);
            sb.append(ch);
            i++;
        }
        return sb.toString();
    }
}