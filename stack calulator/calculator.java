package topic_3_stack_calculator;

import java.util.Scanner;

public class Calculator {
    private Stack stack;

    public Calculator() {
        stack = new Stack(10); // Create a stack of size 10
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEnter a number (0-9) to push to the stack, or an operation (+, -, *, /) to perform:");
            System.out.println("Type 'exit' to quit.");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                exit = true;
            } else if (isNumeric(input)) {
                int value = Integer.parseInt(input);
                if (value >= 0 && value <= 9) {
                    stack.push(value);
                    System.out.println("Pushed " + value + " onto the stack.");
                } else {
                    System.out.println("Please enter a number between 0 and 9.");
                }
            } else {
                performOperation(input);
            }
            displayStack();
        }

        scanner.close();
    }

    private void performOperation(String operation) {
        if (stack.size() < 2) {
            System.out.println("Not enough elements in the stack for calculation.");
            return;
        }

        int b = stack.pop();
        int a = stack.pop();
        int result;

        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                    stack.push(a); // Push back the operands
                    stack.push(b);
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operation. Please use +, -, *, or /.");
                stack.push(a); // Push back the operands
                stack.push(b);
                return;
        }

        stack.push(result);
        System.out.println("Result: " + result);
    }

    private void displayStack() {
        System.out.print("Current stack: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    private boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }
}
