package com.hongfox.exer;
/**
 * 
 * @Description 创建Student类，包含age,name,major,interest属性，方法：返回学生的信息。
 * @author yanhong hong Email:a524664992@gmail.com
 * @version
 * @data 2020年4月16日下午10:21:55
 *
 *
 *
 */
public class StudentTest {
	public static void main(String[] args) {
		
		Student hong = new Student();
		hong.name = "hongfox";
		hong.age = 21;
		hong.major = "bioinformatics";
		hong.interest = "games";
		
		
		String output = hong.say();
		System.out.println(output);
		
		Teacher xiao = new Teacher();
		xiao.name = "dongxuan xiao";
		xiao.age = 35;
		xiao.teachAge = 10;
		xiao.course = "math";
		
		System.out.println(xiao.say());
	}
	
}

class Student{
	int age;
	String name;
	String major;
	String interest;
	
	public String say() {
		return "age:" + age + " " + "name:" + name+ "  " + "major:" + major + "   " + "interest:" + interest + "   " ;
	}
}

class Teacher{
	int age;
	String name;
	int teachAge;
	String course;
	
	public String say() {
		return "age:" + age + " " + "name:" + name+ "  " + "teachAge:" + teachAge + "   " + "course:" + course + "   " ;
	}
}


