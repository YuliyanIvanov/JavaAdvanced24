package StacksAndQueuesLab;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kids = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        Queue<String> queue = new LinkedList<>();
        Collections.addAll(queue, kids);

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.add(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }

        System.out.println("Last is " + queue.poll());
    }
}
