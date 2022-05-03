package jipa.cristiana.g1098.factory;

public class Subscription implements ISubscription {
	
	private String name;
	private int price;
	private String date;
	
	
	public Subscription() {}

	public Subscription(String name, int price, String date) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
	}

	@Override
	public void print(String message) {
		System.out.println(message);
		
	}

	@Override
	public void buy() {
		System.out.println("The subscription was succesfully bought and the starting date is " + this.date);
		
	}

}
