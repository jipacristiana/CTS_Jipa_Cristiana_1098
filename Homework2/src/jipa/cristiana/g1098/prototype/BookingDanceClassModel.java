package jipa.cristiana.g1098.prototype;

import jipa.cristiana.g1098.prototype.EDanceStudios;

public class BookingDanceClassModel implements Cloneable{

	private String bookingContent;
	private EDanceStudios danceStudios;
	
	public BookingDanceClassModel() {}

	public BookingDanceClassModel(EDanceStudios danceStudios) {
		 try {
	            Thread.currentThread().sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        this.danceStudios = danceStudios;
	        this.bookingContent = "Information from DB";
	        System.out.println("Displaying the information of the booking.");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		BookingDanceClassModel copy = new BookingDanceClassModel();
		copy.danceStudios = this.danceStudios;
		copy.bookingContent = this.bookingContent;
		return copy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookingDanceClassModel [bookingContent=");
		builder.append(bookingContent);
		builder.append(", danceStudios=");
		builder.append(danceStudios);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
}
