package ro.ase.cts.g1098.design.patterns.observer;

public class Main {


	public static void main(String[] args) {
		
		ConnectionModule conModule = new ConnectionModule();
		
		BackupModule backModule = new BackupModule();
		
		conModule.register(backModule);
		conModule.register(new NotificationsModule());
		
		conModule.openConnection();
		
		conModule.unregister(backModule);
		
		conModule.openConnection();
		
	}

}