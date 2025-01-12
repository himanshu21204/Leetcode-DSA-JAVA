class Solution {
    public int compress(char[] chars) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        int len = chars.length;
        while (i < len){
            int count = 1;
            char ch = chars[i];
            while (i < len - 1 && ch==chars[i+1]){
                i++;
                count++;
            }
            i++;
            sb.append(ch);
            if(count>1){
                sb.append(count);
            }
        }
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }
}