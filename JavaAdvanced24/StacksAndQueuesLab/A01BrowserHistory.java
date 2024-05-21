package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class A01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> history = new ArrayDeque<>();
        Deque<String> forward = new ArrayDeque<>();
        String currentURL = "";

        label:
        while (true) {
            String command = scanner.nextLine();

            switch (command) {
                case "Home":
                    break label;
                case "back":
                    if (history.isEmpty()) {
                        System.out.println("no previous URLs");
                    } else {
                        forward.addFirst(currentURL);
                        currentURL = history.pop();
                        System.out.println(currentURL);
                    }
                    break;
                case "forward":
                    if (forward.isEmpty()) {
                        System.out.println("no next URLs");
                    } else {
                        currentURL = forward.pop();
                        history.push(currentURL);
                        System.out.println(currentURL);
                    }
                    break;
                default:
                    if (!currentURL.isEmpty()) {
                        history.push(currentURL);
                        forward.clear();
                    }
                    currentURL = command;
                    System.out.println(currentURL);
                    break;
            }
        }
    }
}

