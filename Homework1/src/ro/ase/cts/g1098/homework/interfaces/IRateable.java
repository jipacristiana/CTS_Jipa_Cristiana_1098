package ro.ase.cts.g1098.homework.interfaces;

public interface IRateable {
	

	// must have method - the lead has requested it in all classes
	public abstract double getMonthlyRate(double loanValue, double rate);

	public abstract double getAnnualRate(int daysYears, double rate, double daysActive);
	
	public abstract void showRate(double rate, String rateType);
		
}
