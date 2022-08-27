package Stack;
import java.util.*;

public class MinStack {
	
	Stack<Integer> stack = new Stack<>();
    Stack<Integer> minVals = new Stack<>();
    
    public void push(int val) {
        if (minVals.isEmpty() || val <= minVals.peek()) {
            minVals.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if (stack.peek().equals(minVals.peek())) {
            minVals.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minVals.peek();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
