package jipa.cristiana.g1098.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		INewBooking newBooking = new AdapterBooking();
		newBooking.saveNewBooking("06.05.2022");
		newBooking.getNewBooking();
		
	}

}
