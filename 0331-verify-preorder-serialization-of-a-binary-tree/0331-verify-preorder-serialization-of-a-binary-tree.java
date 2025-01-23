class Solution {
    public boolean isValidSerialization(String preorder) {
        int temp = 1;
        String[] pre = preorder.split(",");

        for (String str : pre){
            temp -= 1;
            if(temp < 0) return false;
            if(!str.equals("#")) temp+=2;
        }
        return temp == 0;
    }
}