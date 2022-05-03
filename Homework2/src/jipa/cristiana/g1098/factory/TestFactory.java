package jipa.cristiana.g1098.factory;

public class TestFactory {
	
	public static void main(String[] args) {
		
		ISubscription basicSub = FactorySubscription.createSubscription(ESubscriptionTypes.BASIC_SUBSCRIPTION, "Basic Subscription", 100, "01.05.2022"); 
		ISubscription silverSub = FactorySubscription.createSubscription(ESubscriptionTypes.SILVER_SUBSCRIPTION, "Silver Subscription", 200, "02.05.2022");
		ISubscription goldSub = FactorySubscription.createSubscription(ESubscriptionTypes.GOLD_SUBSCRIPTION, "Gold Subscription", 300, "03.05.2022");
		
		basicSub.buy();
		System.out.println();
		silverSub.buy();
		System.out.println();
		goldSub.buy();
	}

}
