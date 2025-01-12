class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if(ch==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
                continue;
            }
            stack.push(ch);
        }
        return stack.size();
    }
}