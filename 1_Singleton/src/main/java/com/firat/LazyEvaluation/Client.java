package com.firat.LazyEvaluation;

public class Client {
	public static void main(String[] args) {
		LazyEvaluation s = LazyEvaluation.getInstance();
		
		//set the data value
		s.setData(55);
		
		System.out.println("First reference: " + s);
		System.out.println("Singleton data value is: " + s.getData());

		System.out.println("\n");
		
		//Get another reference to the Singleton.
		//Is is the same object?
		s = null;
		s = LazyEvaluation.getInstance();
		
		System.out.println("First reference: " + s);
		System.out.println("Singleton data value is: " + s.getData());
		
	}
}
