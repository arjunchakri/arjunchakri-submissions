class MyQueue {

    Stack<Integer> stack;
    Integer cachedTop;

    public MyQueue() {
        stack = new Stack();
        cachedTop = null;
    }
    
    public void push(int x) {
        if(stack.isEmpty()) {
            cachedTop = x;
        }
        stack.push(x);
    }
    
    public int pop() {
        return popOrPeekHelper();
    }
    
    public int peek() {
        if(stack.isEmpty()) {
            return -1;
        }
        return cachedTop;
    }

    private int popOrPeekHelper() {
        if(stack.isEmpty()) {
            return -1;
        }

        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        int queueTop = temp.peek();
        temp.pop();
        
        if(!temp.isEmpty()) {
            cachedTop = temp.peek();
        }
        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return queueTop;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */