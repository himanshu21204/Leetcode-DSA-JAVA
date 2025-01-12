class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> list = new Stack<>();
        int start = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                list.push(')');
            } else if(s.charAt(i)=='{'){
                list.push('}');
            } else if(s.charAt(i)=='['){
                list.push(']');
            } else if(list.isEmpty() || list.pop()!=s.charAt(i)){
                return false;
            }
        }
        return list.isEmpty();
    }
}

// class Solution {
//     public boolean isValid(String s) {
//       if(s.length()%2!=0) return false;
//       int start = 0;
//       int end = start + 1;
//       while(end < s.length() && start < s.length()-1){
//           if((s.charAt(start)=='(' && s.charAt(end)!=')') || (s.charAt(start)=='{' && s.charAt(end)!='}') || (s.charAt(start)=='[' && s.charAt(end)!=']')){
//               return false;
//           }
//           start++;
//           end++;
//       }
//       return true;
//     }
// }