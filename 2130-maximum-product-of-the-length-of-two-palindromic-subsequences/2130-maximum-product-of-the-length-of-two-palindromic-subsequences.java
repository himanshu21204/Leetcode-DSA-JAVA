class Solution {
    int max = 0;
    public int maxProduct(String s) {
        char[] c = s.toCharArray();
        subseq(c, 0, "", "");
        return max;
    }

    public void subseq(char[] c, int i, String s1, String s2){
        if(i >= c.length){
            if(isPalin(s1) && isPalin(s2))
                max = Math.max(max, s1.length()*s2.length());
            return;
        }
        subseq(c, i+1, s1+c[i], s2);
        subseq(c, i+1, s1, s2+c[i]);
        subseq(c, i+1, s1, s2);
    }
    public boolean isPalin(String str){
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}