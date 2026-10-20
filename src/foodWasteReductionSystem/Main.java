package foodWasteReductionSystem;

public class Main {

	public static void main(String[] args) {
		//instantiated a new object called manager
		FoodPriorityManager manager = new FoodPriorityManager();
		
		manager.addFood(new FoodItem("Milk", "2026-10-22"));
		manager.addFood(new FoodItem("Apple", "2026-11-15"));
		
		manager.displayQueue();
		
		System.out.println("Current Queue size: " + manager.getSize());
		
		System.out.println(manager.getNextFood());
		System.out.println("Remvoing: " + manager.removeNextFood());
		System.out.println("Next food is: "+ manager.getNextFood());
		
		System.out.println("Size of Queue AFTER removal: " + manager.getSize());
		
		manager.removeNextFood();
		
		System.out.println("Queue Empty? " + manager.isEmpty());

	}

}
