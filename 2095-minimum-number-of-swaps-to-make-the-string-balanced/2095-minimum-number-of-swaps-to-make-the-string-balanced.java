class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if(ch==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            if(ch=='['){
                stack.push(ch);
            }
        }
        return stack.size()%2==0?stack.size()/2:(stack.size()+1)/2;
    }
}