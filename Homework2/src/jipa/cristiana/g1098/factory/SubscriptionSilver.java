package jipa.cristiana.g1098.factory;

public class SubscriptionSilver implements ISubscription{

	public static final int DEFAULT_PRIVATE_DANCE_CLASSES = 3;
			
	private String name;
	private int price;
	private String date;
	private int privateDanceClass;
	
	public SubscriptionSilver() {}
	
	public SubscriptionSilver(String name, int price, String date, int privateDanceClass) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
		this.privateDanceClass = privateDanceClass;
	}

	
	@Override
	public void print(String message) {
		System.out.println(message);
		
	}

	@Override
	public void buy() {
		System.out.println("The subscription was succesfully bought and the starting date is " + this.date);
		System.out.println("You received " + this.privateDanceClass + " dance classes.");
		
		
	}

}
