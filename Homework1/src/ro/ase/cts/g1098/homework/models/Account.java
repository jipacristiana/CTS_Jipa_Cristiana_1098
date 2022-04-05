package ro.ase.cts.g1098.homework.models;

import ro.ase.cts.g1098.homework.interfaces.IBroker;
import ro.ase.cts.g1098.homework.interfaces.ILoan;
import ro.ase.cts.g1098.homework.interfaces.IRateable;

public class Account {
	
	public double loanValue;
	public double rate;	
	public int daysActive;
	public AccountType accountType;


	
	public IRateable accountRate = null;
	public ILoan accountLoan = null;
	public IBroker broker = null;
	
	public Account(double loanValue, double rate, int daysActive, AccountType accountType) throws Exception {
		if (loanValue < 0)
			throw new Exception();
		
		this.loanValue = loanValue;
		this.rate = rate;
		this.daysActive = daysActive;
		this.accountType = accountType;
	}
	
	public static double computeTotalFee(Account[] accounts) {
		Account	account;
		double totalFee = 0.0;
		
		for	(int i= 0; i < accounts.length; i++) {
			account = accounts[i];
			if(account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM) {
				int daysYears = account.accountRate.getDaysYears();
				double annualRate = account.accountRate.getAnnualRate(daysYears, account.getRate(), (int) account.getDaysActive());
				double monthlyRate = account.accountRate.getMonthlyRate(account.getLoanValue(), annualRate);		
				double loanFee = account.accountLoan.computeLoanFee(daysYears, account.getLoanValue());
				double loanFeeWithTax = account.accountLoan.computeLoanFeeExtraTax(daysYears, loanFee);
				totalFee += loanFeeWithTax;
			}
				
		}
		return	totalFee;
	}
	
	
	
	public double computeLoanFee(double loanValue, double monthlyRate) {
		return monthlyRate - loanValue;
	}
	
	public double computeLoanFeeExtraTax (double extraTax, double loanFee) {
		if (extraTax <= 0)
			loanFee *= extraTax;
		return loanFee;
	}
	
	
	
	
	
	public double getLoanValue() {
		return loanValue;
	}
	
	public void showLoan() {
		System.out.println("The loan value is " + this.loanValue);
	}
	
	
	public double getRate() {
		return this.rate;
	}
	
	public void showRate() {
		System.out.println("The rate is " + rate);
	}
	
	public double getDaysActive() {
		return daysActive;
	}
	
	public void showDaysActive() {
		System.out.println("The active days are " + this.daysActive);
	}
	
	public AccountType getAccountType() {
		return accountType;
	}

	public void showAccount() {
		System.out.println("This is an account");
	}

	
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loanValue*rate;
	}
	
	
	
	public void setLoanValue(double loanValue) throws Exception {
		if(loanValue<0)
			throw new Exception();
		
		this.loanValue = loanValue;
	}
	
	
	
	
	public IRateable getAccountRate() {
		return accountRate;
	}

	public void setAccountRate(IRateable accountRate) {
		this.accountRate = accountRate;
	}

	public String to_string() {
		return "Loan: " + this.loanValue + "; "
				+ "rate: " + this.rate + "; "
				+ "days active:" + daysActive + "; Type: " + accountType + ";";
	}

	public ILoan getAccountLoan() {
		return accountLoan;
	}

	public void setAccountLoan(ILoan accountLoan) {
		this.accountLoan = accountLoan;
	}

	public IBroker getBroker() {
		return broker;
	}

	public void setBroker(IBroker broker) {
		this.broker = broker;
	}
	
	

	

	
}

