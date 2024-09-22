class Solution {
    public boolean isValid(String s) {
        if ((s.length() & 1 ) == 1 ) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '('){
                stack.push(')');
            } else if (c == '[' ){
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {
                if (!stack.empty() && c == ')' && c == stack.peek()) {
                    stack.pop();
                } else if (!stack.empty() && c == ']' && c == stack.peek()) {
                    stack.pop();
                } else if (!stack.empty() && c == '}' && c == stack.peek()) {
                    stack.pop();
                }  else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}