package jipa.cristiana.g1098.decorator;

public class TestDecorator {

	public static void main(String[] args) {

		AbstractBooking abstractBooking = new Booking("Cristiana", "05.05.2022", "Marilu Dana");
		abstractBooking.createBooking();
		AbstractBooking abstractBookingDecorated = new InstructorBookingDecorator(abstractBooking, "Street dance");
		abstractBookingDecorated.createBooking();
		

	}

}
