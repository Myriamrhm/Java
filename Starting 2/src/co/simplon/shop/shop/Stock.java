package co.simplon.shop.shop;

import co.simplon.shop.product.Product;
//Constructor
public class Stock {
	public Stock(int quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}
	
	
	private int quantity;
	private Product product;
	
	
	
	//Get Set
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

}