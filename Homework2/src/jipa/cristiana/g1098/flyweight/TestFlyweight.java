package jipa.cristiana.g1098.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		
		SubscriptionFlyweight subscription1 = (SubscriptionFlyweight)SubscriptionFactory.getSubscription(ESubscriptionTypes.BASIC_SUBSCRIPTION);
		subscription1.displayDetails(new DisplaySubscriptionDetails("10% off for the next 2 months subscription price", 1));
		System.out.println(" ");
		
		SubscriptionFlyweight subscription2 = (SubscriptionFlyweight)SubscriptionFactory.getSubscription(ESubscriptionTypes.SILVER_SUBSCRIPTION);
		subscription2.displayDetails(new DisplaySubscriptionDetails("20% off for the next month subscription price", 2));
		System.out.println(" ");
		
		SubscriptionFlyweight subscription3 = (SubscriptionFlyweight)SubscriptionFactory.getSubscription(ESubscriptionTypes.GOLD_SUBSCRIPTION);
		subscription3.displayDetails(new DisplaySubscriptionDetails("30% off for the next month subscription price", 3));
		System.out.println(" ");
		
	}

}
