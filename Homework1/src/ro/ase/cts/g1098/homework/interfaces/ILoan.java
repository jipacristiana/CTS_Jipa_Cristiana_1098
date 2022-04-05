package ro.ase.cts.g1098.homework.interfaces;

public interface ILoan {
	
	public abstract void showLoan(double loanValue, String loanType);

	public abstract double computeLoanFee(double monthlyRate, double loanValue);

	public abstract double computeLoanFeeExtraTax(double extraTax, double loanFee);
}
