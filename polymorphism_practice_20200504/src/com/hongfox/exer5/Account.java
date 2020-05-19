package com.hongfox.exer5;

public class Account {
	private int id;
	private String pwd = "0000000";
	private double balance;
	
	private static double interestRate;
	private static double minMoney = 1.0;
	private static int init = 1001;
	
	public Account() {
		id = init++;
		interestRate = 1.0;
	}
	
	public Account(String pwd,double balance) {
		this();
		this.balance = balance;
		this.pwd = pwd;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", pwd=" + pwd + ", balance=" + balance + "]";
	}

	public static double getMinMoney() {
		return minMoney;
	}

	public static void setMinMoney(double minMoney) {
		Account.minMoney = minMoney;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}
	
	
}
