class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s : details){
                    int num = 0;
        num += s.charAt(11)-'0';
        num = (num * 10) + (s.charAt(12)-'0');
            if(num > 60){
                count++;
            }
        }
        return count;
    }
}