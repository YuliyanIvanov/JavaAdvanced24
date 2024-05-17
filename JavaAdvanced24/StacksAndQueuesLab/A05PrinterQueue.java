package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class A05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> queue = new ArrayDeque<>();

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("print")) {
                break;
            } else if (command.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    String canceledFile = queue.pollFirst();
                    System.out.println("Canceled " + canceledFile);
                }
            } else {
                queue.offer(command);
            }
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.pollFirst());
        }
    }
}

