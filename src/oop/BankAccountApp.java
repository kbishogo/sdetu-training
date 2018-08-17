package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
	BankAccount acc1 = new BankAccount();
	acc1.accountNumber = "0123456";
	acc1.setName("Roger Hue");
	acc1.balance = 10000;
	
	acc1.deposit(1500);
	acc1.deposit(1500);
	acc1.deposit(1500);
	acc1.withDraw(2000);
	
	acc1.setRate();
	acc1.increaseRate();
		
		/*
		BankAccount newAccount = new BankAccount();
		BankAccount newAccount2 = new BankAccount("Checking Account");
		BankAccount newAccount3 = new BankAccount("Saving Account",5000);*/
		
		/*System.out.println(newAccount.routingNumber);
		System.out.println(newAccount2.routingNumber);
		System.out.println(newAccount3.routingNumber);*/
		
		
		/*Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		*/
		

	}

}
