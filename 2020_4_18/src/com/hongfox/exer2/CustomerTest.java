package com.hongfox.exer2;

public class CustomerTest {
	public static void main(String[] args) {
		Customers hong = new Customers("fox", "hong");
		
		Account hongAccount = new Account(1001, 1000, 0.1);
		
		hong.setAccount(hongAccount);
		
		hong.getAccount().deposit(100);
		
		hong.getAccount().withdraw(400);
		
		hong.getAccount().withdraw(2000);
		
		System.out.println(hong.getInfo());
	}
}
