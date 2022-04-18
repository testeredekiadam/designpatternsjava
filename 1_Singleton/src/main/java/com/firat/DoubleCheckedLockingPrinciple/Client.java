package com.firat.DoubleCheckedLockingPrinciple;

public class Client {
	public static void main(String[] args) {
		DoubleCheckedLogin s = DoubleCheckedLogin.getInstance();
		
		s.setData(55);
		
		System.out.println("First reference: " + s);
		System.out.println("Singleton data value is: " + s.getData());
		
		
		System.out.println("\n");
		
		//Get another reference to the Singleton.
		//Is is the same object?
		s = null;
		s = DoubleCheckedLogin.getInstance();
		
		System.out.println("First reference: " + s);
		System.out.println("Singleton data value is: " + s.getData());
	}
}
