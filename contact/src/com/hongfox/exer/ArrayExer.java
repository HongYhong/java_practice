package com.hongfox.exer;

import java.util.Scanner;

/**
 * 
 * @Description 读入成绩，找出最高分，并且给每个分数赋予等级。
 * @author yanhong hong Email:a524664992@gmail.com
 * @version v1.0
 * @data 2020年4月15日上午10:20:08
 *
 *
 *
 */

public class ArrayExer {
	public static void main(String[] args) {
		System.out.println("the number of students:");
		int stdNumber;
		Scanner scan =new Scanner(System.in);
		stdNumber = scan.nextInt();
		
		//build an array with stdNumber elements.
		int stdScores[] = new int[stdNumber];
		//get the scores from the input and get the highest score.
		System.out.println("please input the scores of five students.");
		int maxNumber = 0;
		for (int i = 0;i < stdNumber;i++) {
			stdScores[i] = scan.nextInt();
			if (stdScores[i] > maxNumber) {
				maxNumber = stdScores[i];
			}
		}
		//calculate the grade of students and print.
		char grade;
		for (int i = 0;i < stdNumber;i++) {
			if (maxNumber - stdScores[i] <= 10) {
				grade = 'A';
			}else if(maxNumber - stdScores[i] <=20){
				grade = 'B';
			}else if(maxNumber - stdScores[i] <= 30){
				grade = 'C';
			}else {
				grade = 'D';
			}
			System.out.println("student" + i + "score is "+ stdScores[i] + ",grade is "+ grade);
		}
		
	}
}
