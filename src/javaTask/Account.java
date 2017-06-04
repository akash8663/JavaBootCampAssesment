package javaTask;

public class Account {

	
	double balance;
	public double deposit(double ammount) {
		
		balance = balance - ammount;
		return balance;
		
	}
	 
	public double withdraw(double ammount) {
		
		balance = balance + ammount;
		return balance;
		
	}

}
