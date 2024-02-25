package com.jspiders.multithread.main;

import com.jspiders.multithread.thread.MyThread5;

public class ThreadMain4 {
	public static void main(String[] args) {
		
		MyThread5 myThread5 = new MyThread5();
		myThread5.setName("MyThread5 Class");
		//myThread5.setPriority(0);//IllegalArgumentException
		myThread5.setPriority(8);
		myThread5.start();
	}
}
