package com.jspiders.multithread.thread;

public class MyThread5 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Id : "+this.getId());
	}
}
