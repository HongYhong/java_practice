package com.hongfox.exer2;

public class Kid extends ManKind {
	private int yearsOld;
	
	public Kid() {
		
	}
	
	public Kid(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	
	public void printAge() {
		System.out.println(this.yearsOld);
	}
	
	@Override
	public void employeed() {
		System.out.println("kid should study and no job");
	}
}
