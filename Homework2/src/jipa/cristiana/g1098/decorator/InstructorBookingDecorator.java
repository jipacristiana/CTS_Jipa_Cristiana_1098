package jipa.cristiana.g1098.decorator;

public class InstructorBookingDecorator extends AbstractBookingDecorator {
	
	String danceStyle;
	
	public InstructorBookingDecorator(AbstractBooking abstractBooking, String danceStyle) {
		super(abstractBooking);
		this.danceStyle = danceStyle;
	}

	@Override
	public void createBooking() {
		System.out.println("The instructor teaches " + this.danceStyle);
	}

	
	


	
	
	

}
