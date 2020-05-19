package com.hongfox.exer;

import java.util.Random;

public class GenerateArray {
	public static void main(String[] args) {
		int i = 0;
		int arr[] = new int[6];
		int myNumber = 0;
		Random r = new Random();
		boolean overlap = false;
		while (i < arr.length) {
			myNumber = r.nextInt(30) + 1;
			//检验是否有重复的
			for (int j = 0; j <= i;j++) {
				if (arr[j] == myNumber) {
					overlap = true;
					break;
				}
			}
			if (overlap == false) {
				arr[i] = myNumber;
			}else {
				overlap = false;
				continue;
			}
			// reset the overlap.
			overlap = false;
			i++;
		}
		for (i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
