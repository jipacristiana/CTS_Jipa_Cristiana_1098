package jipa.cristiana.g1098.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
//		BookingDanceClass book1 = new BookingDanceClass("Cristiana", "11.12.2021", "Marilu Carmen",true, EDanceStudios.DS1_BUCHAREST);
//		System.out.println(book1);
		
		
		BookingDanceClass book2 = new BookingDanceClass.BookingDanceClassBuilder("Cristiana", "11.11.2021", "Marilu Carmen")
				.setDanceStudio(EDanceStudios.DS1_BUCHAREST)
				.build();
		System.out.println(book2);
			

		BookingDanceClass book3 = new BookingDanceClass.BookingDanceClassBuilder("Cris", "12.12.2021", "David Marin")
				.setDanceStudio(EDanceStudios.DS1_BUCHAREST)
				.setIsPrivateDanceClass(true)
				.build();
		System.out.println(book3);
	}
}
