package co.simplon.shop.order;

import co.simplon.shop.client.Client;
import co.simplon.shop.product.Product;
import co.simplon.shop.shop.Shop;
//Constructor
public class Order {
	public Order(int quantity, boolean delivered, Client client, Shop shop, Product product) {
		this.quantity = quantity;
		this.delivered = delivered;
		this.client = client;
		this.shop = shop;
		this.product = product;
	}
	
	
	private int quantity;
	private boolean delivered;
	private Client client;
	private Shop shop;
	private Product product;
	
	//Get Set
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
