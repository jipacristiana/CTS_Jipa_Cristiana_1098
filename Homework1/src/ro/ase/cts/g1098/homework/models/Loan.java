package ro.ase.cts.g1098.homework.models;

import ro.ase.cts.g1098.homework.interfaces.ILoan;

public class Loan implements ILoan {

	@Override
	public void showLoan(double loanValue, String loanType) {
		System.out.println(String.format("The " + loanType + " loan value is: %f", loanValue));
		
	}

	@Override
	public double computeLoanFee(double monthlyRate, double loanValue) {
		return monthlyRate - loanValue;
	}

	@Override
	public double computeLoanFeeExtraTax(double extraTax, double loanFee) {
		if (extraTax <= 0)
			loanFee *= extraTax * loanFee;
		return loanFee;
	}

}
