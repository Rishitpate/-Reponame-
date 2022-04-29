package Collections;

import java.util.Stack;

public class StacksDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("America");
		stack.push("Germany");
		stack.push("India");
		
		System.out.println("Stack: " + stack);
		
		String poppedElement = stack.pop();
		System.out.println(poppedElement);
		
		System.out.println(stack);
		
		String topelement = stack.peek();
		System.out.println(topelement);

		System.out.println(stack);
		
	}

}
