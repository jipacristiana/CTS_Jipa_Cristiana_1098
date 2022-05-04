package jipa.cristiana.g1098.builder;

public class BookingDanceClass {
	
	private String clientName;
	private String date;
	private String instructorName;
	private boolean isPrivateDanceClass;
	
	
	private EDanceStudios danceStudios;


	private BookingDanceClass() {}


	private BookingDanceClass(String clientName, String date, String instructorName, boolean isPrivateDanceClass,
			EDanceStudios danceStudios) {
		super();
		this.clientName = clientName;
		this.date = date;
		this.instructorName = instructorName;
		this.isPrivateDanceClass = isPrivateDanceClass;
		this.danceStudios = danceStudios;
	}
	
	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getInstructorName() {
		return instructorName;
	}


	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}


	public boolean isPrivateDanceClass() {
		return isPrivateDanceClass;
	}


	public void setPrivateDanceClass(boolean isPrivateDanceClass) {
		this.isPrivateDanceClass = true;
	}


	public EDanceStudios getDanceStudios() {
		return danceStudios;
	}


	public void setDanceStudios(EDanceStudios danceStudios) {
		this.danceStudios = danceStudios;
	}





	public static class BookingDanceClassBuilder {
		private BookingDanceClass bookingDanceClass;
		
		public BookingDanceClassBuilder(String clientName, String date, String instructorName) {
			this.bookingDanceClass = new BookingDanceClass();
			this.bookingDanceClass.setClientName(clientName);
			this.bookingDanceClass.setDate(date);
			this.bookingDanceClass.setInstructorName(instructorName);
			
		}
		
		
		public BookingDanceClassBuilder setIsPrivateDanceClass(boolean isPrivateDanceClass) {
			this.bookingDanceClass.isPrivateDanceClass = isPrivateDanceClass;
			return this;
		}
		
		public BookingDanceClassBuilder setDanceStudio(EDanceStudios ds) {
			this.bookingDanceClass.danceStudios = ds;
			return this;
		}
		
		public BookingDanceClass build() {
			return this.bookingDanceClass;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookingDanceClass [clientName= ");
		builder.append(clientName);
		builder.append(", date= ");
		builder.append(date);
		builder.append(", instructorName= ");
		builder.append(instructorName);
		builder.append(", isPrivateDanceClass= ");
		builder.append(isPrivateDanceClass);
		builder.append(", danceStudios= ");
		builder.append(danceStudios);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
