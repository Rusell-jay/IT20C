package topic_2_linkedlist_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings to add to the linked list (enter 'exit' to stop): ");
        String data;
        while (!(data = scanner.nextLine()).equalsIgnoreCase("exit")) {
            list.add(data);
        }

        System.out.println("Linked list created:");
        list.printList();

        System.out.println("Enter a string to delete:");
        String deleteData = scanner.nextLine();
        list.deleteByValue(deleteData);
        System.out.println("Linked list after deletion:");
        list.printList();

        scanner.close();
    }
}