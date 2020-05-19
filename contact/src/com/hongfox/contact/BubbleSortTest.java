package com.hongfox.contact;
/**
 * 
 * @Description 冒泡排序的实现。
 * @author yanhong hong Email:a524664992@gmail.com
 * @version
 * @data 2020年4月16日上午10:44:33
 *
 *
 *
 */
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] arr1 = new int[] {-33,42,76,11,-11,44,66,2};
		
		for (int i = 0;i< arr1.length - 1;i++) {
			System.out.print(arr1[i] + "    ");
		}
		
		System.out.println();
		
		//冒泡排序
		int temp;
		for (int i = 0;i < arr1.length - 1;i++) {
			for (int j = 0; j < arr1.length -1 - i; j++) {
				if (arr1[j] > arr1[j + 1]) {
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp; 
				}
			}
		}
		
		//输出
		for (int i = 0;i< arr1.length - 1;i++) {
			System.out.print(arr1[i] + "    ");
		}
	}
}
