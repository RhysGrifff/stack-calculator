import java.util.Stack;

public class Calculator {

	Stack<Integer> stack = new Stack<>(); 
	
	public String toString() {
		
		
		
		return null;
		
		
	}
	
	
	public void loadConstant(int i){
		
		stack.push(i);
	
	}

	public void add() {
		int val1 = stack.pop();
		int val2 = stack.pop();
		int val3 = val2 + val1;
		stack.push(val3);
		
	}

	
	public void subtract() {
		int val1 = stack.pop();
		int val2 = stack.pop();
		int val3 = val2 - val1;
		stack.push(val3);
	
	}
	
	public void multiply() {
		int val1 = stack.pop();
		int val2 = stack.pop();
		int val3 = val2 * val1;
		stack.push(val3);
	}
	
	public void divide() {
		int val1 = stack.pop();
		int val2 = stack.pop();
		int val3 = val2 /val1;
		stack.push(val3);
	}
		
	public void total() {
		int total = 0;
		while (stack.isEmpty()) {
			total += stack.pop();
		}
		stack.push(total);
	}
}

