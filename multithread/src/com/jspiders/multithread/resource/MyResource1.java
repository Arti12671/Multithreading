package com.jspiders.multithread.resource;

public class MyResource1 {
	
	public void resource() {
		System.out.println("Lock is applied by " +Thread.currentThread().getName());
	}
}
