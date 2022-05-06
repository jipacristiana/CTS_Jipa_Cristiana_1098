package jipa.cristiana.g1098.proxy;

import java.util.HashMap;

public class LoginFilterProxy implements ILogin {

	int noAllowedAttempts;
	private ILogin login;
	HashMap<String, Integer> loginCounter = new HashMap<>();
	
	public LoginFilterProxy(int noAllowedAttempts, ILogin login) {
		super();
		this.noAllowedAttempts = noAllowedAttempts;
		this.login = login;
	}


	@Override
	public boolean checkCredentials(String email, String password) {
		Integer noAttempts = loginCounter.get(email);
		if(noAttempts == null) {
			loginCounter.put(email, 0);
			noAttempts = 0;
		}
		
		if(noAttempts >= noAllowedAttempts) {
			System.out.println("Notify user....");
			return false;
		}
		
		boolean isOk = this.login.checkCredentials(email, password);
		
		if(!isOk) {
			noAttempts += 1;
			loginCounter.put(email, noAttempts);
		}
				
		return isOk;	
	}

}
