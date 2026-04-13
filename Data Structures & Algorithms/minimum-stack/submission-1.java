class MinStack {

    Stack<Integer> stack = null;
    PriorityQueue<Integer> queue = null;
    public MinStack() {
        stack = new Stack<>();
        queue = new PriorityQueue<>();
    }
    
    public void push(int val) {
        stack.push(val);
        queue.add(val);
    }
    
    public void pop() {
        int val = top();
        stack.pop();
        queue.remove(val);
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return queue.peek();
    }
}
