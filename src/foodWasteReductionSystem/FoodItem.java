package foodWasteReductionSystem;

public class FoodItem implements Comparable<FoodItem> {
	private String name;
	private String expirationDate;
	
	private int foodId;
	private String category;
	private int quantity;
	private boolean wasted;
	    
	
		public FoodItem(String name, String expirationDate) {
	        this.name = name;
	        this.expirationDate = expirationDate;
	    }

		@Override
		//used to compare the expiration dates of the food
		public int compareTo(FoodItem other) {
		  return this.expirationDate.compareTo(other.expirationDate);
		}
		
		@Override
		//used to format how the date appears in the console
		public String toString() {
		   return name + " expires on " + expirationDate;
		}

}
