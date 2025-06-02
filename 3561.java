class Solution {
    public String resultingString(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && (Math.abs(stack.peek() - ch) == 1 || 
                                     (stack.peek() == 'a' && ch == 'z') || 
                                     (stack.peek() == 'z' && ch == 'a'))) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        
        return result.toString();
    }
}
