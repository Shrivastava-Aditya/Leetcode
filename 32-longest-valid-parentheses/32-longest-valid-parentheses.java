class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        
        int length = 0;
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                length = Math.max(length,i - stack.peek()) ;
                }
            }
        }
        return length;
    }
}