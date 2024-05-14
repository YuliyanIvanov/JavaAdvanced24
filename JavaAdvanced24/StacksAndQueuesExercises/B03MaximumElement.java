package StacksAndQueuesExercises;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class B03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(scanner.nextLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
                if (maxStack.isEmpty() || x >= maxStack.peek()) {
                    maxStack.push(x);
                }
            } else if (type == 2) {
                int removedElement = stack.pop();
                if (removedElement == maxStack.peek()) {
                    maxStack.pop();
                }
            } else if (type == 3) {
                System.out.println(maxStack.peek());
            }
        }
    }
}
