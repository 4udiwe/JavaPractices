import java.util.Stack;

public class Model {
    private static final Stack<Double> stack = new Stack<>();
    public static double evaluateRPN(String rpnExpression) {
        String[] rpn = rpnExpression.split(" ");

        for (String sign : rpn) {
            if (isNumber(sign)) {
                stack.push(Double.parseDouble(sign));
            }
            else if (isOperator(sign)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid RPN expression");
                }
                double num1 = stack.pop();
                double num2 = stack.pop();
                double result = Operation(sign, num1, num2);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Invalid token: " + sign);
            }
        }

        if (stack.size() == 1) {
            return stack.pop();
        } else {
            throw new IllegalArgumentException("Invalid RPN expression");
        }
    }
    private static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String str) {
        return str.matches("[+\\-*/]");
    }

    private static double Operation(String operator, double num1, double num2) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                yield num1 / num2;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}