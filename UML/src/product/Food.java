package product;

public class Food extends Product {
	
	private boolean containsGlutten; 
	
	public Food(int quantity, String name, float sellingPrice, float buyingPrice) {
		super(quantity, name, sellingPrice, buyingPrice);
		// TODO Auto-generated constructor stub
	}

	//Getters et Setters 
	public boolean isContainsGlutten() {
		return containsGlutten;
	}

	public void setContainsGlutten(boolean containsGlutten) {
		this.containsGlutten = containsGlutten;
	}
	
	
}
