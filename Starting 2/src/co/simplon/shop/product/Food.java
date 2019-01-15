package co.simplon.shop.product;

public class Food extends Product {
	//Constructor
	public Food(String name, float sellingPrice, float buyingPrice, boolean containsGluten) {
		super(name, sellingPrice, buyingPrice);
		this.containsGluten = containsGluten;
	}

	
	private boolean containsGluten;

	
	
	//Get Set
	public boolean isContainsGluten() {
		return containsGluten;
	}

	public void setContainsGluten(boolean containsGluten) {
		this.containsGluten = containsGluten;
	}

	
}
