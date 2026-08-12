// Last updated: 8/12/2026, 12:22:14 PM
class MinStack {

    private Stack<Integer> s;
    private Stack<Integer> ms;

    public MinStack() {
        s = new Stack<>();
        ms = new Stack<>();
    }
    
    public void push(int value) {
        s.push(value);
        if(ms.isEmpty() || value <= ms.peek()){
            ms.push(value);
        }
    }
    
    public void pop() {
        if(s.peek().equals(ms.peek())){
            ms.pop();
        }

        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return ms.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */