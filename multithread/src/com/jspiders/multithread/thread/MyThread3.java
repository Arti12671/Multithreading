package com.jspiders.multithread.thread;

public class MyThread3 extends Thread {
	
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("Hello From MyThread3");
		}
	}
}
