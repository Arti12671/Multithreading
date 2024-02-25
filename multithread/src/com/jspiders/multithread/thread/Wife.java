package com.jspiders.multithread.thread;

import com.jspiders.multithread.resource.Account;

public class Wife extends Thread{
	
	private Account account;

	public Wife(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run() {
		account.deposit(2000);
		account.withdrow(5000);
	}
}
