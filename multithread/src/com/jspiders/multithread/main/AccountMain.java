package com.jspiders.multithread.main;

import com.jspiders.multithread.resource.Account;
import com.jspiders.multithread.thread.Husband;
import com.jspiders.multithread.thread.Wife;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		Husband husband = new Husband(account);
		Wife wife = new Wife(account);
		
		husband.start();
		wife.start();
	}
}
