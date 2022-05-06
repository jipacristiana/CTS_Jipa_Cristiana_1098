package jipa.cristiana.g1098.adapter;

public class ExistingBooking implements IExistingBooking {

	@Override
	public void submitBooking(String booking) {
		System.out.println("Checking booking...");
        System.out.println(booking + " successfully submitted!");
		
	}

	@Override
	public void showBooking() {
		 System.out.println("Showing available booking from DB...");
		
	}

}
