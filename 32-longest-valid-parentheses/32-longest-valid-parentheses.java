class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        
        /*
        1. Stack solution
            a. push -1
            b. push if bracket open
            c. else pop
            d. if stack becomes empty then push i
            e. length = max(len,i - stack.peek)
            
            f. return length
        */
        
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