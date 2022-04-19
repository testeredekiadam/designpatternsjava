package com.firat.BillPugh;

public class Client {
	public static void main(String[] args) {
		BillPugh s = BillPugh.getInstance();
		
		s.setData(55);
		
		System.out.println("Reference: " + s);
		System.out.println("Value: " + s.getData());
		
		s = null;
		s = BillPugh.getInstance();
		
		System.out.println("");
		
		System.out.println("Reference: " + s);
		System.out.println("Value: " + s.getData());
		
	}
}
