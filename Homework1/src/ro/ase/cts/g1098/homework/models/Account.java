package ro.ase.cts.g1098.homework.models;

import ro.ase.cts.g1098.homework.exceptions.IllegalLoanException;
import ro.ase.cts.g1098.homework.exceptions.MissingBrokerException;
import ro.ase.cts.g1098.homework.exceptions.MissingLoanException;
import ro.ase.cts.g1098.homework.exceptions.MissingRateException;
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
	
	public Account(double loanValue, double rate, int daysActive, AccountType accountType) throws IllegalLoanException {
		if (loanValue < 0)
			throw new IllegalLoanException();
		
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
				double loanFee = account.accountLoan.computeLoanFee(monthlyRate, account.getLoanValue());
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
		
	public double getRate() {
		return this.rate;
	}
	
	public double getDaysActive() {
		return daysActive;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}

	
	public void setLoanValue(double loanValue) throws IllegalLoanException {
		if(loanValue<0)
			throw new IllegalLoanException();
		
		this.loanValue = loanValue;
	}
	

	public void setAccountRate(IRateable accountRate) throws MissingRateException {
		if(accountRate == null) 
			throw new MissingRateException();

		this.accountRate = accountRate;
	}

	public void setAccountLoan(ILoan accountLoan) throws MissingLoanException  {
		if(accountRate == null) 
			throw new MissingLoanException();

		this.accountLoan = accountLoan;
	}

	public void setBrokerInfo(IBroker broker) throws MissingBrokerException {

		if(broker == null) 
			throw new MissingBrokerException();
		
		this.broker= broker;
	}
	

	@Override
	public String toString() {
		return "Account [loanValue=" + loanValue + ", rate=" + rate + ", daysActive=" + daysActive + ", accountType="
				+ accountType + ", accountRate=" + accountRate + ", accountLoan=" + accountLoan + ", broker=" + broker
				+ "]";
	}

	
}

