package com.hongfox.exer4;

public class CheckAccountTest {
	public static void main(String[] args) {
		CheckAccount checkaccount = new CheckAccount(20000, 1001, 5000, 0.01);
		checkaccount.withdraw(3000);
		checkaccount.withdraw(10000);
		checkaccount.withdraw(15000);
	}
}
