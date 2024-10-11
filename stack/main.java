package topic_3_stack;


public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Top element is: " + stack.peek());
        System.out.println();
        
        //Use case
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Stack size after pop: " + stack.size());
        
        System.out.println();
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
	}

}