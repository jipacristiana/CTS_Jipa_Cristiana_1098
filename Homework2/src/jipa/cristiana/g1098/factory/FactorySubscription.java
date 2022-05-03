package jipa.cristiana.g1098.factory;

public class FactorySubscription {

	public static ISubscription createSubscription(ESubscriptionTypes type, String name, int price, String date) {
		ISubscription subscription = null;
		
		switch(type) {
			case BASIC_SUBSCRIPTION:
				subscription = new Subscription(name, price, date);
				break;
			case SILVER_SUBSCRIPTION:
				subscription = new SubscriptionSilver(name, price, date, SubscriptionSilver.DEFAULT_PRIVATE_DANCE_CLASSES);
				break;
			case GOLD_SUBSCRIPTION:
				subscription = new SubscriptionGold(name, price, date, SubscriptionSilver.DEFAULT_PRIVATE_DANCE_CLASSES, SubscriptionGold.DEFAULT_BONUS);
				break;
			default:
				throw new UnsupportedOperationException("Non-existent subscription");
			
		}
		
		return subscription;
	}
}
