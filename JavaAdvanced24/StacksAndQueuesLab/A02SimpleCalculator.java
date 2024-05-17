package StacksAndQueuesLab;

import java.util.Scanner;
import java.util.Stack;

public class A02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        String[] tokens = expression.split(" ");
        Stack<Integer> stack = new Stack<>();
        int currentSign = 1;

        for (String token : tokens) {
            if (token.equals("+")) {
                currentSign = 1;
            } else if (token.equals("-")) {
                currentSign = -1;
            } else {
                int number = Integer.parseInt(token);
                stack.push(currentSign * number);
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println(result);
    }
}
