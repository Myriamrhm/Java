package co.simplon.shop.product;

public class Beauty extends Product {
	
	//Constructor
	public Beauty(String name, float sellingPrice, float buyingPrice, boolean containsParaben) {
		super(name, sellingPrice, buyingPrice);
		this.containsParaben = containsParaben;
	}

	private boolean containsParaben;

	//Get Set
	public boolean isContainsParaben() {
		return containsParaben;
	}

	public void setContainsParaben(boolean containsParaben) {
		this.containsParaben = containsParaben;
	}

	

}
