class MyQueue {

    Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        return popOrPeekHelper(true);
    }
    
    public int peek() {
        return popOrPeekHelper(false);
    }

    private int popOrPeekHelper(boolean remove) {
        if(remove && stack.isEmpty()) {
            return -1;
        }

        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        int queueTop = temp.peek();
        if(remove) {
            temp.pop();
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