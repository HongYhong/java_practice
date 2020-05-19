package com.hongfox.exer2;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		System.out.println(bank.getNumberOfCustomers());
		
		bank.addCustomers("hong", "fox");
		
		System.out.println(bank.getNumberOfCustomers());
		
		bank.getCustomers(0).setAccount(new Account(100, 1000,0.1));
		
		System.out.println(bank.getCustomers(0).getInfo());
	}
	
}
