package com.jspiders.multithread.thread;

public class MyThread10 extends Thread{

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i+". Hello from Thread10");
			if (i == 3) {
				stop();
			}
		}
	}
}
