package com.hongfox.exer;

public class BoyGirlTest {
	public static void main(String[] args) {
		Boy hong =new Boy("hongfox", 23);
		Girl yang = new Girl("zilin yang",23);
		
		hong.marry(yang);
		
		yang.marry(hong);
		
		hong.shout();
		
		Girl chen = new Girl("chen chen",22);
		
		int compareResult = yang.compare(chen);
		
		if (compareResult > 0) {
			System.out.println("yang is older than chen.");
		}else if (compareResult < 0) {
			System.out.println("yang is younger than chen.");
		}else {
			System.out.println("have equal age.");
		}
	}
}
