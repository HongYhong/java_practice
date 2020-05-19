package com.hongfox.exer;

import java.util.Random;

public class StudentTest {
	public static void main(String[] args) {
		Random rand = new Random();
		Student[] stds = new Student[20];
		
		StudentTest test = new StudentTest();

		// initialization
		for (int i = 0; i < stds.length; i++) {
			stds[i] = new Student();
			stds[i].number = i + 1;
			stds[i].state = rand.nextInt(6) + 1;
			stds[i].score = rand.nextInt(100) + 1;
		}

		// show state = 3
		test.searchState(stds, 3);
		
		// 遍历
		test.print(stds);
		
		//sort
		test.sort(stds);
		
		//遍历
		test.print(stds);

	}

	/**
	 * 
	 * @Description search and print students' info for a given state.
	 * @author yanhong hong Email:a524664992@gmail.com
	 * @version
	 * @data 2020年4月17日上午11:01:28
	 *
	 *
	 * @param stds
	 *
	 */
	public void searchState(Student[] stds, int state) {
		for (int i = 0; i < stds.length; i++) {
			if (stds[i].state == state) {
				String info = stds[i].showInfo();
				System.out.println("student" + (i + 1) + "    " + info);
			}
		}
	}
	
	/**
	 * 
	 * @Description 遍历打印数组。
	 * @author yanhong hong Email:a524664992@gmail.com
	 * @version
	 * @data 2020年4月17日上午11:06:51
	 *
	 *
	 * @param stds
	 *
	 */
	public void print(Student[] stds) {
		for (int i = 0; i < stds.length; i++) {
			String info = stds[i].showInfo();
			System.out.println("student" + (i + 1) + "   " + info);
		}
	}
	
	public void sort(Student[] stds) {
		for (int i = 0; i < stds.length - 1; i++) {
			for (int j = 0; j < stds.length - 1 - i; j++) {
				if (stds[j].score > stds[j + 1].score) {
					Student temp = stds[j];
					stds[j] = stds[j + 1];
					stds[j + 1] = temp;
				}
			}
		}
	}
}

class Student {
	int number;
	int state;
	int score;

	public String showInfo() {
		return "number:" + number + "  " + "state:" + state + "  " + "score:" + score + "  ";
	}
}