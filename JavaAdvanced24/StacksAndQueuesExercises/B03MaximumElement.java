package StacksAndQueuesExercises;

import java.util.Scanner;
import java.util.Stack;

public class B03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            int type = Integer.parseInt(command[0]);

            int x = 0;
            if (command.length > 1) {
                x = Integer.parseInt(command[1]);
            }

            switch (type) {
                case 1 -> {
                    stack.push(x);
                    if (maxStack.isEmpty() || x >= maxStack.peek()) {
                        maxStack.push(x);
                    }
                }
                case 2 -> {
                    int removedElement = stack.pop();
                    if (removedElement == maxStack.peek()) {
                        maxStack.pop();
                    }
                }
                case 3 -> System.out.println(maxStack.peek());
                default -> {
                }
            }
        }
    }
}
