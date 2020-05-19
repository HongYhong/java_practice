package error_exception_20200607;

import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/*
一、异常处理
java.lang.Throwable
     |--java.lang.Error：一般不编写
     |--java.lang.Exception：可进行异常处理
           |--编译时异常（Checked）
                 |--IOException
                       |--fileNoFound
           |--运行时异常（Unchecked） 
                 |--NullPointerException
                 |--ArrayIndexOutOfBoundsException
*/

public class ExceptionTest {
	//NullPointerException
	@Test
	public void test1() {
		int arr[] = null;
		System.out.println(arr[0]);
	}
	//ArrayIndexOutOfBounds
	@Test
	public void test2() {
		int arr[] = new int[3];
		System.out.println(arr[3]);
	}
	//ClassCastException
	@Test
	public void test3() {
		Object obj = new Date();
		String str = (String) obj;
	}
	
	//InputMismatchException
	@Test
	public void test4() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(num);
		
	}
}
