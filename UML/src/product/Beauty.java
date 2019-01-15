package product;

public class Beauty extends Product {
	
	private boolean containsParaben;
	
	public Beauty(int quantity, String name, float sellingPrice, float buyingPrice) {
		super(quantity, name, sellingPrice, buyingPrice);
		// TODO Auto-generated constructor stub
	}

	
	//Getters et Setters 
	public boolean isContainsParaben() {
		return containsParaben;
	}

	public void setContainsParaben(boolean containsParaben) {
		this.containsParaben = containsParaben;
	}


}
