// Last updated: 9/27/2026, 4:28:23 PM
import java.util.*;

class MyQueue {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        move();
        return out.pop();
    }

    public int peek() {
        move();
        return out.peek();
    }

    public boolean empty() {
        return in.empty() && out.empty();
    }

    void move() {
        if (out.empty()) {
            while (!in.empty())
                out.push(in.pop());
        }
    }
}