package jipa.cristiana.g1098.proxy;

public class TestProxy {

	public static void main(String[] args) {
		ILogin appLogin = new Login();

		if(appLogin.checkCredentials("jipacristiana@gmail.com", "cristiana")) {
			System.out.println("Hello Cris");
		}
		
		appLogin = new LoginFilterProxy(3, appLogin);
		
		String[] passwords = {"123", "admin", "root", "cristiana"};
		for(int i = 0; i < 4; i++) {
			if(appLogin.checkCredentials("jipacristiana@gmail.com", passwords[i])) {
				System.out.println("Found the passord: " + passwords[i]);
			}
		}

	}

}
