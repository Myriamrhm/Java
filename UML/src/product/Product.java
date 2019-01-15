package product;

public abstract class Product {
	
	private int quantity;
	private String name;
	private float sellingPrice;
	private float buyingPrice;
	
	
	//constructeur pour Product 
	public Product(int quantity, String name, float sellingPrice, float buyingPrice) {
		
		this.quantity = quantity;
		this.name = name;
		this.sellingPrice = sellingPrice;
		this.buyingPrice = buyingPrice;
	}


	//Getters et Setters
	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


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
