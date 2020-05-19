package com.hongfox.contact;
/**
 * 
 * @Description A test for array
 * @author yanhong hong Email:a524664992@gmail.com
 * @version v1.0
 * @data 2020年4月14日下午9:47:34
 *
 *
 *
 */

public class ArrayTest {
	/**
	 * @Description
	 * @author yanhong hong Email:a524664992@gmail.com
	 * @version
	 * @data 2020年4月14日下午10:26:21
	 *
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		//静态初始化
		int[] ids = new int[] {1001,1002,1003,1004};
		//动态初始化
		int[] names = new int[10]; 
		System.out.println(names.length);
		for (int i = 0;i < names.length;i++) {
			names[i] = i;
		}
		for (int i = 0;i< names.length;i++) {
			System.out.println(names[i]);
		}
	}
}
