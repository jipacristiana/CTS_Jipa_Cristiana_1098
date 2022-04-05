package ro.ase.cts.g1098.homework.models;

public class Account {
	
	public double loanValue;
	public double rate;	
	public int daysActive;
	public AccountType accountType;

	
	public static final float BROKER_FEE = 0.0125f;
	public static final int DAYS_YEAR = 365;
	
	public Account(double loanValue, double rate, AccountType accountType) throws Exception {
		if (loanValue < 0)
			throw new Exception();
		
		this.loanValue = loanValue;
		this.rate = rate;
		this.accountType = accountType;
	}
	
	public static double computeTotalFee(Account[] accounts) {
		Account	account;
		double totalFee = 0.0;
		
		for	(int i= 0; i < accounts.length; i++) {
			account = accounts[i];
			if(account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM) {
				double annualRate = account.computeAnnualRate(account.getRate(), account.getDaysActive());
				double loanFee = account.computeLoanFee(account.getLoanValue(), annualRate);
				double loanFeeWithTax = account.computeLoanFeeExtraTax(BROKER_FEE, loanFee);

				totalFee += loanFeeWithTax;
			}
				
		}
		return	totalFee;
	}
	
	
	public double computeAnnualRate(double rate, double daysActive) {
		return Math.pow(getRate(), getDaysActive() / DAYS_YEAR);
	}
	
	public double computeLoanFee(double loanValue, double annualRate) {
		return (loanValue * annualRate) - loanValue;
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
	
	public String to_string() {
		return "Loan: " + this.loanValue + "; "
				+ "rate: " + this.rate + "; "
				+ "days active:" + daysActive + "; Type: " + accountType + ";";
	}
	
	

	

	
}

