package jipa.cristiana.g1098.facade;

import jipa.cristiana.g1098.adapter.AdapterBooking;
import jipa.cristiana.g1098.adapter.INewBooking;
import jipa.cristiana.g1098.builder.BookingDanceClass;
import jipa.cristiana.g1098.composite.Employee;
import jipa.cristiana.g1098.composite.InternalDanceStudioStructure;
import jipa.cristiana.g1098.decorator.AbstractBooking;
import jipa.cristiana.g1098.decorator.Booking;
import jipa.cristiana.g1098.decorator.InstructorBookingDecorator;
import jipa.cristiana.g1098.factory.ESubscriptionTypes;
import jipa.cristiana.g1098.factory.FactorySubscription;
import jipa.cristiana.g1098.factory.ISubscription;
import jipa.cristiana.g1098.flyweight.DisplaySubscriptionDetails;
import jipa.cristiana.g1098.flyweight.SubscriptionFactory;
import jipa.cristiana.g1098.flyweight.SubscriptionFlyweight;
import jipa.cristiana.g1098.prototype.BookingDanceClassModel;
import jipa.cristiana.g1098.prototype.EDanceStudios;
import jipa.cristiana.g1098.proxy.ILogin;
import jipa.cristiana.g1098.proxy.Login;
import jipa.cristiana.g1098.proxy.LoginFilterProxy;
import jipa.cristiana.g1098.singleton.DBConnection;



// I have some classes named the same so 2 of the tests won't work in facade only if i comment one of them (but separated work)

public class TestPatternFacade {

	public static void testSingleton() 
	{
		DBConnection dbConnection = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();
        
        if(dbConnection == dbConnection2) {
            System.out.println("Same connection");
        } else {
            System.out.println("Different connections");
        }

	}
	
	
	public static void testFactory()
	{
		ISubscription basicSub = FactorySubscription.createSubscription(ESubscriptionTypes.BASIC_SUBSCRIPTION, "Basic Subscription", 100, "01.05.2022"); 
		ISubscription silverSub = FactorySubscription.createSubscription(ESubscriptionTypes.SILVER_SUBSCRIPTION, "Silver Subscription", 200, "02.05.2022");
		ISubscription goldSub = FactorySubscription.createSubscription(ESubscriptionTypes.GOLD_SUBSCRIPTION, "Gold Subscription", 300, "03.05.2022");
		
		basicSub.buy();
		System.out.println();
		silverSub.buy();
		System.out.println();
		goldSub.buy();
	}
	
	public static void testBuilder()
	{
//
//		BookingDanceClass book2 = new BookingDanceClass.BookingDanceClassBuilder("Cristiana", "11.11.2021", "Marilu Carmen")
//				.setDanceStudio(EDanceStudios.DS1_BUCHAREST)
//				.build();
//		System.out.println(book2);
//			
//
//		BookingDanceClass book3 = new BookingDanceClass.BookingDanceClassBuilder("Cris", "12.12.2021", "David Marin")
//				.setDanceStudio(EDanceStudios.DS1_BUCHAREST)
//				.setIsPrivateDanceClass(true)
//				.build();
//		System.out.println(book3);
	}
	
	public static void testPrototype() throws CloneNotSupportedException
	{
		BookingDanceClassModel bookingBucharestA = new BookingDanceClassModel(EDanceStudios.DS1_BUCHAREST);
		BookingDanceClassModel bookingConstantaB = new BookingDanceClassModel(EDanceStudios.DS4_CONSTANTA);
		
		BookingDanceClassModel booking2BucharestA = (BookingDanceClassModel) bookingBucharestA.clone();
		BookingDanceClassModel booking2ConstantaB = (BookingDanceClassModel) bookingConstantaB .clone();
        
        System.out.println(bookingBucharestA);
        System.out.println(bookingConstantaB);
        System.out.println(booking2BucharestA);
        System.out.println(booking2ConstantaB);
        
	}
	
	public static void testDecorator()
	{
		AbstractBooking abstractBooking = new Booking("Cristiana", "05.05.2022", "Marilu Dana");
		abstractBooking.createBooking();
		AbstractBooking abstractBookingDecorated = new InstructorBookingDecorator(abstractBooking, "Street dance");
		abstractBookingDecorated.createBooking();
	}
	
	public static void testAdapter()
	{
		INewBooking newBooking = new AdapterBooking();
		newBooking.saveNewBooking("06.05.2022");
		newBooking.getNewBooking();
	}
	
	public static void testProxy()
	{
		ILogin appLogin = new Login();

		if(appLogin.checkCredentials("jipacristiana@gmail.com", "cristiana")) {
			System.out.println("Hello Cris");
		}
		
		appLogin = new LoginFilterProxy(3, appLogin);
		
		String[] passwords = {"123", "admin", "root", "cristiana"};
		for(int i = 0; i < 4; i++) {
			if(appLogin.checkCredentials("jipacristiana@gmail.com", passwords[i])) {
				System.out.println("Found the passord: " + passwords[i]);
			}
		}

	}
	
	public static void testFlyweight()
	{
//		SubscriptionFlyweight subscription1 = (SubscriptionFlyweight)SubscriptionFactory.getSubscription(ESubscriptionTypes.BASIC_SUBSCRIPTION);
//		subscription1.displayDetails(new DisplaySubscriptionDetails("10% off for the next 2 months subscription price", 1));
//		System.out.println(" ");
//		
//		SubscriptionFlyweight subscription2 = (SubscriptionFlyweight)SubscriptionFactory.getSubscription(ESubscriptionTypes.SILVER_SUBSCRIPTION);
//		subscription2.displayDetails(new DisplaySubscriptionDetails("20% off for the next month subscription price", 2));
//		System.out.println(" ");
//		
//		SubscriptionFlyweight subscription3 = (SubscriptionFlyweight)SubscriptionFactory.getSubscription(ESubscriptionTypes.GOLD_SUBSCRIPTION);
//		subscription3.displayDetails(new DisplaySubscriptionDetails("30% off for the next month subscription price", 3));
//		System.out.println(" ");
	}
	
	public static void testComposite()
	{
		InternalDanceStudioStructure departamentDance = new InternalDanceStudioStructure("Dance Department", "These are the instructors of the Dance Studio.");
		
		
		InternalDanceStudioStructure teamStreet = new InternalDanceStudioStructure ("Street dance team", "The street dance team");
		
		teamStreet.addChildNode(new Employee("Cris", "HR"));
		teamStreet.addChildNode(new Employee("David", "HR"));
		
	
		departamentDance.addChildNode(new Employee("Marilu", "Department Manager"));
		departamentDance.addChildNode(teamStreet);
	
		System.out.println(departamentDance.getInfo());
	}
	
	
}
