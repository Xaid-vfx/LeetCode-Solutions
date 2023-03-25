class MinStack {

    int min;
    Stack<Integer> stack;
    Stack<Integer> mstack;
    public MinStack() {
        stack = new Stack<Integer>();
        mstack = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if( mstack.isEmpty() || val <= mstack.peek()){
            mstack.push(val);
        }
    }
    
    public void pop() {
        int s = stack.peek();
        if( s == mstack.peek()){
            mstack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
