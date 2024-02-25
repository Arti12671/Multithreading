package com.jspiders.multithread.resource;

public class Account {
	private double accountBalance;
	
	public synchronized void deposit(double amount) {
		System.out.println("Amount of rupees "+amount+" has been credited");
		accountBalance += amount;
		System.out.println("Current Balance in your account is "+accountBalance);
	}
	
	public synchronized void withdrow(double amount) {
		System.out.println("Amount of rupees "+amount+" has been debited");
		accountBalance -= amount;
		System.out.println("Current Balance in your account is "+accountBalance);
	}
}
