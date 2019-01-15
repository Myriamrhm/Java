package shop;

import java.util.HashSet;

import product.Product;

public class Shop {

	private String name;
	private float stockValue;
	private float turnover; // Chiffres d'affaire
	private float profit;
	
	//l'instance pour la collection HashSet 
	HashSet<Product> Stock = new HashSet <Product>();
	
	
	public void sellProduct() {
		
	}
	
	//La méthode qui utilise la collection HashSet 
	public void addProductToStock(Product product) {
		Stock.add(product);
		Stock.remove(product);
		
	}
	
	//Conctructeur de Shop 
	public Shop(String name, float stockValue, float turnover, float profit) {
		super();
		this.name = name;
		this.stockValue = stockValue;
		this.turnover = turnover;
		this.profit = profit;
	}

}
