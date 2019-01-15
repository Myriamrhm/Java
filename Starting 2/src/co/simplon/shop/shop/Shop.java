package co.simplon.shop.shop;

import java.util.HashSet;

public class Shop {
	//Constructor
	public Shop(String name, float stocksValue, float turnOver, float profit) {
		super();
		this.name = name;
		this.stocksValue = stocksValue;
		this.turnOver = turnOver;
		this.profit = profit;
	}
	
	
	private String name;
	private float stocksValue;
	private float turnOver;
	private float profit;
	// TypeCollection de type de Nom
	private HashSet<Stock> stocks = new HashSet<Stock>();
	
	
	
	
	
	//Get Set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getStocksValue() {
		return stocksValue;
	}
	public void setStocksValue(float stocksValue) {
		this.stocksValue = stocksValue;
	}
	public float getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(float turnOver) {
		this.turnOver = turnOver;
	}
	public float getProfit() {
		return profit;
	}
	public void setProfit(float profit) {
		this.profit = profit;
	}
	public HashSet<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(HashSet<Stock> stocks) {
		this.stocks = stocks;
	}
		

}
