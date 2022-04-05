package ro.ase.cts.g1098.homework.models;

import ro.ase.cts.g1098.homework.interfaces.IRateable;

public class Rate implements IRateable{

	public static final int DAYS_YEAR = 365;
	
	@Override
	public double getMonthlyRate(double loanValue, double rate) {
		return loanValue * rate;
	}

	public double getAnnualRate(int daysYears, double rate, int daysActive) {
		return Math.pow(rate, daysActive / daysYears);
	}

	@Override
	public void showRate(double rate, String rateType) {
		System.out.println(String.format("The " + rateType + " rate value is: %f", rate));
		
	}

	@Override
	public int getDaysYears() {
		return DAYS_YEAR;
	}

}
