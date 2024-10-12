package topic_4_queue;

public class Main {

	public static void main(String[] args) {
		
		 Queue customerQueue = new Queue();
		 
		 // Adding customers to the queue
	     customerQueue.enqueue(new Customer("Cholo"));
	     customerQueue.enqueue(new Customer("Rymer"));
	     customerQueue.enqueue(new Customer("Stephen"));
	     
	     System.out.println();
	     customerQueue.displayQueue();
	     
	     // Serve 
	     customerQueue.dequeue();
	     
	     System.out.println();
	     customerQueue.displayQueue();


	}

}