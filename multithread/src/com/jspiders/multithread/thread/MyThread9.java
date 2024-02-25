package com.jspiders.multithread.thread;

import com.jspiders.multithread.resource.MyResource1;

public class MyThread9 extends Thread{

	private MyResource1 myResource1;
	
	public MyThread9(MyResource1 myResource1) {
		super();
		this.myResource1 = myResource1;
	}

	@Override
	public void run() {
		myResource1.resource();
	}
}

