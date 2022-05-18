package ro.ase.cts.g1098.design.patterns.observer;

public class NotificationsModule implements ConnectionStatusInterface {

	@Override
	public void lostConnectionNotification(long timeStamp) {
		System.out.println("Notify player!");
		
	}

}
