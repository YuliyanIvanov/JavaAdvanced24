package StacksAndQueuesExercises;

import java.util.Scanner;
import java.util.Stack;

public class B05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sequence = scanner.nextLine().trim();
        scanner.close();

        Stack<Character> stack = new Stack<>();

        for (char c : sequence.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '{' && closing == '}') || (opening == '[' && closing == ']') || (opening == '(' && closing == ')');
    }
}