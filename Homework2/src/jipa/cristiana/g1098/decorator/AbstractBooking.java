package jipa.cristiana.g1098.decorator;

public abstract class AbstractBooking {

	protected String clientName;
	protected String date;
	protected String instructorName;
	
	public AbstractBooking(String clientName, String date, String instructorName) {
		super();
		this.clientName = clientName;
		this.date = date;
		this.instructorName = instructorName;
	}



	public abstract void createBooking();
	
}
