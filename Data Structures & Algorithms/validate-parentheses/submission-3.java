class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == ')' || ch == '}' || ch == ']') {
                if(stack.isEmpty()) {
                    return false;
                }
                char popch = stack.pop();
                if(ch == ')' && !(popch == '(')) {
                    return false;
                }
                else if(ch == '}' && !(popch == '{')) {
                    return false;
                }
                else if(ch == ']' && !(popch == '[')) {
                    return false;
                }
            }
            else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}
