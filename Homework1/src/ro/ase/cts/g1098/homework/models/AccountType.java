package ro.ase.cts.g1098.homework.models;

public enum AccountType {
	
	STANDARD(0), BUDGET(1), PREMIUM(2), SUPER_PREMIUM(3);
	
	int id;
	
	private AccountType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	
}
