package com.hongfox.exer4;

public class CheckAccount extends Account {
	private double overdraft;
	
	public CheckAccount(double overdraft,int id,double balance,double annual) {
		super(id, balance, annual);
		this.overdraft = overdraft;
	}
	
	public void withdraw(double amount) {
		if (this.getBalance() >= amount) {
			super.withdraw(amount);
			System.out.println("取钱成功，取钱金额为：" + amount);
		}else if(this.getBalance() + overdraft >= amount) {
			overdraft = overdraft - (amount - this.getBalance());
			System.out.println("透支成功，透支金额为：" + (amount - this.getBalance()));
			this.setBalance(0);
		}else {
			System.out.println("可透支金额不足！");
		}
	}
}
