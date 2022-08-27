package Stack;
import java.util.*;

public class ReversePolishNotation {
	
	public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String x : tokens) {
            if (x.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            }
            else if (x.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a * b);
            }
            else if (x.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            }
            else if (x.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            }
            else {
                stack.push(Integer.parseInt(x));
            }
        }
        return stack.peek();
    }

	public static void main(String[] args) {
		String[] tokens = {"2","1","+","3","*"};
		ReversePolishNotation obj = new ReversePolishNotation();
		int ans = obj.evalRPN(tokens);
		System.out.println(ans);

	}

}
