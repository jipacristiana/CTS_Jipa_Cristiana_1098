package jipa.cristiana.g1098.decorator;

public class Booking extends AbstractBooking {

	
	
	public Booking(String clientName, String date, String instructorName) {
		super(clientName, date, instructorName);
	}

	@Override
	public void createBooking() {
		System.out.println("The booking is created on the date " + this.date + " with instructor " 
							+ this.instructorName + " on name " + this.clientName);
		
	}

}
