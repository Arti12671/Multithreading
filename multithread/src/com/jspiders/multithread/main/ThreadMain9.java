package com.jspiders.multithread.main;

import com.jspiders.multithread.resource.Food;
import com.jspiders.multithread.thread.Customer;
import com.jspiders.multithread.thread.Restaurant;

public class ThreadMain9 {
	
	public static void main(String[] args) {
		Food food = new Food();
		
		Customer customer = new Customer(food);
		customer.start();
		
		Restaurant restaurant = new Restaurant(food);
		restaurant.start();
	}
}
