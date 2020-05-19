package com.hongfox.contact;

/**
 * 
 * @Description
 * @author yanhong hong Email:a524664992@gmail.com
 * @version
 * @data 2020年4月15日下午3:07:31
 *
 *
 *
 */
public class TwoDimensionArrayTest {
	public static void main(String[] args) {
		int arr1[][] = new int[][] {{1001,1002},{1110,3344}};
		int arr2[][] = new int[2][3];
		String arr3[][] = new String[2][];
		arr3[0] = new String[] {"lin","hong"};
		arr3[1] = new String[] {"li","chen"};
		for (int i = 0;i < arr1.length ; i++) {
			for (int j = 0;j < arr1[i].length ; j++) {
				System.out.print(arr1[i][j] + "  ");
			}
			System.out.println();
		}
		for (int i = 0;i < arr3.length;i++) {
			for (int j = 0;j < arr3.length;j++) {
				System.out.print(arr3[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
