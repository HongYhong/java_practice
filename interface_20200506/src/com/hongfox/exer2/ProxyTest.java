package com.hongfox.exer2;

//代理模式
//与模板设计有点像
//将不确定的部分暴露出来。

public class ProxyTest {
	public static void main(String[] args) {
		ProxyServer proxy = new ProxyServer(new Server());
		proxy.browse();
	}
}

interface Network{
	void browse();
}

class Server implements Network{

	@Override
	public void browse() {
		System.out.println("browsing");
	}
	
}

class ProxyServer implements Network{
	private Network work;
	
	
	public ProxyServer(Network work) {
		super();
		this.work = work;
	}

	public void check() {
		System.out.println("check the network.");
	}
	
	public void close() {
		System.out.println("close the network.");
	}
	
	@Override
	public void browse() {
		check();
		work.browse();
		close();
	}
	
	
}
