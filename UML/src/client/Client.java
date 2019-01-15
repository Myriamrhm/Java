package client;

public class Client {
	
	private String name;
	private float credit;
	
	//Constructor 
	public Client(String name, float credit) {
		super();
		this.name = name;
		this.credit = credit;
	}
	
	//Getters et Setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getCredit() {
			return credit;
		}

		public void setCredit(float credit) {
			this.credit = credit;
		}
		
	public void buySomething() {
		
		// return shop/product/quantity
		
	}
	
}
