package foodWasteReductionSystem;
import java.util.PriorityQueue;

public class FoodPriorityManager {
	
	private PriorityQueue<FoodItem> foodQueue;
	
	public FoodPriorityManager() {
		foodQueue = new PriorityQueue<>();
	}
	
	public void addFood (FoodItem food) {
		//offer is a method used to insert elements
		foodQueue.offer(food);
	}
	
	//Allows you to see the next item 
	public FoodItem getNextFood() {
		return foodQueue.peek();
	}
	
	public FoodItem removeNextFood() {
	    return foodQueue.poll();
	}
	
	//just to check how many items are in the Queue
	public int getSize() {
	    return foodQueue.size();
	}
	
	public boolean isEmpty() {
	    return foodQueue.isEmpty();
	}

	public void displayQueue() {
	    System.out.println(foodQueue);
	}
	

}
