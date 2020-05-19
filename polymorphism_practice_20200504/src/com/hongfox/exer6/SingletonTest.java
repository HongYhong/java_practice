package com.hongfox.exer6;

public class SingletonTest {
	public static void main(String[] args) {
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		System.out.println(bank1 == bank2);
		
	}
}

class Bank {
	private Bank() {
		
	}
	
	private static Bank bank = new Bank();
	
	public static Bank getInstance() {
		return bank;
	}
}
