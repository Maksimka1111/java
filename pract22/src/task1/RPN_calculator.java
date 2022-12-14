package task1;

import java.util.EmptyStackException;
import java.util.Stack;

public class RPN_calculator {

    public static double compute(String expr) throws
            ArithmeticException,
            EmptyStackException {
        Stack<Double> stack = new Stack<>();

        System.out.println(expr);

        for (String token : expr.split("\\s+")) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                default: ;
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }
        double d = stack.pop();
        System.out.println(d);
        return d;
    }
    public static void main(String[] args) {
        try {
            compute("2 3 4 5 6 * + - /");
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}
