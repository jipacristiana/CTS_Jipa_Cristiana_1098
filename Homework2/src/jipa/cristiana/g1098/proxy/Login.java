package jipa.cristiana.g1098.proxy;

public class Login implements ILogin{

	@Override
	public boolean checkCredentials(String email, String password) {
		System.out.println("Connecting to DB server .....");
		System.out.println("Checking credentials....");
		if(email.equals("jipacristiana@gmail.com") && password.equals("cristiana"))
		{
			return true;
		}
		else {
			return false;
		}
	}

}
