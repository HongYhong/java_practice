package com.hongfox.exer10;

import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		Employee emps[] = new Employee[2];
		emps[0] = new SalariedEmployee("hong", 1001, new MyDate(1997, 6, 8), 10000);
		emps[1] = new HourEmployee("chen", 1002, new MyDate(1998,5, 5), 50, 240);
		
		for (int i = 0;i < emps.length;i++) {
			System.out.println(emps[i]);
			System.out.println("月工资为："+ emps[i].earning());
			if (month == emps[i].getBirthday().getMonth()) {
				System.out.println("生日快乐，加工资100");
			}
		}
		
		
	}
}
