class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char lastchar = sb.charAt(len - 1);
            sb.deleteCharAt(len - 1);
            sb.insert(0,lastchar);
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}