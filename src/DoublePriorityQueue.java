import java.util.ArrayList;

public class DoublePriorityQueue<T> {
	
	private ArrayList<Item<T>> queue;
	
	public DoublePriorityQueue() {
		queue = new ArrayList<Item<T>>();
	}
	
	public void enqueue(T name, double priA, double priB) {
		queue.add(new Item<T>(name, priA, priB));
	}
	
	public T dequeueA() {
		double highestVal = 0;
		Item<T> highestItem = null;
		for (Item<T> item : queue) {
			if (item.priA > highestVal) {
				highestVal = item.priA;
				highestItem = item;
			}
		}
		queue.remove(highestItem);
		return highestItem.name;
	}
	
	public T dequeueB() {
		double highestVal = 0;
		Item<T> highestItem = null;
		for (Item<T> item : queue) {
			if (item.priB > highestVal) {
				highestVal = item.priB;
				highestItem = item;
			}
		}
		queue.remove(highestItem);
		return highestItem.name;
	}
	
	public T dequeueFirst() {
		Item<T> item = queue.get(0);
		queue.remove(0);
		return item.name;
	}
	
	public int count() {
		return queue.size();
	}
	
	public void clear() {
		queue.clear();
	}
	
	private class Item<Type> {
		
		protected Type name;
		protected double priA, priB;
		
		protected Item(Type name, double priA, double priB) {
			this.name = name;
			this.priA = priA;
			this.priB = priB;
		}
	}

}
