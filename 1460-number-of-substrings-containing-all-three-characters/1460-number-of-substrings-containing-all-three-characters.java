class Solution {
    public int numberOfSubstrings(String s) {
        int[] temp = {-1,-1,-1};

        int count = 0;
        // In This Problem First Find Three(a,b,c) index and Find Min ind and take Count of min+1;
        // Like bbacb Here "acb" is minimum valid String and min ind is 2 then bbacb,bacb also valid String Then Total 3 Valid String(2+1); 
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            temp[ch-'a'] = i;

            if(temp[0]!=-1 && temp[1]!=-1 && temp[2]!=-1){
                count += (1 + Math.min(temp[0],Math.min(temp[1],temp[2])));
            }
        }
        return count;
    }
}