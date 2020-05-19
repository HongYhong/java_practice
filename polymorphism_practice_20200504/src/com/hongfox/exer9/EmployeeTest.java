package com.hongfox.exer9;

import org.junit.Test;

public class EmployeeTest {
	@Test
	public void test1(){
		Employee manager = new Manager("hong", 1001, 10000, 1000);
		manager.work();
		Employee worker = new CommonEmployee("chen", 1002, 20000);
		worker.work();
		System.out.println(manager.getId());
		System.out.println(manager.getSalary());
	}
}
