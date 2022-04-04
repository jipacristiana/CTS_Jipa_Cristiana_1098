package ro.ase.csie.cts.g1098.design.patterns.singleton;

public class DBConnection {
	
	//all should be private!
	private static DBConnection connection;
	
	String iPAddress;
	String userName;
	String userPassword;
	
	//change from public to private!!!!
	private DBConnection(String iPAddress, String userName, String userPassword) {
		super();
		this.iPAddress = iPAddress;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	
	private DBConnection() {
		
	}
	
	
	public static synchronized DBConnection getInstance() {
		if(connection == null) {
			connection = new DBConnection();
		}
		
		return connection;
	}

}
