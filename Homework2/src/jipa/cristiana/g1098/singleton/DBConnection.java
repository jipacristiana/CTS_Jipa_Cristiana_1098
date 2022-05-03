package jipa.cristiana.g1098.singleton;

public class DBConnection {

	private static DBConnection connection;
	
	String ipAddress;
	String username;
	String password;
	
	
	private DBConnection() {
		System.out.println("Connecting into account");
	}



	private DBConnection(String ipAddress, String username, String password) {
		super();
		this.ipAddress = ipAddress;
		this.username = username;
		this.password = password;
	}

	public static synchronized DBConnection getInstance() {
		if(connection == null) {
			connection = new DBConnection();
		}
		
		return connection;
	}

}
