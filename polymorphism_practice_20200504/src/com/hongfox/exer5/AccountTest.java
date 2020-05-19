package com.hongfox.exer5;

public class AccountTest {
	public static void main(String[] args) {
		Account acc1 = new Account("2102011", 10000);
		Account acc2 = new Account("3916500" ,10000);
		
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc1.getInterestRate());
		System.out.println(acc2.getInterestRate());

	}
}
