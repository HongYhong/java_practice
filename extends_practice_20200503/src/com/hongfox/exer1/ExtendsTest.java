package com.hongfox.exer1;

public class ExtendsTest {
	public static void main(String[] args) {
		Student s1 = new Student("hong", '男', 23, 216201622, 100, 100, 95);
		System.out.println("average:"+s1.aver()+"max:"+s1.max()+"min:"+s1.min());
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		System.out.println(s1.getNumber());
		System.out.println(s1.getMath());
	}

}
