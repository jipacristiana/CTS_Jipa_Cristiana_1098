package jipa.cristiana.g1098.flyweight;

import java.util.HashMap;

public class SubscriptionFlyweight implements IFlyweight{

	private String name;
	private int price;
	private String date;
	
	public SubscriptionFlyweight(String name, int price, String date) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
	}

	@Override
	public void displayDetails(DisplaySubscriptionDetails details) {
		System.out.println("The subscription is " + this.name);
		System.out.println("The price is " + this.price);
		System.out.println("The subscription starts at " + this.date);
		System.out.println("The bonus reward is " + details.bonus + " and the number of private dance classes are " + details.privateDanceClases);
		
	}


	
}
