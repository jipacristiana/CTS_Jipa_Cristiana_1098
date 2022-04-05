package ro.ase.cts.g1098.homework.models;

public class Account {
	
	public double loanValue, rate;	
	public int daysActive;
	AccountType accountType;
	
	public Account(double loanValue, double rate, AccountType accountType) throws Exception {
		if (loanValue < 0)
			throw new Exception();
		else
			this.loanValue = loanValue;
		
		this.rate = rate;
		this.accountType = accountType;
	}
	
	public static double calculateTotalFee(Account[] accounts) {
		Account	account;
		double totalFee = 0.0;
		
		for	(int i= 0; i < accounts.length; i++) {
			account = accounts[i];
			if(account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM)	
				totalFee += .0125	*	//	1.25%	broker's	fee
				(account.loanValue * Math.pow(account.rate,(account.daysActive/365)) - account.loanValue);	//	interest-principal
		}
		return	totalFee;
	}
	
	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}
	
	public double getRate() {
		System.out.println("The rate is " + rate);
		return this.rate;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loanValue*rate;
	}
	
	public void setLoanValue(double loanValue) throws Exception {
		if(loanValue<0)
			throw new Exception();
		else 
			this.loanValue = loanValue;
	}
	
	public String to_string() {
		return "Loan: " + this.loanValue + "; "
				+ "rate: " + this.rate + "; "
				+ "days active:" + daysActive + "; Type: " + accountType + ";";
	}
	
	public void printAccount() {
		
		System.out.println("This is an account");
	}

	

	
}

