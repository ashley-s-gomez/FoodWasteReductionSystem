package foodWasteReductionSystem;

public class Main {

	public static void main(String[] args) {
		//instantiated a new object called inventory
		FoodInventorySystem inventory = new FoodInventorySystem();
		
		FoodItem milk = new FoodItem(1, "Milk", "Dairy", 5, "2026-10-22", false);
		inventory.addFood(milk);
		milk.setQuantity(3);
		

		inventory.addFood(new FoodItem(2, "Apple", "Fruit", 10, "2026-11-15", false));
		inventory.addFood(new FoodItem(3, "Cheese", "Dairy", 2, "2026-10-18", false));
		inventory.addFood(new FoodItem(4, "Bread", "Bakery", 4, "2026-10-20", false));
		inventory.addFood(new FoodItem(5, "Yogurt", "Dairy", 6, "2026-10-19", false));
		inventory.addFood(new FoodItem(6, "Chicken", "Meat", 8, "2026-10-17", false));
		inventory.addFood(new FoodItem(7, "Lettuce", "Vegetable", 3, "2026-10-21", false));

		System.out.println( "Next food name: " + inventory.getNextFood().getName());
		
		inventory.displayQueue();
		
		System.out.println("Current Queue size: " + inventory.getSize());
		
		System.out.println(inventory.getNextFood());
		System.out.println("Removing: " + inventory.removeNextFood());
		System.out.println("Next food is: "+ inventory.getNextFood());
		
		System.out.println("Size of Queue AFTER removal: " + inventory.getSize());
		
		inventory.removeNextFood();
		
		System.out.println("Queue Empty? " + inventory.isEmpty());

	}

}
