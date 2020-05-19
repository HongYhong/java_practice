package com.hongfox.exer2;

public class Bank {
	Customers[] custs = new Customers[1000];
	Account[] accountArray = new Account[1000];
	private int numberOfCustomers = 0;
	
	public Bank() {
		
	}
	
	public void addCustomers(String firstName,String lastName) {
		if (this.numberOfCustomers < 1000) {
			custs[numberOfCustomers] = new Customers(firstName, lastName);
			numberOfCustomers += 1;
		}else {
			System.out.println("out of range.");
		}
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customers getCustomers(int index) {
		if (index >= 0 && index < numberOfCustomers) {
			return custs[index];
		}else {
			return null;
		}
	}
}
