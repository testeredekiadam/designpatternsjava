package com.firat.LazyEvaluation;

public class LazyEvaluation {
	
	//the private reference to the one and only instance
	private static LazyEvaluation uniqueInstance = null;
	
	//an instance attribute
	private int data = 0;
	
	/*
	 * The Singleton Constructor
	 * Note that it is private!
	 * No client can instantiate a Singleton object!
	 */
	
	private LazyEvaluation() {}
	
	public static LazyEvaluation getInstance() {
		if(uniqueInstance == null)
				uniqueInstance = new LazyEvaluation();
		
		return uniqueInstance;
	}
	
	//add a set data here
	public void setData(int myData) {
		data = myData;
	}
	
	public int getData() {
		return data;
	}
}
