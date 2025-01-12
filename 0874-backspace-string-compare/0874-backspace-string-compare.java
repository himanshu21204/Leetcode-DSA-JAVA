class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();   
        Stack<Character> s2 = new Stack<>(); 

        for(char ch : s.toCharArray()){
            if(ch != '#'){
                s1.push(ch);
            }else{
                if(!s1.isEmpty()) s1.pop();
            }
        }  
        for(char ch : t.toCharArray()){
            if(ch != '#'){
                s2.push(ch);
            }else{
                if(!s2.isEmpty()) s2.pop();
            }
        }  
        
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.pop() != s2.pop()) return false;
        }
        return s1.isEmpty() && s2.isEmpty();
    }
}