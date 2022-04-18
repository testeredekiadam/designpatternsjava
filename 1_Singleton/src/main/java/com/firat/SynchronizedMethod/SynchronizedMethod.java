package com.firat.SynchronizedMethod;

public class SynchronizedMethod {
	
	public static SynchronizedMethod uniqueInstance = null;
	
	private int data = 0;
	/*
	 * By adding the synchronized keyword to getInstance(),
	 * we force every thread to wait for its turn before it can enter the method
	 */
	
	private SynchronizedMethod() {}
	
	public static synchronized SynchronizedMethod getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new SynchronizedMethod();
		}
		
		return uniqueInstance;
	}
	
	public void setData(int myData) {
		data = myData;
	}
	
	public int getData() {
		return data;
	}
	
}
