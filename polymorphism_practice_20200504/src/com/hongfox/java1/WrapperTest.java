package com.hongfox.java1;

import org.junit.Test;

public class WrapperTest {
	@Test
	public void test1() {
		int num = 10;
		String str = String.valueOf(123);
		Integer in1 = new Integer(num);
		Integer in2 = new Integer("123");
		System.out.println(in1.toString());
		System.out.println(in2.toString());
	}
}
