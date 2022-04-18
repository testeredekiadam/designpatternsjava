package com.firat.DoubleCheckedLockingPrinciple;

public class DoubleCheckedLogin {
	//the private reference to the one and only instance
	private volatile static DoubleCheckedLogin uniqueInstance = null;
	
	//an instance attribute
	private int data = 0;
	
	/*
	 * The Singleton Constructor
	 * Note that it is private!
	 * No client can instantiate a Singleton object;
	 */
	
	private DoubleCheckedLogin() {}
	
	public static DoubleCheckedLogin getInstance() {
		if(uniqueInstance == null) {
			synchronized(DoubleCheckedLogin.class) { //We only synchronize the first time through
				if(uniqueInstance == null) {
					uniqueInstance = new DoubleCheckedLogin();
				}
			}
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
