package oop;

public class BankAccount implements IRate{
	
	String accountNumber;
	//static >> belongs to the CLASS not the object instance
	//final >> constant (often static final) meaning it can't be modified
	private static final String routingNumber = "012546";
	private String name;
	private String ssn;
	private String accountType;
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	int balance;
	
	BankAccount(){
		System.out.println("New Account Created...");
	}
	
	BankAccount(String accountType ){
		System.out.println("New Account : " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("New Account : " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
	}
	
	public void deposit(double amount) {
		balance = (int) (balance + amount);
		showActivity("DEPOSIT");
	}
	
	void withDraw(double amount) {
		
		balance = (int) (balance + amount);
		showActivity("WITHDRAW");
	}
	private void showActivity(String activity) {
		
		System.out.println("Showing recent activity: " + activity);
		System.out.println("Your new balance is: $"+balance);
		
	}
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Interface methods
	public void setRate() {
		
		System.out.println("SETTING RATE");
		
	}
	
	public void increaseRate() {
		
		System.out.println("INCREASING RATE");
	}

}
