package jipa.cristiana.g1098.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookingDanceClassModel bookingBucharestA = new BookingDanceClassModel(EDanceStudios.DS1_BUCHAREST);
		BookingDanceClassModel bookingConstantaB = new BookingDanceClassModel(EDanceStudios.DS4_CONSTANTA);
		
		BookingDanceClassModel booking2BucharestA = (BookingDanceClassModel) bookingBucharestA.clone();
		BookingDanceClassModel booking2ConstantaB = (BookingDanceClassModel) bookingConstantaB .clone();
        
        System.out.println(bookingBucharestA);
        System.out.println(bookingConstantaB);
        System.out.println(booking2BucharestA);
        System.out.println(booking2BucharestA);
        
	}

}
