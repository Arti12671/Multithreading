package com.jspiders.multithread.thread;

import com.jspiders.multithread.resource.Food;

public class Customer extends Thread{
	private Food food;

	public Customer(Food food) {
		super();
		this.food = food;
	}
	
	@Override
	public void run() {
		food.order();
	}
}
