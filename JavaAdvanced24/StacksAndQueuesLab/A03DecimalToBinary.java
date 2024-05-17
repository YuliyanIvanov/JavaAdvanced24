package StacksAndQueuesLab;

import java.util.Scanner;
import java.util.Stack;

public class A03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNumber = scanner.nextInt();

        if (decimalNumber == 0) {
            System.out.println("0");
            return;
        }

        Stack<Integer> stack = new Stack<>();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }

        StringBuilder binaryRepresentation = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryRepresentation.append(stack.pop());
        }

        System.out.println(binaryRepresentation);
    }
}
