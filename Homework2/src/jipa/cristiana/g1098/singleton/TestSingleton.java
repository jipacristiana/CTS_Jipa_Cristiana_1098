package jipa.cristiana.g1098.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		DBConnection dbConnection = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();
        
        if(dbConnection == dbConnection2) {
            System.out.println("Same connection");
        } else {
            System.out.println("Different connections");
        }

	}

}
