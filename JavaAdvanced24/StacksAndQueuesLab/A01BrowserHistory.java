package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class A01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> history = new ArrayDeque<>();
        String currentURL = "";

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("Home")) {
                break;
            } else if (command.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    currentURL = history.pop();
                    System.out.println(currentURL);
                }
            } else {
                if (!currentURL.isEmpty()) {
                    history.push(currentURL);
                }
                currentURL = command;
                System.out.println(currentURL);
            }
        }
    }
}
