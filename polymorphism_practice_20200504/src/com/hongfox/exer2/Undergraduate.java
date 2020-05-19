package com.hongfox.exer2;

public class Undergraduate extends Student {
	public String major = "IT";
	public String getInfo() {
		return "name:" + name + "age:" + age + "school:" + school + "major:" + major;
	}
}
