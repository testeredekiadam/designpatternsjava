package com.firat.BillPugh;

public class BillPugh {
	
	//an instance attribute
	private int data = 0;
	
	/*
	 * The Singleton Constructor
	 * Note that it is private!
	 * No client can instantiate a Singleton object!
	 * 
	 */
	
	private BillPugh() {}
	
	private static class BillPughHelper{
		//Nested class is referenced after getInstance() is called
		private static final BillPugh uniqueInstance = new BillPugh();
	}
	
	public static BillPugh getInstance() {
		return BillPughHelper.uniqueInstance;
	}
	
	public void setData(int myData) {
		data = myData;
	}
	
	public int getData() {
		return data;
	}
}
