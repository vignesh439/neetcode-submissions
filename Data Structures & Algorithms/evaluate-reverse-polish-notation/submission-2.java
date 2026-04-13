class Solution {
    public int evalRPN(String[] tokens) {
        //Stack
        Stack<Integer> stack = new Stack<>();

        if(tokens.length == 0) {
            return 0;
        }

        for(int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);

            if(tokens[i].equals("+")) {
                stack.push(stack.pop() + stack.pop());
            }
            else if(tokens[i].equals("-")){
                int val1 = stack.pop();
                int val2 = stack.pop();
                stack.push(val2 - val1);
            }
            else if(tokens[i].equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(tokens[i].equals("/")){
                int val1 = stack.pop();
                int val2 = stack.pop();
                stack.push(val2 / val1);
            }
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
