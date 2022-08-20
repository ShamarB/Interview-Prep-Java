package Stack;
import java.util.*;

public class ValidParenthesis {
	
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

	public static void main(String[] args) {
		ValidParenthesis obj = new ValidParenthesis();
		String s = "()[]{}";
		boolean ans = obj.isValid(s);
		System.out.println(ans);
	}
}
