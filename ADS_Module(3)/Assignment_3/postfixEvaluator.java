//postfix expression


//package problem4;

public class postfixEvaluator {

	public static int evaluatePostfix(String expression) {
		String[] tokens = expression.split(" ");
		int n = tokens.length;
		int[] stack = new int[n];
		int top = -1;

		for (int i = 0; i < n; i++) {
			String token = tokens[i];

			if (isNumber(token)) {
				stack[++top] = Integer.parseInt(token);
			} else {
				int operand2 = stack[top--];
				int operand1 = stack[top--];
				int result = performOperation(operand1, operand2, token);
				stack[++top] = result;
			}
		}
		return stack[top];
	}

	private static boolean isNumber(String token) {
		try {
				Integer.parseInt(token);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static int performOperation(int operand1, int operand2, String operator) {
		switch (operator) {
		case "+":
			return operand1 + operand2;
		case "-":
			return operand1 - operand2;
		case "*":
			return operand1 * operand2;
		case "/":
			return operand1 / operand2;
		default:
			throw new IllegalArgumentException("Invalid operator: " + operator);
		}
	}

	public static void main(String[] args) {
		String input1 = "5 3 + 2 *";
		String input2 = "4 5 * 6 /";

		System.out.println(evaluatePostfix(input1)); // 16
		System.out.println(evaluatePostfix(input2)); // 3
	}
}