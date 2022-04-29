package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("India");
		queue.add("Germany");
		queue.add("America");
		
		System.out.println("Original Queue: " + queue);
		
		queue.remove();
		System.out.println("After removing head: " + queue);
		
		String head = queue.peek();
		System.out.println("Queue Head: "+head);
		
		head = queue.poll();
		System.out.println("Removed head: "+ head);
		
		System.out.println(queue);

	}

}
