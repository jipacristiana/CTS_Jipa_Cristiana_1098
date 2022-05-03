package jipa.cristiana.g1098.factory;

public class SubscriptionGold implements ISubscription{
	
	public static final String DEFAULT_BONUS = "30% off for the next month subscription price";

	private String name;
	private int price;
	private String date;
	private int privateDanceClass;
	private String bonus;
	
	public SubscriptionGold() {}
	
	
	public SubscriptionGold(String name, int price, String date, int privateDanceClass, String bonus) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
		this.privateDanceClass = privateDanceClass;
		this.bonus = bonus;
	}


	@Override
	public void print(String message) {
		System.out.println(message);
		
	}

	@Override
	public void buy() {
		System.out.println("The subscription was succesfully bought and the starting date is " + this.date);
		System.out.println("You received " + this.privateDanceClass + " dance classes. Added " + this.bonus + " in your account" );
		
	}

}
