package co.simplon.shop.product;

public abstract class Product {
	//Constructor
	public Product(String name, float sellingPrice, float buyingPrice) {
		this.name = name;
		this.sellingPrice = sellingPrice;
		this.buyingPrice = buyingPrice;
	}
	
	
	private String name;
	private float sellingPrice;
	private float buyingPrice;
	
	
	//Get Set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public float getBuyingPrice() {
		return buyingPrice;
	}
	public void setBuyingPrice(float buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
	

}
