package com.hongfox.exer1;
//接口练习

public class USBTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		Flash flash = new Flash();
		computer.readData(flash);
		Printer printer = new Printer();
		computer.readData(printer);

		// 匿名实现类的非匿名对象。
		USB phone = new USB() {

			@Override
			public void start() {
				System.out.println("电话启动。");

			}

			@Override
			public void end() {
				System.out.println("电话关闭。");

			}

		};

		computer.readData(phone);

		computer.readData(new USB() {

			@Override
			public void start() {
				System.out.println("电话启动。");

			}

			@Override
			public void end() {
				System.out.println("电话关闭。");

			}

		});
	}
}

class Computer {
	public void readData(USB usb) {
		usb.start();
		readdata();
		usb.end();
	}

	public void readdata() {

	}
}

interface USB {
	void start();

	void end();
}

class Flash implements USB {

	@Override
	public void start() {
		System.out.println("U盘启动。");

	}

	@Override
	public void end() {
		System.out.println("U盘结束。");

	}

}

class Printer implements USB {

	@Override
	public void start() {
		System.out.println("打印机启动。");

	}

	@Override
	public void end() {
		System.out.println("打印机结束。");

	}

}