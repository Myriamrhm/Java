package co.simplon.shop.product;

public class Clothing extends Product {
	//Constructor
	public Clothing(String name, float sellingPrice, float buyingPrice, ClothingSize size) {
		super(name, sellingPrice, buyingPrice);
		this.size = size;
	}

	
	private ClothingSize size;

	
	//Get Set
	public ClothingSize getSize() {
		return size;
	}

	public void setSize(ClothingSize size) {
		this.size = size;
	}

}
