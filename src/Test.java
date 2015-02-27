public class Test {

	public static void main(String[] args) {

		// Test with Strings
		
		DoublePriorityQueue<String> q = new DoublePriorityQueue<String>();

		q.enqueue("Bread", 1.99, 3);
		q.enqueue("Orange Juice", 2.49, 2);
		q.enqueue("Chocolate Bar", 0.89, 7);
		q.enqueue("Orange Juice", 2.49, 2);

		System.out.println("Count: " + q.count());

		System.out.println("Dequeued: " + q.dequeueA());

		System.out.println("Count: " + q.count());

		q.clear();

		System.out.println("Count: " + q.count());

		q.enqueue("first", 2, 7);
		q.enqueue("second", 0.45, 5.16);
		q.enqueue("third", 1.4, 2.1);

		System.out.println("Count: " + q.count());

		System.out.println("Dequeued: " + q.dequeueFirst());

		System.out.println("Dequeued: " + q.dequeueB());
		
		// Test with integers
		
		DoublePriorityQueue<Integer> q2 = new DoublePriorityQueue<Integer>();
		
		q2.enqueue(3, 1.99, 3);
		q2.enqueue(6, 2.49, 2);
		q2.enqueue(2, 0.89, 7);
		q2.enqueue(6, 2.49, 2);

		System.out.println("Count: " + q2.count());

		System.out.println("Dequeued: " + q2.dequeueA());
		
	}

}
