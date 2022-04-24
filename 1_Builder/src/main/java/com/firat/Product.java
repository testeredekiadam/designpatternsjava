package com.firat;

import java.util.LinkedList;

public class Product {
	private LinkedList<String> parts;
	
	public Product () {
		parts = new LinkedList<String>();
	}
	
	public void add (String part) {
		parts.addLast(part);
	}
	
	public void show() {
		System.out.println("\nProduct completed as below");
		
		for(int i = 0; i < parts.size(); i++) {
			System.out.println(parts.get(i));
		}
	}
}
