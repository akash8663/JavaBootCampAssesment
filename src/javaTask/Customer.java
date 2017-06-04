package javaTask;

public class Customer extends Account{
	
	
	//Account acc;
	
	String firstName;
	
	String lastName;
//i assumed empty constructor means default constructor.
	public Customer() {
		this.firstName = "";
		this.lastName = "";
	}
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void addAccount(String firstName, String lastName) {
	
		System.out.println(balance+" "+firstName+" "+lastName);
	}
	
	public void addAccount(Double defaultBalance, String firstName, String lastName) {
		
		balance = defaultBalance;
		System.out.println(balance+" "+firstName+" "+lastName);
	}
}
