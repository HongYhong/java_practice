package com.hongfox.exer;
/**
 * 
 * @Description 打印杨辉三角
 * @author yanhong hong Email:a524664992@gmail.com
 * @version
 * @data 2020年4月15日下午9:23:40
 *
 *
 *
 */

public class YangHuiTest {
	public static void main(String[] args) {
		int[][] yangHui = new int[10][];
		//initialization
		for (int i = 0;i < yangHui.length;i++) {
			yangHui[i] = new int[i + 1];
			yangHui[i][0] = 1;
			yangHui[i][i] = 1;
		}
		for (int i = 2;i < yangHui.length;i++) {
			for (int j = 1; j < i;j++) {
				yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
			}
		}
		//print the yanghui array
		for (int i = 0;i < yangHui.length;i++) {
			for (int j = 0; j < yangHui[i].length;j++) {
				System.out.print(yangHui[i][j]+"   ");
			}
			System.out.println();
		}
	}
}
