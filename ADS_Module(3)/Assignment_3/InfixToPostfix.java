// Infix to Postfix



//package problem5;

public class InfixToPostfix {

    public static String infixToPostfix(String expression) {
        char[] exp = expression.toCharArray();
        int n = exp.length;
        char[] stack = new char[n];
        int top = -1;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char token = exp[i];

            if (token == ' ') {
                continue; // Skip spaces
            }

            if (isOperand(token)) {
                result.append(token).append(" ");
            } else if (token == '(') {
                stack[++top] = token;
            } else if (token == ')') {
                while (top >= 0 && stack[top] != '(') {
                    result.append(stack[top--]).append(" ");
                }
                top--; // Pop '('
            } else {
                while (top >= 0 && precedence(stack[top]) >= precedence(token)) {
                    result.append(stack[top--]).append(" ");
                }
                stack[++top] = token;
            }
        }

        while (top >= 0) {
            result.append(stack[top--]).append(" ");
        }

        return result.toString().trim();
    }

    private static boolean isOperand(char token) {
        return Character.isLetterOrDigit(token);
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '(':
                return 0;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        String input1 = "A + B * C";
        String input2 = "A * B + C / D";

        System.out.println(infixToPostfix(input1)); // A B C * +
        System.out.println(infixToPostfix(input2)); // A B * C D / +
    }
}