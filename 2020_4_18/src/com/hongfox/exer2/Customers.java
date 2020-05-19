package com.hongfox.exer2;

public class Customers {
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customers() {
		
	}
	
	public Customers(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getInfo() {
		return "Customer [" + firstName + lastName + " ] \nid:" +  account.getId() + "\nannual Interest rate: " + account.getAnnualInterestRate() + "\nbalance is:" + account.getBalance();
	}
}
