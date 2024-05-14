package StacksAndQueuesExercises;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class B03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(scanner.nextLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int X = Integer.parseInt(st.nextToken());
                stack.push(X);
                if (maxStack.isEmpty() || X >= maxStack.peek()) {
                    maxStack.push(X);
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
