package jipa.cristiana.g1098.decorator;

public class AbstractBookingDecorator extends AbstractBooking {
	
	
	protected AbstractBooking abstractBooking;
	
	
	public AbstractBookingDecorator(AbstractBooking abstractBooking) {
		super(abstractBooking.clientName, abstractBooking.date, abstractBooking.instructorName);
		this.abstractBooking = abstractBooking;
	}


	@Override
	public void createBooking() {
		this.abstractBooking.createBooking();
		
	}

}
