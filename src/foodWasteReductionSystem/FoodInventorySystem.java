package foodWasteReductionSystem;

public class FoodInventorySystem {

    private FoodPriorityManager manager;

        public FoodInventorySystem() {
            manager = new FoodPriorityManager();
    }

    public void addFood(FoodItem food) {
        manager.addFood(food);
    }

    public FoodItem getNextFood() {
        return manager.getNextFood();
    }

    public int getSize() {
        return manager.getSize();
    }

    public FoodItem removeNextFood() {
        return manager.removeNextFood();
    }

    public boolean isEmpty() {
        return manager.isEmpty();
    }

    public void displayQueue() {
        manager.displayQueue();
    }
    
}
