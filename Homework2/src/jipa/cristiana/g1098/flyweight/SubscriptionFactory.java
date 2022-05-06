package jipa.cristiana.g1098.flyweight;

import java.util.HashMap;

public class SubscriptionFactory {

private static HashMap<ESubscriptionTypes, IFlyweight> subscriptions = new HashMap<>();
	
	public static IFlyweight getSubscription(ESubscriptionTypes type) {
		
		IFlyweight model = subscriptions.get(type);
		if(model == null) {
			
			switch(type) {
			case BASIC_SUBSCRIPTION:
				model = new SubscriptionFlyweight("Basic Subscription", 100, "01.05.2022");
				break;
			case SILVER_SUBSCRIPTION:
				model = new SubscriptionFlyweight("Silver Subscription", 200, "02.05.2022");
				break;
			case GOLD_SUBSCRIPTION:
				model = new SubscriptionFlyweight("Gold Subscription", 300, "03.05.2022");
				break;
			default:
				throw new UnsupportedOperationException();
			}
			subscriptions.put(type, model);
		}
		return model;
	}
}
