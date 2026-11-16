package foodWasteReductionSystem;

public class FoodItem implements Comparable<FoodItem> {
	private String name;
	private String expirationDate;
	private int foodId;
	private String category;
	private int quantity;
	private boolean wasted;
	    
	
		public FoodItem(int foodId, String name, String category, int quantity, String expirationDate, boolean wasted) {
			this.foodId = foodId;
			this.name = name;
			this.category = category;
			this.quantity = quantity;
			this.expirationDate = expirationDate;
			this.wasted = wasted;
}

		public int getFoodId() {
			return foodId;
		}

		public String getName() {
			return name;
		}

		public String getCategory() {
			return category;
		}

		public int getQuantity() {
			return quantity;
		}

		public String getExpirationDate() {
			return expirationDate;
		}

		public boolean isWasted() {
			return wasted;
		}

		public void setQuantity(int quantity) {
   			 this.quantity = quantity;
		}

		public void setWasted(boolean wasted) {
    		this.wasted = wasted;
		}

		@Override
		//used to compare the expiration dates of the food
		public int compareTo(FoodItem other) {
		  return this.expirationDate.compareTo(other.expirationDate);
		}
		
		@Override
		//used to format how the date appears in the console
		public String toString() {
    		return "ID: " + foodId +
           		   ", Name: " + name +
           		   ", Category: " + category +
           		   ", Quantity: " + quantity +
           		   ", Expiration: " + expirationDate +
           		   ", Wasted: " + wasted;

		}



}
