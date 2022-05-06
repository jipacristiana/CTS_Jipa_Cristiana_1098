package jipa.cristiana.g1098.adapter;

public class AdapterBooking extends ExistingBooking implements INewBooking{

	@Override
	public void saveNewBooking(String booking) {
		 System.out.println("Making new booking...");
	     this.submitBooking(booking);
		
	}

	@Override
	public void getNewBooking() {
		System.out.println("Making new booking...");
        this.showBooking();
		
	}

}
