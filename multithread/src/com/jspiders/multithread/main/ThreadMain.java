package com.jspiders.multithread.main;

import com.jspiders.multithread.thread.MyThread1;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
	}
}
