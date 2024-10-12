package topic_3_stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Peek at the top element");
            System.out.println("4. Display the stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int topValue = stack.peek();
                    if (topValue != -1) {
                        System.out.println("Top element: " + topValue);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}