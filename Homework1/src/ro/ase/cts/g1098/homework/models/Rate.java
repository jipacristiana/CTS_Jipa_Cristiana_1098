package ro.ase.cts.g1098.homework.models;

import ro.ase.cts.g1098.homework.interfaces.IRateable;

public class Rate implements IRateable{

	@Override
	public double getMonthlyRate(double loanValue, double rate) {
		return loanValue * rate;
	}

	@Override
	public double getAnnualRate(int daysYears, double rate, int daysActive) {
		return Math.pow(rate, daysActive / daysYears);
	}

	@Override
	public void showRate(double rate, String rateType) {
		System.out.println(String.format("The " + rateType + " rate value is: %f", rate));
		
	}

}
