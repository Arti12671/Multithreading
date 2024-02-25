package com.jspiders.multithread.thread;

import com.jspiders.multithread.resource.Food;

public class Restaurant extends Thread{
	private Food food;

	public Restaurant(Food food) {
		super();
		this.food = food;
	}

	@Override
	public void run() {
		food.order();
	}
}