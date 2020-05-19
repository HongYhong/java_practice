package com.hongfox.exer4;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account(1001, 10000, 0.01);
		
		account.withdraw(5000);
		System.out.println(account.getBalance());
		account.withdraw(6000);
		account.deposit(5000);
		System.out.println(account.getBalance());
		account.getMonthlyInterest();
	}
}
